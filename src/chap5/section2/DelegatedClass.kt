package chap5.section2

            /*클래스 위임*/

interface Car{
    fun go(): String
}

class VanImpl(private val power : String ): Car{
    override fun go() = "은 짐을 적재하며 $power 을 가집니다. "
}

class SportImpl(private val power: String) : Car {
    override fun go() = "은 경주용에 사용되며 $power 을 가집니다. "

}

class CarModel(private val model: String, impl: Car) : Car by impl{
    fun carInfo(){
        println("$model, ${go()}") // 1. 참조없이 각 인터페이스 구현 클래스 go의 접근
    }
}

fun main(){
    val mDamas = CarModel("Damas 2010", VanImpl("100마력"))
    val my350xz = CarModel("350Z 2008", SportImpl("350마력"))
    mDamas.carInfo()
    my350xz.carInfo()
}