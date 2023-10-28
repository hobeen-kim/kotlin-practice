class HelloKotlin {
}

fun main() {

    var a = Person("박보영", 1990)
    var b = Person("전정국", 1997)
    var c = Person("장원영", 2004)

    var d = Person("이루다")
    var e = Person("차은우")
    var f = Person("류수정")

    a.introduce()
    b.introduce()
    c.introduce()

    var dog = Dog("별이", 5)

    dog.introduce()
    dog.bark()

    var cat = Cat("달이", 6)
    cat.introduce()
    cat.meow()
}

open class Animal (var name:String, var age:Int, var type:String) {

    fun introduce() {
        println("저는 ${type} ${name} 이고, ${age} 살 입니다.")
    }
}

class Dog(name:String, age:Int) : Animal(name, age, "개") {
    fun bark() {
        println("멍멍")
    }
}

class Cat(name:String, age:Int) : Animal(name, age, "고양이") {
    fun meow() {
        println("야옹")
    }
}

class Person (var name:String, var birthYear:Int) {
    init {
        println("${birthYear}년생 ${name}님이 생성되었습니다.")
    }

    constructor(name:String) : this(name, 1997) {
        println("보조 생성자가 사용되었습니다.")
    }

    fun introduce() {
        println("안녕하세요. ${birthYear}년생 ${name}입니다.")
    }
}
