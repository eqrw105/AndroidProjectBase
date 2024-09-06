import com.smin.base.configureHiltAndroid
import com.smin.base.configureKotlinAndroid
import com.smin.base.libs

plugins {
    id("base.android.library")
    id("base.android.compose")
}

android {
    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

configureKotlinAndroid()
configureHiltAndroid()

dependencies {
    val libs = project.extensions.libs
    implementation(project(":core:designsystem"))

    implementation(libs.findLibrary("androidx.core.ktx").get())
    implementation(libs.findLibrary("kotlinx.serialization.json").get())
}