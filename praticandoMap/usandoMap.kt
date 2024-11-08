package praticandoMap

import kotlin.system.measureTimeMillis

fun countRepeated(list: List<Int>){
    val copyList = list.toMutableList()
    while (copyList.isNotEmpty()){
        val first = copyList[0]
        val count = copyList.count() {it == first}
//        println("$first - ${count}x")
        copyList.removeAll{it == first}
    }
}

fun countRepeated2(list: List<Int>){
    val map = mutableMapOf<Int, Int>()
    for (c in list){
        if (map.containsKey(c)){
            val value = map[c]
            if (value != null){
                map[c] = value + 1
            }else{
                map[c] = 1
            }
        }
    }
//    for ((key, value) in map){
//        println("$key - ${value}x")
//    }
}

fun main(){
    val limit = 100
    val pairs = (2..limit step 2).toList()
    val testList = (1..limit).toMutableList()
    testList.addAll(pairs)
    testList.sort()

    val time1 = measureTimeMillis {
        countRepeated(testList)
    }

    println("Time 1: ${time1}ms")
    println("-".repeat(20))

    val time2 = measureTimeMillis {
        countRepeated(testList)
    }

    println("Time 2: ${time2}ms")
    println("-".repeat(20))

}