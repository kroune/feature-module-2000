plugins {
    `kotlin-dsl`
    kotlin("jvm") version "2.4.0"
}

dependencies {
    implementation(libs.kotlin.plugin)
    implementation(libs.kotlin.compose.plugin)


                implementation(libs.android.gradle.plugin)


}


gradlePlugin {
    plugins {
        register("androidLibPlugin") {
            id = "awesome.androidlib.plugin"
            implementationClass = "com.logic.CompositeBuildPluginAndroidLib"
        }
        register("androidKmpLibPlugin") {
            id = "awesome.android.kmp.lib.plugin"
            implementationClass = "com.logic.CompositeBuildPluginAndroidKmpLib"
        }
    }
}
gradlePlugin {
    plugins {
        register("androidAppPlugin") {
            id = "awesome.androidapp.plugin"
            implementationClass = "com.logic.CompositeBuildPluginAndroidApp"
        }
    }
}
