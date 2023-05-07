import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.21"
    `maven-publish`
}

apply(plugin = "com.github.knk190001.gradle-code-generator-kotlin")

group = "com.github.knk190001"
version = "0.1.1"

repositories {
    mavenCentral()
    maven("https://jitpack.io")


    maven {
        url = uri("https://sfxdev-101802139621.d.codeartifact.us-west-2.amazonaws.com/maven/KotlinWinRT/")
        credentials {
            username = "aws"
            password = System.getenv("CODEARTIFACT_AUTH_TOKEN")
        }
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.freeCompilerArgs += "-Xjvm-default=all"
    kotlinOptions.suppressWarnings = true
}

java {
    toolchain {
        vendor.set(JvmVendorSpec.ADOPTIUM)
        languageVersion.set(JavaLanguageVersion.of(19))
    }
}

kotlin {
    sourceSets.all {
        languageSettings {
            languageVersion = "2.0"
        }
    }
}

tasks.withType<org.gradle.jvm.tasks.Jar> {
    this.isZip64 = true
}

val generatingSourceSet = sourceSets["mainGenerator"]!!
val generatingConfig = configurations[generatingSourceSet.implementationConfigurationName]!!
dependencies {
    testImplementation(kotlin("test"))
    api("com.github.knk190001:kotlin-winrt-generator:0.1.7")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.8.21")
    generatingConfig("com.github.knk190001:kotlin-winrt-generator:0.1.7")
    generatingConfig("org.jetbrains.kotlin:kotlin-reflect:1.6.21")

}

tasks.test {
    useJUnitPlatform()
}

buildscript {
    dependencies {
        classpath("com.github.knk190001:GradleCodeGenerator:1.1.0")
    }
}

publishing {
    repositories {
        maven {
            url = uri("https://sfxdev-101802139621.d.codeartifact.us-west-2.amazonaws.com/maven/KotlinWinRT/")
            credentials {
                username = "aws"
                password = System.getenv("CODEARTIFACT_AUTH_TOKEN")
            }
        }
    }

    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "19"
}