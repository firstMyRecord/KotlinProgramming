package chap2.section2

fun main(){
    shortsFunc(3){ println("First out : $it") }
    noReturn(3){
        println("First out : $it")
    }
    //crossinline 으로 인해 return 사용 불가
}

inline fun shortsFunc(a : Int, noinline out : (Int) -> Unit){
    println("Before calling out()")
    out(a)
    println("After calling out()")
}

inline fun noReturn(a : Int, crossinline out: (Int) -> Unit){
    println("Before calling out()")
    nestedFunc { out(a) }
    println("After calling out()")

}

inline fun nestedFunc(body : ()-> Unit){
    body()
}