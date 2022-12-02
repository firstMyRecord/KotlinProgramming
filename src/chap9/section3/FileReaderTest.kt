package chap9.section3

import java.io.FileReader
import java.lang.Exception

fun main(){
    val path = "/Users/namgunghyeon/Desktop/Coding/FileWriteTest.txt"

    try {
        val read = FileReader(path)
        println(read.readText())
    }catch (e: Exception){
        println(e.message)
    }
}