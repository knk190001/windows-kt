plugins {
    kotlin("jvm") version "1.6.10"
}

apply(plugin = "com.github.knk190001.kotlin-winrt-gradle-plugin")

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

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

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.github.knk190001:kotlin-winrt-generator:0.1.2")
}

tasks.test {
    useJUnitPlatform()
}

buildscript {
    dependencies {
        classpath("com.github.knk190001:KotlinWinRTGradle:0.1.3")
    }
}

