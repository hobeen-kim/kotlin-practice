class DataClass {
}

fun main() {

    val a = General("보영", 212)

    println(a == General("보영", 212))
    println(a.hashCode())
    println(a)

    val b = Data("루다", 306)

    println(b == Data("루다", 306))
    println(b.hashCode())
    println(b)

    val list = listOf(Data("보영", 212),
                    Data("루다", 306),
                    Data("아린", 618))

    for((a, b) in list) {
        println("$a, $b")
    }

}

class General(val name: String, val id: Int)

data class Data(val name: String, val id: Int)