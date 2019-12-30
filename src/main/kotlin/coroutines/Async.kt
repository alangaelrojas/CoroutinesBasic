package coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.random.Random

/*
Async is the scope for coroutine suspend methods to use await propertie and wait for the return values,
this is important for large duration process

.await is of async or GlobalScope.async, and wait the return values
 */

fun main(){
    runBlocking{
        val valueFirts = GlobalScope.async {
            getFirstValue()
        }

        val valueSecond = async {
            getSecondaValue()
        }

        println("Doing some processing values")
        delay(500L)
        println("Waiting for values")

        val firstVal = valueFirts.await()
        val secondVal = valueSecond.await()

        println("The total of values ${firstVal + secondVal}")

    }
}

suspend fun getFirstValue(): Int{
    delay(5000L)
    val value = Random.nextInt(100)
    println("Returning first value $value")
    return value
}

suspend fun getSecondaValue(): Int{
    delay(2000L)
    val value = Random.nextInt(1000)
    println("Returning second value $value")
    return value
}