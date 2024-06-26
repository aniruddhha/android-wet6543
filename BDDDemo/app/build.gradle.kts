plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.ani.bdddemo"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ani.bdddemo"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

//        testApplicationId = "com.ani.bdddemo.test"
        testInstrumentationRunner = "io.cucumber.android.runner.CucumberAndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    androidTestImplementation ("io.cucumber:cucumber-android:7.14.0") // Cucumber Android
    androidTestImplementation ("io.cucumber:cucumber-picocontainer:7.14.0")
    androidTestImplementation ("androidx.test:runner:1.4.0")
//    androidTestImplementation ("androidx.test.uiautomator:uiautomator:2.2.0")


//    androidTestUtil ("androidx.test:orchestrator:1.4.2")
}