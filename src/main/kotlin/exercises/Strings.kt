package exercises

fun main(){

    val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"
    println(getPattern("11.RRR.1952"))
}

fun getPattern(month: Any): String = """"\d{2} ${month} \d{4}"""