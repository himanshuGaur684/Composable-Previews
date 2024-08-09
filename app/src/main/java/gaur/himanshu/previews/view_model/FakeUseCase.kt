package gaur.himanshu.previews.view_model

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class FakeUseCase @Inject constructor() {
    operator fun invoke(): Flow<String> = flow<String> {
        emit("This is loading case")
        delay(3000)
        emit("This is success case")
    }.catch {
        emit("This is error case")
    }.flowOn(Dispatchers.IO)

}