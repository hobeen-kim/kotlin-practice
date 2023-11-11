package coroutine

import kotlinx.coroutines.*
import java.util.concurrent.Executors

suspend fun lec07ex1() {
  val job = CoroutineScope(Dispatchers.Default).launch {
    delay(1_000L)
    printWithThread("Job 1")
  }

  job.join()
}

class AsyncLogic {
  private val scope = CoroutineScope(Dispatchers.Default)

  fun doSomething() {
    scope.launch {
      delay(1_000L)
      printWithThread("Job 1")
      coroutineContext + CoroutineName("job 1")
    }
  }

  fun destroy() {
    scope.cancel()
  }
}

fun main() {
  CoroutineName("나만의 코루틴") + Dispatchers.Default
  val threadPool = Executors.newSingleThreadExecutor()
  CoroutineScope(threadPool.asCoroutineDispatcher()).launch {
    printWithThread("코루틴 시작")
  }
}