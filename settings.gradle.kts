
rootProject.name = "windows-kt"

pluginManagement {
    repositories {
        gradlePluginPortal()

        maven {
            url = uri("https://sfxdev-101802139621.d.codeartifact.us-west-2.amazonaws.com/maven/KotlinWinRT/")
            credentials {
                username = "aws"
                password = System.getenv("CODEARTIFACT_AUTH_TOKEN")
            }
        }
    }
}