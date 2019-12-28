import java.util.*
import kotlin.Comparator
import kotlin.collections.ArrayList

fun main(){

}
fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, Listado.print(arrayList))
    return arrayList
}

class Listado{
    companion object{
    }
}

fun Listado.Companion.print(listInts: ArrayList<Int>): Comparator<Int>{
    return compareBy(listInts)
}