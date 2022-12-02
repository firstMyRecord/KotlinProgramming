package chap9.section3

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

fun main(){
    val path = "/Users/namgunghyeon/Desktop/Coding/FileWriteTest.txt" // 파일 생성 경로
    val text = "아 취업하고 싶다~~~~~~!!!"

    try {
        Files.write(Paths.get(path), text.toByteArray(), StandardOpenOption.CREATE)
    }catch (_: IOException){

    }
}