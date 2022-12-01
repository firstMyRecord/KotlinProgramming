package chap8.section3

fun main(){
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(11 to "JAVA", 22 to "Kotlin", 33 to "C#")

        // 요소의 순환
    list.forEach{print("$it")}
    println()
    list.forEachIndexed { index, value -> println("index[$index] : $value")  }
    // onEach : 각 요소를 람다식으로 처리 후 컬렉션으로 반환
    val returnedList = list.onEach { print(it) }
    println()
    val returnedMap =  map.onEach { println("key : ${it.key}, value : ${it.value}") }
    println("returnedList = $returnedList")
    println("returnedMap = $returnedMap")

    // 요소의 개수 반환하기
    // count : 특정 조건에 맞는 요소의 개수를 반환
    println(list.count{it % 2 == 0})

    // 최댓값 최솟값의 요소 반환하기
    // max, min 최댓값 최솟값 요소 반환
    println(list.max()) // 6
    println(list.min())// 1

    // minBy, maxBy 최댓값 최솟값으로 나온 요소 it 에 대한 결과식
    println("maxBy : " + map.maxBy { it.key }) //  키를 기준으로 최댓값
    println("minBy : " + map.minBy { it.key }) // 키를 기준으로 최솟값

    // 각 요소에 정해진 식 적용하기
    // fold : 초깃값과 정해진 식에 따라 처음 요소부터 끝 요소에 적용하며 값을 생성
    println(list.fold(4) { total, next -> total + next}) // 4 + 1 + ......+ 6 = 25
    println(list.fold(1){ total, next -> total * next}) // 1 * ......* 6 =720

    // foldRight : fold와 같고 마지막 요소에서 처음 요소로 반대로 적용
    println(list.foldRight(4) { total, next -> total + next})
    println(list.foldRight(1){ total, next -> total * next})

    // reduce : fold와 동일하지만 초깃값을 사용하지 않는다 = reduceRight
    println(list.reduce{total, next -> total + next})
    println(list.reduce{total, next -> total * next})

    // 모든 요소 합산
    //sumBy: 식에 의해 도출된 모든 요소를 합한 결과를 반환하려면 sumBy를 사용
    println(listPair.sumBy { it.second })

}
