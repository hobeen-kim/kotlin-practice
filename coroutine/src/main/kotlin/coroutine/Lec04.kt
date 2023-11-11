package coroutine

import kotlinx.coroutines.*

fun lec04Example01(): Unit = runBlocking {
  val job1 = launch {
    delay(1_000L)
    printWithThread("Job 1")
  }

  val job2 = launch {
    delay(1_000L)
    printWithThread("Job 2")
  }

  delay(100)
  job1.cancel()
}

fun lec04Example2(): Unit = runBlocking {
  val job = launch(Dispatchers.Default) {
    var i = 1
    var nextPrintTime = System.currentTimeMillis()
    while(i <= 5) {
      if(nextPrintTime <= System.currentTimeMillis()) {
        printWithThread("${i++} 번째 출력!")
        nextPrintTime += 1_000L
      }

      if(!isActive) {
        throw CancellationException()
      }
    }
  }

  delay(100L)
  job.cancel()
}

fun main(): Unit = runBlocking {
  val job = launch {
    try {
      delay(100L)
    } catch(e: CancellationException) {

    } finally {
      //자원을 닫는 등 활동을 할 수 있다.
      printWithThread("자원을 닫음")
    }
    printWithThread("delay 에 의해 취소되지 않았다.")
  }
  delay(100L)
  printWithThread("취소시작")
  job.cancel()
}

