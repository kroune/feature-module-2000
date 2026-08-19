package com.logic

import org.gradle.api.Plugin
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.kotlin.dsl.configure
import org.gradle.api.tasks.compile.JavaCompile
import org.gradle.jvm.toolchain.JavaLanguageVersion
import org.gradle.jvm.toolchain.JavaToolchainService
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.withType

class CompositeBuildPluginAndroidApp : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.application")



                apply("org.jetbrains.kotlin.plugin.compose")
            }

            extensions.configure<com.android.build.api.dsl.ApplicationExtension> {
                namespace = "com.awesomeapp." + target.name.replace(":", "_").replace("-", "")
                compileSdk = 37
                defaultConfig {
                    applicationId = "com.awesomeapp." + target.name.replace(":", "_").replace("-", "")
                    minSdk = 24
                    targetSdk = 36
                    versionCode = 1
                    versionName = "1.0"
                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                }
                buildTypes {
                    getByName("release") {
                        isMinifyEnabled = false
                        proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
                    }
                }
                buildFeatures {
                    compose = true
                }
                compileOptions {
                    sourceCompatibility = JavaVersion.VERSION_21
                    targetCompatibility = JavaVersion.VERSION_21
                }
            }
            target.extensions.getByType(JavaPluginExtension::class.java).apply {
                toolchain.languageVersion.set(org.gradle.jvm.toolchain.JavaLanguageVersion.of(21))
            }


            dependencies {

            }
        }
    }
}
