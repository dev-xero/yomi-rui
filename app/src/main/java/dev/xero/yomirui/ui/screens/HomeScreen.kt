package dev.xero.yomirui.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.xero.yomirui.ui.components.AppBar

@Composable
fun HomeScreen(
	modifier: Modifier = Modifier
) {

	Scaffold(
		topBar = {
			Column(
				modifier = modifier.fillMaxWidth(),
				verticalArrangement = Arrangement.spacedBy(24.dp)
			) {
				AppBar()
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