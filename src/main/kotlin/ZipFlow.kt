import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        //zip()
        combine()
    }
}

suspend fun zip() {
    val english = flowOf(1,2,3)
    val french = flowOf("Un", "Deux", "Troix")
    english.zip(french){a, b -> "$a in french is $b"}
        .collect{
            println(it)
        }
}

suspend fun combine(){
    val numbers = (1..5).asFlow().onEach { delay(300L) }
    val values = flowOf("One", "Two", "Three", "Four", "Five")
        .onEach{ delay(400L)}

    numbers.combine(values){a, b ->
        "$a -> $b"
    }
        .collect{ println(it)}
}
