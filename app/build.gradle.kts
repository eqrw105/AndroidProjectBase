plugins {
    id("base.android.application")
}

android {
    namespace = "com.smin.base"

    defaultConfig {
        applicationId = "com.smin.base"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(projects.feature.main)
}