package chap9.section1

// apply() 함수와 run()함수 비교하기

fun main(){
    data class Person(var name: String, var skills: String)
    var person = Person("Hyeon", "Kotlin")
    val returnObj = person.apply {
        this.name = "Boa"
        this.skills = "Childhood Education"
        "success" // 사용되지 않음
    }
    println(person)
    println("returnObj: $returnObj")

    val returnObj2 = person.run {
        this.name = "otherHyeon"
        this.skills = "JAVA"
        "success"
    }
    println(person)
    println("returnObj2 : $returnObj2")
}