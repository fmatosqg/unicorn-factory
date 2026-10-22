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

fun filterCereal(produceList: List<Produce>): List<Produce.Cereal> {
    return produceList.filterIsInstance<Produce.Cereal>()
}

fun filterName(produceList: List<Produce>, name: String): List<Produce> {
    return produceList.filter { true }
}

fun getName(produceList: List<Produce>): List<String> {
    return produceList.map { it.toString() }
}
