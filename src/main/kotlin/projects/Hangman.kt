package projects

var gamePlayer: String? = null
var points = 0
var intents = 0
val words = listOf("Felipe", "Ricardo", "Gabriel")
val wordGame = words.random()
fun main(){
    println("Bienvenido al juego del ahorcado")
    println("Cual es tu nombre?")
    gamePlayer = readLine()
    println("Bienvenido al juego $gamePlayer")
    println("Comenzemos")
    instrucciones()
    jugar()

}

fun jugar(){
    println()
    for (i in wordGame.indices){
        print("_ ")
    }
    println()
    val input = readLine()?:" "
    findEquals(input[0])


}
fun instrucciones(){
    println("Teclee cualquier letra, si una letra coincide con la de la palabra secreta se mostrará, si no, tendra un error")
}

fun findEquals(letter: Char){
    if(wordGame.contains(letter)){
        if(points != wordGame.length) {
            points++
            jugar()
        } else {
            finishGame()
        }
    } else {
        invalidLetter()
    }
}

fun finishGame() {
    println("Haz ganado")
    println("La palabra era $wordGame")
}

fun invalidLetter(){
    if(intents < 3 ){
        intents++
        println("No se encuentra. strike!!  " +
                "Intentos: $intents de 3")
        jugar()
    } else{
        println("Haz fallado")
    }
}


