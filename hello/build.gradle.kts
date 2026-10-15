plugins {
    id("org.jetbrains.kotlin.jvm") version "2.4.20"
    id("org.jetbrains.kotlin.plugin.serialization") version "2.4.20"
    application
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.9.0")
}

application {
    mainClass.set("au.com.woolworths.unicorn_factory.HelloKt")
}
