package exercises
/*
? elvis operator guarantees a result returned
!! non-null assertion. This bypasses all the language checks for null safety
 */

fun main(){
//    nullableString()
    nullExercise()
}
fun sendMessageToClient(
    client: Client?, message: String?, mailer: Mailer
){
    if(client != null && message != null){
        client.personalInfo?.email?.let{
            mailer.sendMessage(it , message)
        }
    }
}
class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}

fun nullableString(){
    var catName: String? = "Lopez"
    println(catName!!.length.toString())
    catName = null
    println(catName?.length.toString())
}

fun nullExercise(){
    var number: String? = readLine()
    number = number?.toDouble()?.times(5)?.toString()
    println("Number is ${number}")
}