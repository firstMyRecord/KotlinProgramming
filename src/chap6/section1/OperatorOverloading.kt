package chap6.section1
/*
open class Point(var x :Int = 0, var y: Int = 10){
    //plus함수의 연산자오버로딩
    operator fun plus(p:Point) : Point{
        return Point(x +p.x, y + p.y)

    }
}
class Point2(x: Int,y: Int) : Point(x, y) {
    operator fun dec() = Point2(--x,--y)
}



fun main(){
    val p1 = Point(3,-8)
    val p2 = Point(2, 9)
    var point = Point()
    point = p1 + p2

    println("point = (${point.x}, ${point.y})")
}
fun secondMain() {
    val point2 = Point2()
}
*/