package dev.xero.yomirui.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.xero.yomirui.R
import dev.xero.yomirui.ui.theme.Background

@Composable
fun AppBar(
	modifier: Modifier = Modifier
) {
	Row(
		modifier = modifier
			.fillMaxWidth()
			.background(color = Background)
	) {
		Image(
			painter = painterResource(id = R.drawable.yomi_rui_top_icon),
			contentDescription = null,
			modifier = Modifier.padding(12.dp)
		)
	}
}

@Preview
@Composable
fun AppBarDefaultPreview() {
	AppBar()
}