plugins {
    kotlin("jvm") version "1.6.10"
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
    kotlinOptions.jvmTarget = "16"
}

java {
    toolchain {
        targetCompatibility = JavaVersion.VERSION_16
    }
}


val generatingSourceSet = sourceSets["mainGenerator"]!!
val generatingConfig = configurations[generatingSourceSet.implementationConfigurationName]!!
dependencies {
    testImplementation(kotlin("test"))
    api("com.github.knk190001:kotlin-winrt-generator:0.1.7")
    generatingConfig("com.github.knk190001:kotlin-winrt-generator:0.1.7")
}



tasks.test {
    useJUnitPlatform()
}

buildscript {
    dependencies {
        classpath("com.github.knk190001:GradleCodeGenerator:1.0.5")
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