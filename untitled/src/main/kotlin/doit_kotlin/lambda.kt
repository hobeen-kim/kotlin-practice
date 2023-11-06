package doit_kotlin

class lambda {
}

val sum = {no1:Int, no2:Int -> no1 + no2}

val noParams = { println("no params") }

val oneParam: (Int) -> Unit = { println("one Param $it") }

val some = { no1:Int, no2:Int ->
    println("no1: $no1, no2: $no2")
    no1 + no2
}

val type: (Int, Int) -> Int = { no1, no2 -> no1 + no2 }

typealias myFunType = (Int, Int) -> Boolean

val someFun: myFunType = { no1, no2 -> no1 > no2 }

fun hotFun(arg: (Int) -> Boolean): () -> String {
    val result = if(arg(10)) {
        "valid"
    } else {
        "invalid"
    }
    return { "hotFun result : $result" }
}


fun main() {
    sum(10, 20)
    sum(20, 30)

    noParams()

    oneParam(10)

    println(some(10, 20))

    println(type(10, 20))

    println(someFun(10, 20))

    println(hotFun { it > 0 }())
}