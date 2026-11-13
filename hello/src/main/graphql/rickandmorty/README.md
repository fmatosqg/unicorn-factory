# Rick and Morty GraphQL schema

Endpoint: https://rickandmortyapi.com/graphql

## Download / update the schema

From the repo root:

```sh
./gradlew :hello:downloadRickandmortyApolloSchemaFromIntrospection
```

This overwrites `schema.graphqls` in this folder (the endpoint and target file are configured in the `apollo { }` block of `hello/build.gradle.kts`). Review the diff and commit it.

## Generate the Kotlin code

```sh
./gradlew :hello:generateRickandmortyApolloSources
```

Generated sources land in `hello/build/generated/source/apollo/rickandmorty`. This also runs automatically as part of `compileKotlin`.
