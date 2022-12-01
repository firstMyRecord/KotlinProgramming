package chap3.section1

fun main(){
    cases("Hello")
    cases(7)
    cases(System.currentTimeMillis())
    cases(MyClass())
}

fun cases(obj : Any){
    when(obj){
        is Int -> println("Int : $obj")
        is String -> println("String : $obj")
        is Long -> println("Long : $obj")
        !is String -> println("Not is String")
        else -> println("Unknown")


    }
}