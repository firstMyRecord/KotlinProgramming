package chap3.section3

import java.lang.Exception

class InvalidNameException(message : String) : Exception(message) // 1. 사용자 예외 클래스

fun main(){
    var name = "hyeon123" // 2. 숫자가 포함된 이름
    try {
        validateName(name)
    } catch (e : InvalidNameException){   // 3. 숫자가 포함된 예외 처리
        println(e.message)
    } catch (e : Exception){   // 기타 예외 처리
        println(e.message)
    }

}

fun validateName(name : String){
    if (name.matches(Regex(".\\d+.*"))) { // 4. 숫자가 포함되어 있으면 예외를 발생 시
        throw InvalidNameException("Your name : $name : contains numerals.")
    }
}