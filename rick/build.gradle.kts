plugins {
    id("org.jetbrains.kotlin.multiplatform") version "2.4.20"
    id("com.android.kotlin.multiplatform.library") version "9.4.1"
    id("org.jetbrains.kotlin.plugin.serialization") version "2.4.20"
    id("com.apollographql.apollo") version "5.2.0"
}

kotlin {
    jvm()

    androidLibrary {
        namespace = "au.com.woolworths.unicorn_factory.rick"
        compileSdk = 35
        minSdk = 24
    }

    sourceSets {
        commonMain.dependencies {
            implementation(libs.kotlinx.serialization.json)
            api("com.apollographql.apollo:apollo-runtime:5.2.0")
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")
        }
        commonTest.dependencies {
            implementation("org.jetbrains.kotlin:kotlin-test")
        }
    }
}

fun getMeBearerCode() : String {
    return "12345"
}

apollo {
    service("rickandmorty") {
        packageName.set("au.com.woolworths.unicorn_factory.rickandmorty")
        introspection {
            endpointUrl.set("https://rickandmortyapi.com/graphql")
            schemaFile.set(file("src/commonMain/graphql/rickandmorty/schema.graphqls"))
//            headers.set(mapOf( "Bearer" to  getMeBearerCode()))
        }
    }
}
