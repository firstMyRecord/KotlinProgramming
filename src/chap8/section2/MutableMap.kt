package chap8.section2


fun main(){
    // 가변형 Map의 선언 및 초기화
    val capitalCityMap: MutableMap<String, String> // 선언할 때 키와 값의 자료형을 명시 할 수 있음
            = mutableMapOf("korea" to "seoul", "chinaFuking" to "Beijing", "JaPan" to "Tokyo")

    println(capitalCityMap.values) // 값만 출력
    println(capitalCityMap.keys) // 키만 출력

    capitalCityMap["UK"] = "London" // = capitalCityMap.put("uk", "London") 요소의 추가
    capitalCityMap.remove("chinaFuking") // 요소의 삭제
    println(capitalCityMap)

    val addData = mutableMapOf("USA" to "washington")
    capitalCityMap.putAll(addData)
    println(capitalCityMap)
}