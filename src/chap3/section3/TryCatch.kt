package chap3.section3

fun main(){
    val a = 6
    val b = 0
    val c : Int

    try {
        c = a/b
    }catch (e : ArithmeticException){
        e.printStackTrace()
    }
    finally {
        println("final 블록은 무조건 실행 되어야 핢")
    }
}