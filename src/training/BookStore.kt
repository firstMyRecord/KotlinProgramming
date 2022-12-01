package training

import java.util.*

fun main() {
    val booksName = arrayOf("C", "C++", "JAVA", "Kotlin", "C#", "Python", "Flutter")
    val price = 200.00f
    val studentDiscount = .25f
    val teacherDiscount = .15f

    /* Scanner 객체에 System.in이라는 inputsteam 을 넣어서 scanner에 저장
    in으로 감싼 이유는 in이 예약어이기 때문이다. */
    val scanner = Scanner(System.`in`)

    println("서점에 올 필요는 없지만 전자 서점은 오자 ^^")

    do {
        println(booksName.contentToString())
        println("일단 원하는 책 골라봐라")
        print("답변 : ")
        val choiceBook = scanner.nextLine()

        if (booksName.contains(choiceBook)) {
            println("너가 잡은 책은 $choiceBook 이고, 가격은 \$200")
            println(
                "할인율 확인을 위해 당신의 직업을 선택하세요" +
                        "\n 너 직업 뭐임(학생, 선생님, 기타)?"
            )
            print("답변 : ")
            val occupation = scanner.nextLine()

            when (occupation.toLowerCase()) {
                "학생" -> calculaterPrice(price, studentDiscount)
                "선생님" -> calculaterPrice(price, teacherDiscount)
                else -> println(
                    "할인 ㄴㄴ" +
                            "\n원가 \$200 ㄱ ㄱ"
                )
            }
        } else if (choiceBook == "exit" || choiceBook == "q") {
            break
        } else {
            println("$choiceBook 재고 없음")
        }
    } while (true)
}

private fun calculaterPrice(orig: Float, x: Float): Unit {
    val result = orig - (orig * x)
    println("최종 가격 : \$$result")
}