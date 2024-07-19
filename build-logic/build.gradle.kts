plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

dependencies {
    implementation(libs.android.gradle.plugin)
    implementation(libs.kotlin.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("androidHilt") {
            id = "base.android.hilt"
            implementationClass = "com.smin.base.HiltAndroidPlugin"
        }
        register("kotlinHilt") {
            id = "base.kotlin.hilt"
            implementationClass = "com.smin.base.HiltKotlinPlugin"
        }
    }
}