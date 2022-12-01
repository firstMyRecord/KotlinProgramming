package chap3.section2

fun main(){
    retFunc()
}

inline fun inlineLamda(a : Int, b : Int, out : (Int, Int) ->Unit){
    out(a, b)
}

fun retFunc(){
    println("Start of retFunc")
    inlineLamda(1, 3){a, b ->
        val result = a + b
        if (result > 10) return // result가 10보다 크면 return 반환
        println("result : $result")
    }
    println("end of retFunc")
}
