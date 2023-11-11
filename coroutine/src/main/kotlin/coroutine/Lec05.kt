package coroutine

import kotlinx.coroutines.*

fun lec5Ex1(): Unit = runBlocking {
  val job = CoroutineScope(Dispatchers.Default).async {
    throw IllegalArgumentException()
  }

  delay(1_000L)
  job.await()
}

//자식 코루틴은 부모 코루틴에게 예외를 전파함
fun lec5ex2(): Unit = runBlocking {
  val job = async {
    throw IllegalArgumentException()
  }

  delay(1_000L)
}

//전파하고 싶지 않으면 SupervisorJob() 을 사용하면 됨
fun lec5ex3(): Unit = runBlocking {
  val job = async(SupervisorJob()) {
    throw IllegalArgumentException()
  }

  delay(1_000L)
  //job.await() 를 사용하면 예외를 받을 수 있음
}


//try catch 로 예외처리 가능
fun lec5ex4(): Unit = runBlocking {
  val job = launch {
    try {
      throw IllegalArgumentException()
    } catch (e: IllegalArgumentException) {
      printWithThread("정상 종료")
    }
  }
}

//CoroutineExceptionHandler -> launch 에만 적용가능, 부모 코루틴이 있으면 동작 x
fun main(): Unit = runBlocking {
  val exceptionHandler = CoroutineExceptionHandler { _, _ ->
    printWithThread("예외")
  }

  val job = CoroutineScope(Dispatchers.Default).launch(exceptionHandler) {
    throw IllegalArgumentException()
  }

  delay(1_000L)
}