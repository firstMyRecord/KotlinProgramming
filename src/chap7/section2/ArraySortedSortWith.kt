package chap7.section2

data class ArraySortedSortWith(val name : String, val price : Double)

fun main(){
    val arraySortedSortWith = arrayOf(
        ArraySortedSortWith("Snow Ball", 870.00),
        ArraySortedSortWith("Smart Phone", 999.00),
        ArraySortedSortWith("Drone", 240.00),
        ArraySortedSortWith("Mouse", 333.55),
        ArraySortedSortWith("keyboard", 125.99),
        ArraySortedSortWith("Monitor",1500.99),
        ArraySortedSortWith("Tablet", 512.99))
    
    
    arraySortedSortWith.sortWith( // Comparator를 이용해 두 객체를 비교해 p1 이 크면 1, 같으면 0 , 작으면 -1
        Comparator<ArraySortedSortWith>{ p1, p2 ->
            when{
                p1.price > p2.price -> 1
                p1.price == p2.price -> 0
                else -> -1
            }
        }
    )
    arraySortedSortWith.forEach { println(it) }
}


