
rootProject.name = "windows-kt"

includeBuild("../TestABIGen")
includeBuild("../windows-kt")

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://jitpack.io")
    }
}
