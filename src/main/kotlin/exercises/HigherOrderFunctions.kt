package exercises
    /*
    HOF or Higher Order Functions is a function that takes another functions as a parameter
     */
fun main(){

    val mensajeBienvenidaLambda = { name: String -> println("Hola $name") }
    sayHello(arrayListOf("Alan", "Jorge", "Gabriel"), mensajeBienvenidaLambda)

    println(dividedByTen(arrayListOf(10,20,30,40,50)) { number: Int -> number / 10 })

    println(names(arrayListOf("Alan", "Jorge", "Gabriel")) { name: String -> "Bienvenido $name" })
}
private fun sayHello(names: ArrayList<String>, doSomething:(String) -> Unit){
    for(name in names){
        doSomething(name)
    }
}

private fun dividedByTen(numbers: ArrayList<Int>, divider: (Int) -> Int): ArrayList<Int> {
    for(i in 0 until numbers.size){
        numbers[i] = divider(numbers[i])
    }
    return numbers
}

private fun names(names: ArrayList<String>, messageNames: (String) -> String): ArrayList<String>{
    for(i in 0 until names.size){
        names[i] = messageNames(names[i])
    }
    return names
}


