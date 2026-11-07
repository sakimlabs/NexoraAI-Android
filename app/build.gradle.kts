plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "xyz.sakim.nexora"
    compileSdk = 34

    defaultConfig {
        applicationId = "xyz.sakim.nexora"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        // Chat site URL
        buildConfigField("String", "APP_URL", "\"https://chat.sakim.xyz/\"")
    }

    buildFeatures { buildConfig = true }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
}
