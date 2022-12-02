package chap9.section2

import java.util.Locale.Category

data class PersonDSL(
    var name: String? = null,
    var age: Int? = null,
    var job: Job? = null
)

data class Job(
    var category: String? = null,
    var position: String? = null,
    var extension: Int? = null
)

fun person(block : PersonDSL.() -> Unit) : PersonDSL = PersonDSL().apply(block)

fun PersonDSL.job(block: Job.() -> Unit){
    job = Job().apply(block)
}

fun main(){
    val person = person { // 간단한 DSL이 적용된 생성 방법
        name = "Hyeon"
        age = 25
        job {
            category = "IT"
            position = "Android Developer"
            extension = 1234
        }
    }
    println(person)
}