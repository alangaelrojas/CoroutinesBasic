import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

/*
witchContext permite comunicar entre contextos de diferentes coroutines, ya sea IO, Main, Default, Unconfined
 */

fun main(){
    runBlocking{
        launch(Dispatchers.Default) {
            println("First context: $coroutineContext")
            withContext(Dispatchers.IO){
                println("Second context: $coroutineContext")
            }
        }
    }
}