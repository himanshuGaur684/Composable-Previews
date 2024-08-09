package gaur.himanshu.previews.normal

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import gaur.himanshu.previews.R
import gaur.himanshu.previews.ui.theme.PreviewsTheme


@MultiplePreview
@Composable
fun CardItemPreview(modifier: Modifier = Modifier) {
    PreviewsTheme {
        CardItem()
    }
}


@Preview(
    name = "virat kohli",
    showBackground = true,
    showSystemUi = true,
    apiLevel = 33,
    fontScale = 1f,
    device = Devices.PIXEL_XL,
    group = "",
    locale = "en",
)
@Composable
fun CardItem(modifier: Modifier = Modifier) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(8.dp),
        onClick = { /*TODO*/ }) {
        Image(
            painter = painterResource(id = R.drawable.kohli),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = stringResource(R.string.virat_kohli),
            modifier = Modifier.padding(horizontal = 12.dp),
            style = MaterialTheme.typography.headlineLarge,
            color = Color.Black
        )
        Text(
            text = stringResource(R.string.virat_kohli_is_one_of_the_most_successful_and_celebrated_cricketers_in_the_world_born_on_november_5_1988_in_delhi_india_he_is_known_for_his_aggressive_batting_style_excellent_fitness_and_leadership_qualities_kohli_made_his_debut_for_the_indian_cricket_team_in_2008_and_quickly_rose_to_prominence_with_his_consistent_performances_across_all_formats_of_the_game),
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 12.dp),
            color = Color.Gray
        )

    }


}


@Preview(showBackground = true,
    showSystemUi = true,
    name = "day",
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Preview(showBackground = true,
    showSystemUi = true,
    name = "night",
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
annotation class MultiplePreview