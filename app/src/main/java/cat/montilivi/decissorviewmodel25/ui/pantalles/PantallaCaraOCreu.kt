package cat.institutmontivi.decissorviewmodel25.ui.pantalles

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cat.institutmontivi.decissorviewmodel25.ui.common.Boto
import cat.montilivi.decissorviewmodel25.R

@Preview
@Composable
fun PantallaCaraOCreu ()
{

    Column(
        Modifier
            .padding(32.dp)
            .fillMaxSize())
    {
        Image(painter = painterResource(id = R.drawable.question), contentDescription = null,
            modifier = Modifier
                .weight(5f)
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally), contentScale = ContentScale.Fit)

        Boto(
            modifier = Modifier
                .weight(0.75F)
                .fillMaxHeight(),
            text = "Sorteja",
            clic = {  })
        }
}
