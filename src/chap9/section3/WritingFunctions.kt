package chap9.section3

import java.io.File
import java.io.PrintWriter

fun main(){
    val outString: String = "취업\t시켜\r달\n라/고"
    val path = "/Users/namgunghyeon/Desktop/Coding/FileWriteTest.txt"

    val file = File(path)
    val printWriter = PrintWriter(file)

    printWriter.println(outString)
    printWriter.close()
    File(path).printWriter().use { it.println(outString) } // use 사용해서 이렇게 줄일 수 있음
    File(path).printWriter().use { out -> out.println(outString) } // 인자가 2개 이상이면 이런 식으로 줄임
}