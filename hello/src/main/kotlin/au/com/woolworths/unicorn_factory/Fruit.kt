package au.com.woolworths.unicorn_factory

import kotlinx.serialization.Serializable

@Serializable
data class Fruit(
    val name: String,
    val color: String,
    val isSweet: Boolean,
    val origin: String? = null,
)
