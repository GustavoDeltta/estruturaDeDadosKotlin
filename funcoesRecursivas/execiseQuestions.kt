package funcoesRecursivas

// Crie uma função recursiva que calcule e retorne o fatorial de um número inteiro N.
fun fatorial(value: Int): Int{
    var response = value
    if (value != 1){
        response *= fatorial(value-1)
    }
    return response
}

fun main(){
    val response = fatorial(4)
    println(response)
}