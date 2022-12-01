package chap4.section6.getterSetter

class User2(_id : Int, _name : String, _age : Int ){
    // 프로퍼티
    val id = _id
        get() = field

    var name = _name
        get() = field
        set(value) {
            field = value
        }

    var age = _age
        get() = field
        set(value) {
            field = value
        }

}

fun main(){
    val user2 = User2(123, "hyeon", 25)
    val name = user2.name
    user2.age = 24 // setter
    println("name : $name, user2.age = ${user2.age}") // user2.age 는 getter
}