package chap7.section2

data class arraySortedSortWithClass(val name : String, val price: Double)

fun main(){
    val arraySortedSortWithClass = arrayOf(
        arraySortedSortWithClass("Snow Ball", 870.00),
        arraySortedSortWithClass("Smart Phone", 999.00),
        arraySortedSortWithClass("Drone", 240.00),
        arraySortedSortWithClass("Mouse", 333.55),
        arraySortedSortWithClass("keyboard", 125.99),
        arraySortedSortWithClass("Monitor",1500.99),
        arraySortedSortWithClass("Tablet", 512.99)
    )
    arraySortedSortWithClass.sortBy { it.price } // 오름차순으로 정렬
    arraySortedSortWithClass.forEach { println(it) }
}