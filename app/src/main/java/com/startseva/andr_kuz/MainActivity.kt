package com.startseva.andr_kuz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionContext
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.startseva.andr_kuz.data.Datasource
import com.startseva.andr_kuz.model.Serial
import com.startseva.andr_kuz.ui.theme.Andr_KuzTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Andr_KuzTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color= MaterialTheme.colorScheme.background
                ) {
                    SerialCatalogApp()
                }
            }
        }
    }
}

@Composable
fun SerialCard(serial: Serial, modifier: Modifier = Modifier) {
    Card(modifier=modifier) {
        Column{
            Image(
                painter = painterResource(serial.imageResourceId),
                contentDescription = stringResource(serial.titleResourceId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(500.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(serial.titleResourceId),
                modifier = Modifier.padding(18.dp),
                style= MaterialTheme.typography.headlineMedium


            )
            Text(
                text = stringResource(serial.descriptonResourceId),
                modifier = Modifier.padding(start=18.dp, end=18.dp, bottom=18.dp),
                style= MaterialTheme.typography.bodyMedium
            )
        }
    }
}
@Composable
fun SerialList(serialList: List<Serial>, modifier: Modifier= Modifier) {
    LazyColumn(modifier= modifier) {
        items(serialList) {serial ->
            SerialCard(
                serial=serial,
                modifier= Modifier.padding(8.dp)
            )
        }
    }
}
@Composable
fun SerialCatalogApp() {
    SerialList(
        serialList = Datasource().loadSerialList()
    )
}
@Preview(showBackground = true)
@Composable
private fun SerialCardPreview() {
    Andr_KuzTheme {
        SerialCard(
            Serial(
                R.string.ser1,
                R.string.ser1_description,
                R.drawable.tigr
            )
        )
    }
}
@Composable
fun SerialButtons() {

}

