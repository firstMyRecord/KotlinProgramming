package chap8.section1

fun main(){
    // 가변형 list의 생성 및 추가 삭제 변경
    val mutableList: MutableList<String> = mutableListOf<String>("hyeon", "Boa", "couple")
    mutableList.add("Love")
    mutableList.removeAt(2)
    mutableList[0] = "Hyeon" // 0번 인덱스의 요소를 변경 set(index: Int, element : E)와 같은 역할
    println(mutableList)

    // 자료형의 혼합
    val mutableListMixed = mutableListOf("Kotlin", "Android", 1, 4, 'x')
    println(mutableListMixed)
    listReplace()

}

// 불변형 리스트를 가변형 리스트로 변환하기
fun listReplace(){
    val names : List<String> = listOf("one", "two", "three")
    val mutableName = names.toMutableList() // 새로운 가변형 리스트가 만들어짐
    mutableName.add("four")
    println(mutableName)
}