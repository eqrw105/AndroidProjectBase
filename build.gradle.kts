buildscript {
    repositories {
        google()
    }
    dependencies {
        classpath(libs.androidx.compose.navigation.safe.args.plugin)
        classpath(libs.kotlin.serialization)
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose.compiler) apply false
    alias(libs.plugins.hilt) apply false
    alias(libs.plugins.ksp) apply false
}