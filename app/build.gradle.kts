

plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.brainset.taskcalendar"
    compileSdk = 34



    defaultConfig {
        applicationId = "com.brainset.taskcalendar"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro")
        }
    }


    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    //Glide
    implementation ("com.github.bumptech.glide:glide:4.16.0")

    //Room DB
    implementation("androidx.room:room-runtime:2.6.1")
    annotationProcessor("androidx.room:room-compiler:2.6.1")

    //Alarm Manager
    implementation ("com.github.zubairehman:AlarmManager:v1.2.0-alpha01")


    //Calligraphy
    implementation ("io.github.inflationx:calligraphy3:3.1.1")
    implementation ("io.github.inflationx:viewpump:2.1.1")

    //Calendar
    implementation ("com.applandeo:material-calendar-view:1.9.2")
}