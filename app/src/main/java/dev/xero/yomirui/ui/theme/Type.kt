package dev.xero.yomirui.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import dev.xero.yomirui.R

val Inter = FontFamily(
	Font(
		resId = R.font.inter_regular,
		FontWeight.Normal
	),

	Font(
		resId = R.font.inter_bold,
		FontWeight.Bold
	)
)

val OutFit = FontFamily(
	Font(
		resId = R.font.outfit_bold,
		FontWeight.Bold
	),
)

val Typography = Typography(
	h3 = TextStyle(
		fontFamily = OutFit,
		fontWeight = FontWeight.Bold,
		fontSize = 24.sp
	),

	h4 = TextStyle(
		fontFamily = Inter,
		fontWeight = FontWeight.Bold,
		fontSize = 14.sp
	),

	h6 = TextStyle(
		fontFamily = Inter,
		fontWeight = FontWeight.Bold,
		fontSize = 12.sp
	),

	caption = TextStyle(
		fontFamily = OutFit,
		fontWeight = FontWeight.Bold,
		fontSize = 10.sp
	),

	body1 = TextStyle(
		fontFamily = Inter,
		fontWeight = FontWeight.Normal,
		fontSize = 14.sp
	)


)