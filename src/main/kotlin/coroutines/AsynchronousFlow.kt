package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

fun main(){
//    runBlocking {
//        println("Receiving prime numbers")
//        coroutines.sendPrimesNumbers().collect{
//            println("Received prime number $it")
//        }
//        println("Finished receiving numbers")
//    }

    runBlocking {
        reduceOperator()
    }
}

fun sendPrimesNumbers(int: Int): Flow<Int> = flow {
    val primesList = listOf(2,3,5,7,11,13,17,19,23,29)
    primesList.forEach {
        delay(it * 100L)
        emit(it)
    }
}

fun sendPrimesNumbers() = listOf(2,3,5,7,11,13,17,19,23,29).asFlow()

suspend fun reduceOperator(){
    val size = 10
    val factorial = (1..size).asFlow()
        .reduce{ accumulator, value ->
            accumulator * value
        }
    println("Factorial of $size is $factorial")
}