package ordenacaoPorSelecao

fun selectionSort(list: MutableList<Int>){
    val size = list.size
    for (i in 0 until size - 1){
        var minIndex = i
        for (j in i + 1 until size){
            if (list[j]<list[minIndex]){
                minIndex = j
            }
        }
        if (minIndex != i){
            val temp = list[i]
            list[i] = list[minIndex]
            list[minIndex] = temp
        }
    }
}
fun main(){
    val list = mutableListOf(64, 34, 25, 12, 22, 11, 90)
    println("Lista original: $list")
    selectionSort(list)
    println("Lista ordenada: $list")
}