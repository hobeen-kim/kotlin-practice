class Sameness {
}

fun main() {
    var a = Product("콜라", 1000)
    var b = Product("콜라", 1000)
    var c = a
    var d = Product("사이다", 1000)

    println(a == b) //true
    println(a === b) //false
    println(a == c) //true
    println(a === c) //true
    println(a == d) //false
    println(a === d) //false
}

class Product(val name: String, val price: Int) {
    override fun equals(other: Any?): Boolean {
        if(other is Product) {
            return other.name == name && other.price == price
        }
        return false
    }
}