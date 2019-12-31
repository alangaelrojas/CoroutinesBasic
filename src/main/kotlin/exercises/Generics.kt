package exercises

/*
Una clase puede tener tipos de parametros
El tipo puede ser usado por variables y metodos
Util cuando una clase puede manejar multiple tipos de parametros
*/
fun main(){
    Box<Int, String>().display(24, "Alan Gael Garcia Rojas")
}

class Box<T, V> {
    fun display(age:T, name:V){
        println("Sr. $name, edad: $age")
    }
}
