package ordenacaoPorBolha

fun bubbleSort(list: MutableList<Int>){
    val size = list.size
    var switch: Boolean
    for (i in 0 until size - 1){
        switch = false
        for (j in 0 until size - i - 1){
            if (list[j] > list[j+1]){
                val temp = list[j]
                list[j] = list[j+1]
                list[j+1] = temp
                switch = true
            }
        }
        if (!switch) break
    }
}

fun main(){
    val list = mutableListOf(64, 34, 25, 12, 22, 11, 90)
    println("Lista original: $list")
    bubbleSort(list)
    println("Lista ordenada: $list")
}