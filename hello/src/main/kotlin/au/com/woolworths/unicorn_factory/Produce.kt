package au.com.woolworths.unicorn_factory


sealed class Produce {
    abstract val name: String

    data class Vegetable(
        override val name: String,
        val color: String,
        val isRoot: Boolean,
    ) : Produce()


    data class Cereal(
        override val name: String,
        val brand: String
    ) : Produce()
}
