package au.com.woolworths.unicorn_factory.rick

import au.com.woolworths.unicorn_factory.rickandmorty.CharacterByIdQuery
import au.com.woolworths.unicorn_factory.rickandmorty.CharactersPageFooBar2Query
import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.api.Optional


class RickAndMortyRepository {

    suspend fun getCharactersById(id:String ): CharacterByIdQuery.Character? {
      return buildClient()
          .query(CharacterByIdQuery(id = id))
          .execute().data?.character
    }

    suspend fun getCharacterByName(name: String): List<CharactersPageFooBar2Query.Result?>? {
        return buildClient()
            .query(CharactersPageFooBar2Query(name = Optional.present(name)))
            .execute().data?.characters?.results
    }
    fun buildClient(): ApolloClient {
        return ApolloClient.Builder()
            .serverUrl("https://rickandmortyapi.com/graphql")
            .build()
    }
}
