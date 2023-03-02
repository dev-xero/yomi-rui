package dev.xero.yomirui.ui.screens

import dev.xero.yomirui.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import dev.xero.yomirui.ui.theme.Background
import kotlinx.coroutines.delay

@Composable
fun LoadingScreen(
	modifier: Modifier = Modifier
) {
	Box(
		modifier = modifier
			.fillMaxSize()
			.background(color = Background)
		,
		contentAlignment = Alignment.Center
	) {
		var rotateAnimation by remember { mutableStateOf(0f) }

		LaunchedEffect(Unit) {
			while(true) {
				delay(30)
				rotateAnimation += 20f % 360
			}
		}

		Image(
			painter = painterResource(id = R.drawable.loading_spinner),
			contentDescription = null,
			modifier = modifier.rotate(rotateAnimation)
		)
	}
}

@Preview
@Composable
fun LoadingScreenDefaultPreview() {
	LoadingScreen()
}