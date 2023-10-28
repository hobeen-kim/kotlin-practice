class Ananym {
}

fun main() {

    EventPrinter().start()

}

interface EventListener {
    fun onEvent(count :Int)
}

class Counter2(var listener: EventListener) {
    fun  count() {
        for (i in 1..100) {
            if(i % 5 == 0) listener.onEvent(i)
        }
    }
}

class EventPrinter {
    fun start() {
        val counter2 = Counter2(object: EventListener {
            override fun onEvent(count: Int) {
                print("${count}-")
            }

        }).count()
    }
}
