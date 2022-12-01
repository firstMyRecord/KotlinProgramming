package chap9.section1

fun main(){
    data class User(val name: String, var skills: String, var email : String? = null)
    val user = User("Hyeon", "default" )

    val result = with(user){
        skills = "kotlin"
        email = "skarndgus8899@gmail.com"
        "success" // success를 할당하는 String형 변수가 된다.
    }
    println(user)
    println("result: $result")

}