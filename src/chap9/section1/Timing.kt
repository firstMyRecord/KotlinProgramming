package chap9.section1

import kotlin.random.Random


// Kotlin.system 패키지의 Timing.kt 파일
public inline fun measureTimeMills(block : () -> Unit): Long{
    val start = System.currentTimeMillis()
    block()
    return System.currentTimeMillis() - start
}

public inline fun measureNanoTime(block: () -> Unit): Long {
    val start = System.nanoTime()
    block()
    return System.nanoTime() - start
}

val executionTime = measureTimeMills {
    // 측정할 작업 코드
}
fun main() {
// 난수 생성
    val number = Random.nextInt(21)
    val j = mutableListOf<Int>()

  while (j.size < 10)
  {
      j.add(number)
  }
    println(j)
}