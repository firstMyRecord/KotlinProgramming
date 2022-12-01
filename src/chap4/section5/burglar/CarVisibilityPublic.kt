package chap4.section5.burglar

open class Car protected constructor(_year: Int, _model: String, _power: String, _wheel: String) { // 1.
    private var year: Int = _year
    public var model: String = _model // public은 기본값이므로 생략 가능
    protected open var power: String = _power
    internal var wheel: String = _wheel

    protected fun start(key: Boolean) {
        if (key) println("Start the Engine!!")
    }

    class Driver(_name: String, _licence: String) {
        private var name: String = _name
        var licence: String = _licence
        internal fun driving() = println("[Driver] Driving() - $name")
    }
}


class Tico(
    _year: Int, _model: String, _power: String, _wheel: String, var name: String, private var key: Boolean
) : Car(_year, _model, _power, _wheel) {
    override var power: String = "50hp"
    val driver = Driver(name, "first Class")

    constructor(_name: String, _key: Boolean) : this(2014, "basic", "100hp", "normal", _name, _key) {
        name = _name
        key = _key

    }


    fun access(password: String) {
        if (password == "gotigo") {
            println("--------[Tico] access()----------")
            // 3. Super.year prviate 접근 불가
            println("super.model = ${super.model}") //public
            println("super.power = ${super.power}")// protected
            println("super.wheel = ${super.wheel}") // internal
            super.start(key)

            //driver.name privare 접근 불가
            println("Driver().licence = ${driver.licence}")// public
            driver.driving()
        }else{
            println("You're a Burglar!!")
        }
    }
}

class Burglar() {
    fun steal(anycar : Any){
        if (anycar is Tico){
            println("----[Burglar] steal()----")
            // println(anycar.power) 상속되어 있지 않기에 protected 접근 불가
            // println(anycar.year) private 접근 불가 같은 private 클래스 내에서 접근 가능
            println("anycar.name = ${anycar.name}") // public 접근
            println("anycar.wheel = ${anycar.wheel}") // 같은 모듈 안이라 internal 접근 가능
            println("anycar.model = ${anycar.model}") // public 접

            println(anycar.driver.licence) // public 접근
            anycar.driver.driving() // 같은 모듈 안이라 internal 접근 가능
            // println(Car.start()) prviate 접근 불가
            anycar.access("Don't know")
        } else{
            println("Nothing to steal")
        }
    }
}


fun main() {
    // val car = Car() protected 객체 생성 불가
    val tico = Tico("hyeon", true)
    tico.access("gotico")

    val burglar = Burglar()
    burglar.steal(tico)
}