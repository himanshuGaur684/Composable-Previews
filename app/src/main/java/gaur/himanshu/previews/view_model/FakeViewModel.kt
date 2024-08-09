package gaur.himanshu.previews.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class FakeViewModel @Inject constructor(
    private val fakeUseCase: FakeUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(FakeScreen.UiState())
    val uiState: StateFlow<FakeScreen.UiState> get() = _uiState.asStateFlow()

    init {
        getData()
    }

    private fun getData() {
        fakeUseCase.invoke().onEach { result ->
            _uiState.update { FakeScreen.UiState(data = result) }
        }.launchIn(viewModelScope)
    }


}

object FakeScreen {
    data class UiState(
        val isLoading: Boolean = false,
        val error: String = "",
        val data: String? = null
    )
}
