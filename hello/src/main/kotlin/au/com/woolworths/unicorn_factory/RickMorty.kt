package au.com.woolworths.unicorn_factory

import kotlinx.coroutines.runBlocking

fun main(){


    runBlocking { printThings() }

}


suspend fun printThings(){
    val repository = RickAndMortyRepository()

    repository.getCharactersById("1")
        .let{ println(it) }

    repository.getCharacterByName("morty")
        ?.map {  it.toString() }
        ?.forEachIndexed { index, string -> println("index $index - $string") }
}