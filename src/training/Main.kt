package training

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toString()

    repeat(t.length){
        val (re : String, str : String) = readLine()!!.split(" ")
        var result = ""

        for (Char in str){
            repeat(re.toInt()){
                result += Char
            }
        }
        println(result)

    }
}