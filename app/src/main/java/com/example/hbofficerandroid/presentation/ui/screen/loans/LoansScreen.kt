package com.example.hbofficerandroid.presentation.ui.screen.loans

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hbofficerandroid.presentation.theme.AppTheme
import kotlinx.coroutines.flow.SharedFlow

@Composable
fun LoansScreen(fabActions: SharedFlow<Unit>) {

    LaunchedEffect(Unit) {
        fabActions.collect {
            Log.e("FAB Clicked", "")
        }
    }

    LoansScreenContent()
}

@Composable
private fun LoansScreenContent() {
    Column(Modifier.padding(16.dp)) {
        repeat(1) {
            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "Text")
                    Spacer(Modifier.weight(1f))
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Button")
                    }
                }
                HorizontalDivider()
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    AppTheme {
        LoansScreenContent()
    }
}