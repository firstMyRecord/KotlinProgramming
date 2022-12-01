package chap5.section3

// 캠패니언 객체

class Person{
    var id : Int = 0            /* 캠패니언 객체가 아니라서 접근하면 오류남*/
    var name : String = "Hyeon" /* 캠패니언 객체가 아니라서 접근하면 오류남*/
    companion object {
        var language : String = "Korean"
        fun work(){
            println("Working....hh")
        }
    }
}


fun main(){
    Person.language // 객체 인스턴스를 생성하지 않고 기본값 적용
    Person.language = "ChinaFucking" //기본값 변경 가능
    println(Person.language) // 변경된 내용 출력
    Person.work() // 캠퍼니언 객체 내 메소드 실행
}