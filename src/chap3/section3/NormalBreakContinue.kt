package chap3.section3

fun main(){
    for (i in 1..5){
        if (i == 3) break // continue 쓰면 3을 제외한 1245 출력
        print(i)
    }
    println()
    println("outSide")
    labelBreak()
}

fun labelBreak(){
    println("labelBreak")
    first@ for (i in 1..5){
        second@ for (j in 1..5) {
            if (j == 3) break@first
            println("i : $i  j : $j")
        }
        println("after for j")
    }
    println("after for i")
}