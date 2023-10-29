class Overloading {
}

fun main() {
    read(7)
    read("감사합니다.")
    deliveryItem("짬뽕")
    deliveryItem("책", 3)
    deliveryItem("짬뽕", 3, "회사")

    deliveryItem("선물", destination = "친구집")

    sum(1, 2, 3, 4)

    println(6 multiply 4)
    println(6.multiply(4))
}

fun read(x: Int) {
    println("숫자 $x 입니다.")
}

fun read(x: String) {
    println(x)
}

fun deliveryItem(name: String, count: Int = 1, destination: String = "집") {
    println("${name}, ${count} 개를 ${destination} 에 배달하였습니다.")
}

fun sum(vararg numbers: Int) {
    var sum = 0

    for(n in numbers) sum += n
    println(sum)
}

infix fun Int.multiply(x: Int) : Int = this * x