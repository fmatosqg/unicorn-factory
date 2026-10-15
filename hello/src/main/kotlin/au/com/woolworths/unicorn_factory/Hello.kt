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

    Fruit(
        name = "Apple",
        color = "red",
        isSweet = true
    )
        .let { Json.encodeToString(it) }
        .let { println(it) }
}
