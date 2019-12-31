package exercises
val names = arrayListOf("Alan", "Jorge", "Gabriel")
fun main(){
    for (name in names) {
        println(name.saludo())
    }
    println(names.howMany())
}

fun String.saludo() = "Bienvenido a la empresa: $this"

fun ArrayList<String>.howMany() = "Tamaño $size"

