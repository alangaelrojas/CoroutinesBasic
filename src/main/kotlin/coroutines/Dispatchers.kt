package coroutines
import kotlinx.coroutines.*
import java.io.File

fun main(){
    /*
    Dispatcher determinates wich thread or thread pool the coroutines runs on
    launch(Dispatchers.Default){
        // do some CPU intensive task here
    }
    launch(Dispatchers.IO){
        // do for netwokr communications or reading/writing files
    }
    launch(Dispatchers.Unconfined){
        // start the coroutine in the inherited dispatcher that called it
    }
     */

    runBlocking {
//        launch(Dispatchers.Main) {
//            println("Main dispatcher. Thread: ${Thread.currentThread().name}")
//        }
        launch(Dispatchers.Unconfined) {
            println("Unconfined. Thread. ${Thread.currentThread().name}")
            delay(500L)
            println("Unconfined2. Thread. ${Thread.currentThread().name}")
        }

        launch(Dispatchers.IO) {
            println("IO dispatcher. Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default) {
            File("text.txt").writeText("lorem ipsum")
            val fileContent = File("text.txt").readText()
            println("File finished")
            println("The text content is $fileContent")
            println("Default dispatcher. Thread ${Thread.currentThread().name}")
        }
    }
}