package com.smin.base

import com.android.build.gradle.BaseExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.kotlin.compose.compiler.gradle.ComposeCompilerGradlePluginExtension

internal fun Project.configureComposeAndroid() {
    with(pluginManager) {
        apply("androidx.navigation.safeargs.kotlin")
        apply("org.jetbrains.kotlin.plugin.compose")
    }

    val libs = extensions.libs

    extensions.getByType<BaseExtension>().apply {
        buildFeatures.apply {
            compose = true
        }
    }

    extensions.getByType<ComposeCompilerGradlePluginExtension>().apply {
        enableStrongSkippingMode.set(true)
        includeSourceInformation.set(true)
    }

    dependencies {
        val bom = libs.findLibrary("androidx.compose.bom").get()
        add("implementation", platform(bom))
        add("androidTestImplementation", platform(bom))

        add("implementation", libs.findLibrary("androidx.activity.compose").get())
        add("implementation", libs.findLibrary("androidx.ui").get())
        add("implementation", libs.findLibrary("androidx.ui.graphics").get())
        add("debugImplementation", libs.findLibrary("androidx.ui.tooling").get())
        add("debugImplementation", libs.findLibrary("androidx.ui.test.manifest").get())
        add("androidTestImplementation", libs.findLibrary("androidx.ui.test.junit4").get())
        add("implementation", libs.findLibrary("androidx.material3").get())
        add("implementation", libs.findLibrary("androidx.lifecycle.runtime.compose").get())
        add("implementation", libs.findLibrary("androidx.lifecycle.runtime.viewmodel.compose").get())
        add("implementation", libs.findLibrary("androidx.compose.navigation").get())
    }
}