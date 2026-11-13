package au.com.woolworths.unicorn_factory

import au.com.woolworths.unicorn_factory.rickandmorty.CharacterByIdQuery
import au.com.woolworths.unicorn_factory.rickandmorty.CharactersPageQuery
import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.api.Optional


class RickAndMortyRepository {

    suspend fun getCharactersById(id:String ): CharacterByIdQuery.Character? {
      return buildClient()
          .query(CharacterByIdQuery(id = id))
          .execute().data?.character
    }

    suspend fun getCharacterByName(name: String): List<CharactersPageQuery.Result?>? {
        return buildClient()
            .query(CharactersPageQuery(name = Optional.present(name)))
            .execute().data?.characters?.results
    }
    fun buildClient(): ApolloClient {
        return ApolloClient.Builder()
            .serverUrl("https://rickandmortyapi.com/graphql")
            .build()
    }
}
