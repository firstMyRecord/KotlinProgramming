package chap7.section2

import java.util.Arrays // 배열을 사용하기 위한 자바 표준 라이브러리 임포트

fun main(){
    val arr = intArrayOf(1, 2, 3, 4, 5)

    println("arr : ${Arrays.toString(arr)}") // 배열의 내용을 문자열로 변환
    println("size : ${arr.size}")
    println("sum : ${arr.sum()}") // sum 메소드는 배열의 합을 계산

    //getter에 의한 접근과 대괄호 연산자 표기
    println(arr.get(2))
    println(arr[2])

    //setter에 의한 값의 설정
    arr.set(2, 7)
    arr[0] = 8
    println("size : ${arr.size}, arr[0] : ${arr[0]}, arr[2] : ${arr[2]}")

    // 루프를 이용한 배열 요소의 접근
    for (element in arr.indices){ // indices 는 배열의 유효범위 반환
        println("arr[element] : ${arr[element]}")

    }


}