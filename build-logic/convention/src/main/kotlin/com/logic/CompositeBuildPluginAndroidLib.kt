package com.logic

import org.gradle.api.Plugin
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class CompositeBuildPluginAndroidLib : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.library")



                apply("org.jetbrains.kotlin.plugin.compose")
            }

            extensions.configure<com.android.build.api.dsl.LibraryExtension> {
                namespace = "com.awesomeapp." + target.name.replace(":", "_").replace("-", "")
                compileSdk = 37
                defaultConfig {
                    minSdk = 24
                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                }
                buildTypes {
                    getByName("release") {
                        isMinifyEnabled = false
                        proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
                    }
                }
                compileOptions {
                    sourceCompatibility = JavaVersion.VERSION_21
                    targetCompatibility = JavaVersion.VERSION_21
                }
                buildFeatures {
                    compose = true
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
