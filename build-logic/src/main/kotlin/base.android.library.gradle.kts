import com.smin.base.configureHiltAndroid
import com.smin.base.configureKotlinAndroid
import com.smin.base.libs

plugins {
    id("com.android.library")
}

android {
    val libs = project.extensions.libs

    defaultConfig {
        compileSdk = Integer.parseInt(libs.findVersion("compileSdk").get().toString())
        minSdk = Integer.parseInt(libs.findVersion("minSdk").get().toString())
        consumerProguardFiles("consumer-rules.pro")
    }
}

dependencies {

}

configureKotlinAndroid()
configureHiltAndroid()