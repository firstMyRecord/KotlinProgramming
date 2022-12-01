package chap5.section3

class Person1{
    companion object{
        const val LEVEL1 = "INTERMEDIATE"
        @JvmStatic fun login1() { // 이노테이션 표기 사용
          println("login..")
        }
    }
}