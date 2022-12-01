package chap9.section1

fun main(){
    data class  Person(var name : String, var skills : String)
    var person = Person("Hyeon", "Kotlin")
    person.apply {  this.skills = "JAVA"} // 여기서 this는 person의 객체를 가르킴
    println(person)

    val returnobj = person.apply {
        name = "Boa" // this는 생략할 수 있음
        skills = "childhood Education" // this 없이 객체의 멤버의 여러 번 접근
    }
    println(person)
    println(returnobj)

}