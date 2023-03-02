package dev.xero.yomirui.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.xero.yomirui.R
import dev.xero.yomirui.ui.theme.Background
import dev.xero.yomirui.ui.theme.Purple100
import dev.xero.yomirui.ui.theme.White

@Composable
fun ErrorScreen(
	modifier: Modifier = Modifier
) {
	Box(
		modifier = modifier
			.fillMaxSize()
			.background(color = Background),
		contentAlignment = Alignment.Center
	) {

		Column(
			modifier = Modifier.fillMaxSize(),
			horizontalAlignment = Alignment.CenterHorizontally,
			verticalArrangement = Arrangement.spacedBy(24.dp)
		) {
			Image(
				painter = painterResource(id = R.drawable.wifi_off_icon),
				contentDescription = "no_connection"
			)

			Text(
				text = stringResource(id = R.string.unable_to_connect),
				style = MaterialTheme.typography.h3,
				color = White
			)
			
			Text(
				text = stringResource(id = R.string.check_connection),
				style = MaterialTheme.typography.h4,
				color = Purple100
			)
		}


	}
}

@Preview
@Composable
fun ErrorScreenDefaultPreview() {
	ErrorScreen()
}