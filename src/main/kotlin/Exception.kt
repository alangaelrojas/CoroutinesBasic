import kotlinx.coroutines.*
import java.lang.ArithmeticException
import java.lang.Exception
import kotlin.IndexOutOfBoundsException
import kotlin.coroutines.coroutineContext

/*
Exception behavior depends on the coroutine builder
launch
- Propagates through the parent-child hierarchy
- The exception will be thrown and jobs will fail
- Use try-catch or an exception handler

async
- Exceptions are deferred until the result is consumed
- if the result is not consumed, the exception is never thrown
- try-catch in the coroutine or in the await() call
 */
fun main(){
    val handler = CoroutineExceptionHandler{ coroutineContext, throwable ->
        println(throwable.localizedMessage)
        println(coroutineContext)
        println("No manches, te pasas... :(")
    }

    runBlocking {
        val job = GlobalScope.launch(handler) {
            throw IndexOutOfBoundsException("exception in the coroutine")
        }

        job.join()

        val deferred = GlobalScope.async {
            println("Thrworing exception into async")
            throw ArithmeticException("exception from async")
        }

        try {
            deferred.await()
        } catch (e: Exception){
            println(e.localizedMessage)
        }
    }
}


