package cat.institutmontivi.decissorviewmodel25.ui.pantalles

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cat.institutmontivi.decissorviewmodel25.ui.common.Boto

@Preview
@Composable
fun PantallaTriaUnNumero ()
{
    Column(
        Modifier
            .padding(32.dp)
            .fillMaxSize())
    {
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)) {
            Text("???",
                Modifier.align(Alignment.Center),
                style = MaterialTheme.typography.displayLarge,
                fontSize = 148.sp,
                textAlign = TextAlign.Center
            )
        }

        Boto(
            modifier = Modifier
                .weight(0.75F)
                .fillMaxHeight(),
            text = "Sorteja",
            clic = {  })
    }
}