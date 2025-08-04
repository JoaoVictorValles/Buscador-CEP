package com.joao.buscadorcep.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SearchJV (modifier: Modifier = Modifier
) {
    Row {  }
}

@Preview (showBackground = true)
@Composable
fun SearchJVPreview() {
    Column (modifier = Modifier
        .fillMaxSize()
    ){
        SearchJV()
    }
}