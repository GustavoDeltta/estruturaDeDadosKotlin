package funcoesRecursivas

// Implemente uma função recursiva que, dado um número inteiro N, mostre a sequência decrescente de N até 1. (Concluída!)
fun showDescending(value: Int) {
    if (value!=0){
        print("$value ")
        showDescending(value-1)
    }
}

// Crie uma função recursiva que calcule e retorne o fatorial de um número inteiro N. (Concluída!)
fun fatorial(value: Int): Int{
    var response = value
    if (value != 1){
        response *= fatorial(value-1)
    }
    return response
}

fun main(){

    println("O fatorial de 4 é: ${fatorial(4)}")

    print("A ordem decrescente de 6 até 1 é: ")
    showDescending(6)

}