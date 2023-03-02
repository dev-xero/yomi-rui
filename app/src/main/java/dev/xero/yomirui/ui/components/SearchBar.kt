package dev.xero.yomirui.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.xero.yomirui.R
import dev.xero.yomirui.ui.theme.OnSurface
import dev.xero.yomirui.ui.theme.Surface
import dev.xero.yomirui.ui.theme.White

@Composable
fun SearchBar(
	modifier: Modifier = Modifier,
	searchText: String,
	onSearchValueChange: (String) -> Unit
) {
	OutlinedTextField(
		value = searchText,
		onValueChange = onSearchValueChange,
		maxLines = 1,
		singleLine = true,
		placeholder = {
			Text(
				text = stringResource(id = R.string.search_up_manga),
				style = MaterialTheme.typography.body2
			)
		},
		leadingIcon = {
			Icon(
				painter = painterResource(id = R.drawable.search_icon),
				contentDescription = "search",
				tint = White,
				modifier = Modifier.size(20.dp)
			)
		},
		keyboardOptions = KeyboardOptions.Default.copy(
			imeAction = ImeAction.Next,
			keyboardType = KeyboardType.Text
		),
		modifier = modifier
			.background(color = Surface)
			.fillMaxWidth(),
		colors = TextFieldDefaults.outlinedTextFieldColors(
			unfocusedBorderColor = Surface,
			focusedBorderColor = Surface,
			placeholderColor = OnSurface,
			textColor = White,
			leadingIconColor = White
		),
		textStyle = MaterialTheme.typography.body2
	)
}

@Preview
@Composable
fun SearchBarDefaultPreview() {
	var randomText = ""

	SearchBar(searchText = randomText, onSearchValueChange = { randomText = it })
}