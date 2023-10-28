class NullOperation {
}

fun main() {

    var a: String? = null;

    println(a?.uppercase());
    println(a?:"default".uppercase())
    println(a!!.uppercase())

    //a 가 null 인지 체크하고 실행 (if 대신 사용하기 좋음)
    a?.run {
        println(uppercase())
        println(lowercase())
    }
}
