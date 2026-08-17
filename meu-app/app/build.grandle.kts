plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    namespace = "com.exemplo.meuapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.exemplo.meuapp"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation("androidx.activity:activity-compose:1.9.3")
    implementation("androidx.compose.material3:material3:1.3.1")
}
