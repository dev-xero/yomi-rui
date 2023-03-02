package dev.xero.yomirui.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.xero.yomirui.ui.components.AppBar
import dev.xero.yomirui.ui.components.SearchBar

@Composable
fun HomeScreen(
	modifier: Modifier = Modifier
) {

	Scaffold(
		topBar = {
			Column(
				modifier = modifier.fillMaxWidth(),
				verticalArrangement = Arrangement.spacedBy(16.dp)
			) {
				// REMOVE THIS LATER
				var searchText by rememberSaveable { mutableStateOf("") }

				AppBar()
				SearchBar(
					searchText = searchText,
					onSearchValueChange = { searchText = it },
					modifier = Modifier
						.padding(horizontal = 12.dp)
						.clip(RoundedCornerShape(4.dp))
				)
			}
		}
	) {
		padding -> LazyColumn(
			modifier = Modifier.padding(horizontal = 12.dp)
		) {

		}
	}
}

@Preview
@Composable
fun HomeScreenDefaultPreview() {
	HomeScreen()
}