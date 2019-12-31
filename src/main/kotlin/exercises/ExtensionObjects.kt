package exercises

fun main(){
    Book.printMe()
    String.getClassType()
    Double.getClassType()
}
fun Book.Companion.printMe(){
    println("Car companion object")
}
class Book{
    companion object
}

fun String.Companion.getClassType() = println("This is a String class")

fun Double.Companion.getClassType() = println("This is a Double class")