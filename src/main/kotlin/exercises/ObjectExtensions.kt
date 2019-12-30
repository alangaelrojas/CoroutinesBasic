package exercises

import java.util.*
import kotlin.Comparator

fun main(){

    println(getList())

}

// object extensions for Comparator
private fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object: Comparator<Int> {
        override fun compare(o1: Int, o2: Int) = o2 - o1
    })
    return arrayList
}