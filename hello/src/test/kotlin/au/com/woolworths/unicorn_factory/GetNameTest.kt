package au.com.woolworths.unicorn_factory

import kotlin.test.Test
import kotlin.test.assertEquals

class ProduceTest {

    private val basket: List<Produce> = listOf(
        Produce.Vegetable("Onion", "brown", isRoot = false),
        Produce.Vegetable("Carrot", "orange", isRoot = true),
        Produce.Cereal("Cornflakes", "Kellogg's"),
        Produce.Cereal("Rice", "India Gate"),
    )

    @Test
    fun testFilterCereal() {

        val expectedCereals = listOf(
            Produce.Cereal("Cornflakes", "Kellogg's"),
            Produce.Cereal("Rice", "India Gate"),
        )

        val actualCereals = filterCereal(basket)

        assertEquals(2, actualCereals.size)
        assertEquals(expectedCereals, actualCereals)
    }

    @Test
    fun testFilterByName() {
        val expectedProduce = listOf(
            Produce.Vegetable("Carrot", "orange", isRoot = true),
        )

        val actualProduce = filterName(basket, "Carrot")

        assertEquals(1, actualProduce.size)
        assertEquals(expectedProduce, actualProduce)
    }

    @Test
    fun testGetName() {
        val expectedNames = listOf(
            "Onion", "Carrot", "Cornflakes", "Rice",
        )

        val actualNames = getName(basket)

        assertEquals(expectedNames, actualNames)
    }

}