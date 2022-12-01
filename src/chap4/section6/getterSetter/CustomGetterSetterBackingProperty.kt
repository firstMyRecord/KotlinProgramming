package chap4.section6.getterSetter

import java.lang.AssertionError

// 임시적인 보조 프로퍼티 이용하기
class User3(_id : Int , _name : String, _age : Int){
    val id : Int = _id

    private var tempName  : String? = null
    var name : String = _name
        get() {
            if (tempName == null) tempName = "NONAME"
            return tempName ?: throw AssertionError("Asserted by others")
        }
    var age = _age
}

fun main(){
    val user3 = User3(990123, "hyeon", 25)
    user3.name = ""
    println("user.name : ${user3.name}")
}