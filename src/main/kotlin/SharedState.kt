import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main(){
    runBlocking {
        var counter = 0
        withContext(Dispatchers.Unconfined){
            massiveRun{ counter++}
        }
        println("Counter = $counter")
    }
}

suspend fun massiveRun(action: suspend() -> Unit){
    val n = 100
    val k = 1000
    var counters = 0
    val time = measureTimeMillis {
        coroutineScope {
            repeat(n){
                launch {
                    repeat(k) {
                        action()
                        counters++
                    }
                }
            }
        }
    }
    println("Completed ${n + k } actions in time $time ms with this counters $counters")
}