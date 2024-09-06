package com.smin.base

import com.android.build.gradle.BaseExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

internal fun Project.configureKotlinAndroid() {
    with(pluginManager) {
        apply("org.jetbrains.kotlin.android")
    }

    extensions.getByType<BaseExtension>().apply {
        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_17
            targetCompatibility = JavaVersion.VERSION_17
        }
    }
    configureKotlin()
}