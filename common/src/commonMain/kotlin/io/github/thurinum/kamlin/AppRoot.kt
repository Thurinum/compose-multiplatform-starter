package io.github.thurinum.kamlin

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

expect val platform: String

@Composable
fun App() {
    MaterialTheme {
        Surface {
            Column {
                Text("Running on $platform! OwO")
            }
        }
    }
}
