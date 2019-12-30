package exercises
fun main(){


    val clients = listOf("Alan", "Jorge", "Gabriel")
    //clients.forEach{client ->  println("Hola $client") }
    clients.filter{ it.length <= 5 }
        .forEach {client -> println("Hola $client") }
    println(clients.map{ it.length })
    println(clients.sortedBy{ it.length })
    println(clients.maxBy{ it.length })


    val numbers = setOf(10,24,45,8,2,36,14,72,100,20,79,77)
    //println(numbers.maxBy { it / 10 % 10 })
    //numbers.forEach { if(it % 2 != 0) println("odd number " + it * 2) else println("even number " + it / 2) }

    println(numbers.filter { it > 25 })
}