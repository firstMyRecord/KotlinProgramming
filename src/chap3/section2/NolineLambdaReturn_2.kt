package chap3.section2

fun main(){
    retfun2()
}

fun noline2(a : Int, b : Int, out : (Int, Int) ->Unit){ // 인라인 제거
    out(a, b)
}

fun retfun2(){
    println("Start of retFunc")
    noline2(4, 3){ a, b -> // 1. 람다식 블록의 시작 부분에 라벨을 지정
        val result = a + b
        if (result > 10) return@noline2 //  2. 라벨을 시작한 블록의 끝 부분으로 이동
        println("result : $result")
    } // 3. println  뛰어넘어서 이쪽으로 빠져나감
    println("end of retFunc") // 4. 실행 부분
}
