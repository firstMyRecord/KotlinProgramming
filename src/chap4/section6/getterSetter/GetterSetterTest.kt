package chap4.section6.getterSetter

/*
//주 생성자에 3개의 매개변수 정의
class User(_id : Int, _name : String, _age : Int){
    //프로퍼티
    val id = _id // 불변(읽기 전용)
    var name = _name // 가변
    var age = _age // 가변
}
*/

//위 코드를 한 줄 요약
class User(val id : Int, var name : String, var age : Int)

fun main(){
    val user = User(123,"hyeon", 25)
    val name = user.name // 게터의 의한 값 흭득
    user.age = 24 // 세터의 의한 값 지정
    println("name : $name   ${user.age}")
}