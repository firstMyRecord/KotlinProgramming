package chap2.section1

fun main(){
    //인자와 반환값이 있는 함수
    val res1 = fucParam(3, 2, ::sum)
    println(res1)

    //인자가 없는 함수
    hello(::text)

    //일반 변수에 값처럼 할당
    val likeLamda = ::sum
    println(likeLamda(6, 6))
}
fun sum(x : Int, y : Int) = x + y

fun fucParam(a : Int, b : Int, c : (Int, Int)->Int) : Int{
    return c(a, b)
}
fun text(a : String, b : String) = "Hi $a $b"

fun hello(body : (String, String) -> String): Unit{
    println(body("Hello", "World!"))
}
fun max(a : Int, b: Int) = if(a > b) a else b