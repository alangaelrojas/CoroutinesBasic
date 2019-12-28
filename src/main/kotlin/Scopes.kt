import kotlinx.coroutines.*

var functionCall = 0

fun main(){

    /*
    val col = listOf(1,2,3,4,5,6,7,8,9)
    //print("Hello, ")
    println(toJSON(col))
    useFoo()
    containsEven(col)
    println(Pair(10,5))
    Thread.sleep(5000)
    runBlockingCoroutine()
     */

    GlobalScope.launch { sayHello() }
    GlobalScope.launch { improveMessage() }
    print("Hello, ")
    Thread.sleep(2000L)
    println("There have been $functionCall calls so far")

}
//coroutines
fun goCoroutine(){
    GlobalScope.launch{
        for (i in 1 until 20) {
            delay(1000)
            println("$i World")
        }
    }
}
fun repeatCoroutine(){
    runBlocking {
        repeat(100_000){
            launch {
                println("-")
            }
        }
    }
}
fun runBlockingCoroutine(){
    println("Program execution will now block")
    runBlocking {
        launch {
            delay(10000L)
            println("Task from runBlocking")
        }


        GlobalScope.launch {
            delay(5000L)
            println("Task from GlobalScope")
        }

        coroutineScope {
            launch {
                delay(15000L)
                println("Task from coroutineScope")
            }
        }
    }
    println("Program execution will now continue")
}
suspend fun sayHello(){
    delay(500L)
    println("Hello!")
    functionCall++
}

suspend fun improveMessage(){
    delay(1000L)
    println("Suspend functions are cool")
    functionCall++
}

//iterators and collections
fun toJSON(collection: Collection<Int>): String {
    val sb = StringBuilder()
    sb.append("[")
    val iterator = collection.iterator()
    while (iterator.hasNext()) {
        val element = iterator.next()
        sb.append(element)
        if (iterator.hasNext()) {
            sb.append(", ")
        }
    }
    sb.append("]")
    return sb.toString()
}

//avoid java overloads methods
fun foo(name: String = "Hola", number: Int = 42, toUpperCase: Boolean = false) =
    (if (toUpperCase) name.toUpperCase() else name) + number

fun useFoo() = listOf(
    println(foo("a")),
    println(foo("b", number = 1)),
    println(foo("c", toUpperCase = true)),
    println(foo(name = "d", number = 2, toUpperCase = true))
)
fun containsEven(collection: Collection<Int>): Boolean = collection.any {number ->
    return collection.contains(1)
}

