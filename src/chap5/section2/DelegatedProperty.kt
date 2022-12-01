package chap5.section2

import kotlin.properties.Delegates

// observable 함수 이용해보기

class User {
    var name : String by Delegates.observable(("NONAME")){ // 1. 프로퍼티 위임
        prop, old, new -> // 2. 람다식 매개 변수로 프로퍼티, 기존값, 새로운  지정
        println("$old -> $new") // 이 부분은 이벤트가 일어날 때만 사
    }
}

fun main(){
    val user = User()
    user.name = "hyeon" // 4. 값이 변경되는 시점에서 첫 이벤트 발생
    user.name = "Zin" //5. 값이 변경되는 시점에서 두번째 이벤트 발생
}