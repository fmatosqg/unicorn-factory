package au.com.woolworths.unicorn_factory.rickui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import au.com.woolworths.unicorn_factory.rick.RickAndMortyRepository

@Composable
fun CharactersScreen(modifier: Modifier = Modifier) {
    var names by remember { mutableStateOf<List<String>?>(null) }

    LaunchedEffect(Unit) {
        names = runCatching {
            RickAndMortyRepository().getCharacterByName("rick")
                ?.mapNotNull { it?.characterFields?.let { c -> "${c.name} (${c.status}, ${c.species})" } }
        }.getOrNull().orEmpty()
    }

    MaterialTheme {
        Column(modifier.padding(16.dp)) {
            val list = names
            if (list == null) {
                Text("Loading…")
            } else {
                LazyColumn {
                    items(list) { Text(it, Modifier.padding(vertical = 4.dp)) }
                }
            }
        }
    }
}
