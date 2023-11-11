package coroutine

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun example1() {
  runBlocking {
    printWithThread("START")
    launch {
      delay(2_000L)
      printWithThread("LAUNCH END")
    }
  }

  printWithThread("END")
}

fun example2(): Unit = runBlocking {
  val job = launch(start = CoroutineStart.LAZY) {
    printWithThread("Hello launch")
  }

  delay(1_000L)
  job.start()
}

fun example3(): Unit = runBlocking {
  val job = launch {
    (1..5).forEach {
      printWithThread(it)
      delay(500)
    }
  }

  delay(1_000L)
  printWithThread("CANCELED")
  job.cancel()
}

fun example4(): Unit = runBlocking {
  val job1 = launch {
    delay(1000)
    printWithThread("JOB 1")
  }

  job1.join()

  val job2 = launch {
    delay(1000)
    printWithThread("JOB 2")
  }
}

fun example5(): Unit = runBlocking {
  val job = async {
    3 + 5
  }

  val value = job.await()
  printWithThread(value)
}

fun main(): Unit = runBlocking {

  val time = measureTimeMillis {
    val job1 = async { apiCall1() }
    val job2 = async { apiCall2(job1.await()) }
    printWithThread(job2.await())
  }

  printWithThread("소요시간 : $time")
}

suspend fun apiCall1(): Int {
  delay(1000)
  return 1
}

suspend fun apiCall2(num: Int): Int {
  delay(1000)
  return num + 2
}