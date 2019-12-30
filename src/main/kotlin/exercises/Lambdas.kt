package exercises

fun main(){
    /*
    Lambdas: Un a lambda es una funcion anonima o que no tiene nombre, tiene parametrso de entrada, asi como de salida.
     */

    val mensajeBienvenida = {name: String, empresa: String ->
        println("Hola $name, Bienvenido a $empresa")}
    mensajeBienvenida("Alan Garcia", "MAVI S.A. de C.V.")
}