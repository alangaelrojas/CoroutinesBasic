package exercises

fun main(){
    val chef1 = Chef<Apple>()
    val chef2 = Chef<Banana>()
    chef1.cook(Apple())
    chef2.cook(Banana())
}

abstract class Fruit{
    abstract fun peel()
}

class Apple: Fruit(){
    override fun peel() {
        println("Peeling the apple")
    }
}

class Banana: Fruit(){
    override fun peel() {
        println("Peeling the banana")
    }
}

class Chef<T: Fruit>{
    fun cook(item: T){
        item.peel()
    }
}