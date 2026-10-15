package au.com.woolworths.unicorn_factory

import kotlinx.serialization.json.Json

fun main() {
    println("Hello, world!")
    val fruit = Fruit(
        name = "Banana",
        color = "yellow",
        isSweet = true,
        // origin = null,
    )
    println(Json.encodeToString(fruit))
}
