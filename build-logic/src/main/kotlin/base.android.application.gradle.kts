import com.smin.base.configureHiltAndroid
import com.smin.base.configureKotlinAndroid
import com.smin.base.libs

plugins {
    id("com.android.application")
}

android {
    val libs = project.extensions.libs
    compileSdk = Integer.parseInt(libs.findVersion("compileSdk").get().toString())

    defaultConfig {
        targetSdk = Integer.parseInt(libs.findVersion("targetSdk").get().toString())
        minSdk = Integer.parseInt(libs.findVersion("minSdk").get().toString())
        versionCode = Integer.parseInt(libs.findVersion("versionCode").get().toString())
        versionName = libs.findVersion("versionName").get().toString()
    }
}

configureKotlinAndroid()
configureHiltAndroid()