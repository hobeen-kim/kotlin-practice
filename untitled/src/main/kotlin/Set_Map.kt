class Set_Map {

}

fun main() {
    //set
    val a = mutableSetOf("귤", "바나나", "키위")

    println(a)

    a.add("자몽")
    println(a)

    a.remove("바나나")
    println(a)

    println(a.contains("귤"))

    a.remove("not")
    println(a)

    //map
    val b = mutableMapOf("레드벨벳" to "음파음파",
        "트와이스" to "Fancy")

    for (entry in b) {
        println("${entry.key} : ${entry.value}")
    }

    b.put("오마이걸", "번지")
    println(b)

    b.remove("트와이스")
    println(b)

    println(b["레드벨벳"])

}