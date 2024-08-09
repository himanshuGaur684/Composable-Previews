package gaur.himanshu.previews.view_model

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle


@Composable
fun FakeComposablePreviewForViewModel(
    modifier: Modifier = Modifier,
    fakeViewModel: FakeViewModel
) {
    val uiState by fakeViewModel.uiState.collectAsStateWithLifecycle()
    if (uiState.isLoading) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Center) {
            CircularProgressIndicator()
        }
    }

    if (uiState.error.isNotEmpty()) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Center) {
            Text(text = uiState.error)
        }
    }

    uiState.data?.let {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Center) {
            Text(text = uiState.data.toString())
        }
    }
}

