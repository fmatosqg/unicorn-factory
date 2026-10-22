package au.com.woolworths.unicorn_factory

fun filterCereal(produceList: List<Produce>): List<Produce.Cereal> {
    return produceList.filterIsInstance<Produce.Cereal>()
}

fun filterName(produceList: List<Produce>, name: String): List<Produce> {
    return produceList.filter { true }
}

fun getName(produceList: List<Produce>): List<String> {
    return produceList.map { it.toString() }
}

fun getDescription(produceList: List<Produce>): List<String> {
    TODO("Not implemented")
}
