fun maior(list: List<Int>, maior: Int = list[0]):Int{
    if (list.isEmpty())
        return maior
    if (list[0]>maior) {
        return maior(list.drop(1), list[0])
    }
    return maior(list.drop(1),maior)
}

fun main() {
    val list = listOf(6,1,19,80,550,10,190)
    println(maior(list))
}