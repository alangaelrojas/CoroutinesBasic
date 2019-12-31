package exercises

fun main(){
//    val printer = Printer<Collection<String>>()
//    printer.printCollection(arrayListOf("Alan", "Jorge", "Mario", "Gilberto"))
    val geometry = Geometry<Circle>()
    geometry.printArea(Circle())

}

class Printer<T: Collection<String>>{
    fun printCollection(collection: T){
        collection.forEach { println(it) }
    }
}

abstract class Shape{
    abstract fun getArea(size: Int): Double
}

class Square :Shape(){
    override fun getArea(size: Int) = (size * size).toDouble()
}

class Circle: Shape(){
    override fun getArea(size: Int) = size * size * 3.141516
}

class Geometry<T: Shape>{
    fun printArea(area: T){
        println("The area is ${area.getArea(15)}")
    }
}