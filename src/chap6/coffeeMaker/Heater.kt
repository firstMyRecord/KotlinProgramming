package chap6.coffeeMaker

interface Heater {
    fun on()
    fun off()
    fun isHot() : Boolean
}