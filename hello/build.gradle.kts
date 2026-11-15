plugins {
    id("org.jetbrains.kotlin.jvm") version "2.4.20"
    id("org.jetbrains.kotlin.plugin.serialization") version "2.4.20"
//    id("com.apollographql.apollo") version "5.2.0"
    application
}

println("aaa")

dependencies {

   implementation(project(":rick"))

//    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.9.0")
//    implementation(group = "org.jetbrains.kotlin" , name = "kotlinx-serialization" , version = "1.9.0")
    implementation(libs.kotlinx.serialization.json)


//    implementation("com.apollographql.apollo:apollo-runtime:5.2.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
}



application {
    mainClass.set("au.com.woolworths.unicorn_factory.HelloKt")
}
