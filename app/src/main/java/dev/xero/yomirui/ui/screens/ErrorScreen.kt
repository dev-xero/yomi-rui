package dev.xero.yomirui.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import dev.xero.yomirui.R
import dev.xero.yomirui.ui.theme.Background

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

		Column {
			Image(
				painter = painterResource(id = R.drawable.wifi_off_icon),
				contentDescription = "no_connection"
			)

			Text(text = stringResource(id = R.string.unable_to_connect))
			
			Text(text = stringResource(id = R.string.check_connection))
		}


	}
}

@Preview
@Composable
fun ErrorScreenDefaultPreview() {
	ErrorScreen()
}