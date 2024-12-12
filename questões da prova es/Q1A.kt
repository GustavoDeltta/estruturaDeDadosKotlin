fun resto(a:Int, b: Int):Int{
    if (a<b)
        return a
    return resto(a-b,b)
}

fun main() {
    println(resto(10,4))
}