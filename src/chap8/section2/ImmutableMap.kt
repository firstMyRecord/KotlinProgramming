package chap8.section2

fun main(){
    // 불변형 Map의 선언 및 초기화
    val langMap: Map<Int, String> = mapOf(11 to "JAVA", 22 to "Kotlin", 33 to "C++")
    //키와 값의 쌍을 출력
    for ((key, value) in langMap){
        println("key = $key" + "value = $value")
    }
    println(langMap[22])
    println(langMap.get(22)) // 위와 동일한 표현
    println(langMap.keys) //맵의 모든 키 출
}