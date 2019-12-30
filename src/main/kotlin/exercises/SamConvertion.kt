package exercises

import java.util.*

fun main(){
    println(getList())
}

private fun getList(): List<Int>{
    val arrayList = arrayListOf(1,2,5)
    arrayList.sortWith(Comparator { x, y -> y - x})
    return arrayList
}