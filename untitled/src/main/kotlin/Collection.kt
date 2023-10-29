class Collection {
}

fun main() {
    val nameList = listOf("박수영", "김지수", "김다현", "신유나", "김지우")

    nameList.forEach { print("$it ")}

    println()

    println(nameList.filter{it.startsWith("김")})

    println(nameList.map{"이름 : $it"})

    println(nameList.any{it == "김지연"})
    println(nameList.all{it.length == 3})
    println(nameList.none{it.startsWith("이")})

    println(nameList.first{it.startsWith("김")})
    println(nameList.last{it.startsWith("김")})
    println(nameList.count{it.contains("지")})

    data class Person(val name: String, val birthYear: Int)

    val personList = listOf(Person("유나", 1992),
                         Person("조이", 1996),
                         Person("츄", 1999),
                         Person("유나", 2003))

    println(personList.associateBy{it.birthYear})
    println(personList.groupBy{it.name})

    val (over98, under98) = personList.partition { it.birthYear > 1998 }
    println(over98)
    println(under98)

    val numbers = listOf(-3, 7, 2, -10, 1)

    println(numbers.flatMap{listOf(it * 10, it + 10)})

    println(numbers.getOrElse(1) { 50 })
    println(numbers.getOrElse(10) { 50 })

    val names = listOf("A", "B", "C", "D")

    println(names zip numbers)
}