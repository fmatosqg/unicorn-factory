plugins {
    id("org.jetbrains.kotlin.jvm") version "2.4.20"
    id("org.jetbrains.kotlin.plugin.serialization") version "2.4.20"
    id("com.apollographql.apollo") version "5.2.0"
}

dependencies {
    implementation(libs.kotlinx.serialization.json)


    implementation("com.apollographql.apollo:apollo-runtime:5.1.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
}


apollo {
    service("rickandmorty") {
        packageName.set("au.com.woolworths.unicorn_factory.rickandmorty")
        introspection {
            endpointUrl.set("https://rickandmortyapi.com/graphql")
            schemaFile.set(file("src/main/graphql/rickandmorty/schema.graphqls"))
        }
    }
}
