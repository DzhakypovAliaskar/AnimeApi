pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()

        maven { url = uri("https://jitpack.io") }
    }
}

dependencyResolutionManagement {

    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        maven("bla-bla")
        maven { url = uri("https://jitpack.io") }
    }
}


rootProject.name = "AnimeApi"
include(":app")
enableFeaturePreview("VERSION_CATALOGS")
include(":domain")
include(":data")
include(":data")
include(":domain")
