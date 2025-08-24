
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.lingbao"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.lingbao"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "0.1.0"
    }

    buildTypes {
        debug {
            // no minify for debug
        }
        release {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    packagingOptions {
        resources.excludes += setOf("META-INF/DEPENDENCIES", "META-INF/LICENSE")
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.activity:activity-ktx:1.9.2")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.0")
    // ML Kit Text Recognition as optional (commented out to avoid network dependency issues on CI)
    // implementation("com.google.mlkit:text-recognition:16.0.0")
}
