package chap9.section1

import java.io.*

fun main(){
    PrintWriter(FileOutputStream("/Users/namgunghyeon/Desktop/Coding/KotlinEx/output.txt")).use {
        it.println("hello")
    }
}