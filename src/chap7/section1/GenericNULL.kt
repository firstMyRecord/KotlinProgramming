package chap7.section1

class GenericNULL<T>{ // 기본적으로 NULL이 허용되는 형식 매개변수
    fun equalityFunc(arg1: T, arg2: T){
        println(arg1?.equals(arg2))
    }
}

fun main(){
    val obj = GenericNULL<String>() //non-null 선언, 특정 자료형을 지정하면 null을 제한하게 됨
    obj.equalityFunc("hello","goodBye") // null이 허용되지 않음

    val obj2 = GenericNULL<Int?>() //null이 가능한 형태로 선언
    obj2.equalityFunc(null, 10) //null 사용
}