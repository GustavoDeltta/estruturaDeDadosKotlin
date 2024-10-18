package funcoesRecursivas

fun repete(value: Int){
    println(value)
    if (value != 0){
        repete(value+1)
    }else{
        return
    }
}

fun repete(i: Int, j: Int){
    println(i)
    if (i==j){
        return
    }
    repete(i+1, j)
}

fun exponencial(base: Int, exp: Int): Int{
    var response = 1
    for (i in 1..exp){
        response *= base
    }
    return response
}

fun exponencialR(base: Int, exp: Int): Int{
    if (exp != 0){
        return base * exponencialR(base, exp - 1)
    }else{
        return 1
    }
}

fun main(){
    val response = exponencialR(2,6)
    println(response)
}