package com.absk.navigationcompose

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun HomerUI() {
    val context = LocalContext.current
    LazyColumn(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxWidth()
            .padding(top = 20.dp)
            .padding(12.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        items(300) { i ->
            CustomTextViews("Item at  ${i + 1}", context)
        }
    }
}


@Composable
fun CustomTextViews(text: String, context: Context) {
    Text(color = Color.White,
        text = text,
        fontSize = 14.sp,
        modifier = Modifier
            .padding(12.dp)
            .width(IntrinsicSize.Max)
            .clickable {
                showToast(context, text)
            })

}

fun showToast(current: Context, text: String) {
    Toast.makeText(current, text, Toast.LENGTH_SHORT).show()
}


