package funcoesRecursivas

import java.util.*

// 1 - Implemente uma função recursiva que, dado um número inteiro N, mostre a sequência decrescente de N até 1. (Concluída!)
fun showDescending(value: Int) {
    if (value!=0){
        print("$value ")
        showDescending(value-1)
    }
}

// 2 - Crie uma função recursiva que calcule e retorne o fatorial de um número inteiro N. (Concluída!)
fun fatorial(value: Int): Int{
    var response = value
    if (value != 1){
        response *= fatorial(value-1)
    }
    return response
}

// 3 - Construa uma função recursiva que, dados dois números inteiros X e N, retorne o cálculo da exponenciação x^N. (Concluída!)

fun exponential(base: Int, expo: Int): Int {
    var response = base
    if (expo != 1) {
        response *= exponential(base, expo - 1)
    }
    return response
}

// 4 - Usando recursividade, faça uma função que calcule a soma de todos os valores de uma lista de inteirosl. (Concluída!)

fun incrementList(numbers: List<Int>): Int{
    if (numbers.isEmpty()){
        return 0
    }
    return numbers.first() + incrementList(numbers.drop(1))
}

// 5 - Escreva uma função recursiva que determine e retorne quantas vezes um caractere K ocorre em uma string N. (Concluída!)

fun contain(letter: Char, word: String): Int{
    if (word.isEmpty()){
        return 0
    }
    var count = if (letter == word.first()) 1 else 0
    return count + contain(letter, word.drop(1))
}

// 6 - Escreva uma função recursiva que recebe uma String e retorne-a invertida. (Concluída!)

fun reverseString(text: String): String{
    var reversedString = ""
    if (text.isEmpty()){
        return ""
    }
    reversedString = text.last().toString() + reverseString(text.dropLast(1))
    return reversedString
}

// 7 - Faça uma função recursiva que calcule e retorne o N-ésimo termo da sequência Fibonacci. (Concluída!)

fun fibonacci(value: Int): Int{
    if (value == 1) return 0
    if (value == 2) return 1
    return fibonacci(value-1) + fibonacci(value-2)
}

fun main(){

    var response: Any

    println("1 - Implemente uma função recursiva que, dado um número inteiro N, mostre a sequência decrescente de N até 1.")
    print("N = ")
    showDescending(readln().toInt())
    println()
    println("-------------------------------------------------------------------------------------------------------------")

    println("2 - Crie uma função recursiva que calcule e retorne o fatorial de um número inteiro N.")
    print("N = ")
    response = fatorial(readln().toInt())
    println("Fatorial = ${response}")
    println("-------------------------------------------------------------------------------------------------------------")

    println("3 - Construa uma função recursiva que, dados dois números inteiros X e N, retorne o cálculo da exponenciação x^N.")
    print("X = ")
    val X = readln().toInt()
    print("N = ")
    val N = readln().toInt()
    response = exponential(X, N)
    println("Resultado da exponenciação: ${response}")
    println("-------------------------------------------------------------------------------------------------------------")

    println("4 - Usando recursividade, faça uma função que calcule a soma de todos os valores de uma lista de inteirosl.")
    println("Insira quatro números abaixo: ")
    var numbers = mutableListOf<Int>()
    for (i in 1..4){
        numbers.add(readln().toInt())
        response = numbers
    }
    response = incrementList(numbers)
    println("Soma de todos os números da lista ${numbers}: ${response}")
    println("-------------------------------------------------------------------------------------------------------------")

    println("5 - Escreva uma função recursiva que determine e retorne quantas vezes um caractere K ocorre em uma string N.")
    print("Insira uma palavra: ")
    var word = readln()
    print("Insira uma letra: ")
    val letter = readln().toCharArray()
    println("Quantas vezes a letra se repete na palavra: ${contain(letter.first(), word)}")
    println("-------------------------------------------------------------------------------------------------------------")

    println("6 - Escreva uma função recursiva que recebe uma String e retorne-a invertida.")
    print("Insira uma palavra: ")
    word = readln()
    println("Resultado da palavra invertida: ${reverseString(word)}")
    println("-------------------------------------------------------------------------------------------------------------")

    println("7 - Faça uma função recursiva que calcule e retorne o N-ésimo termo da sequência Fibonacci.")
    print("Insira uma posição da sequencia de fibonacci: ")
    response = fibonacci(readln().toInt())
    println("Esse é o número da sequência correspondente a posição escolhida: ${response}")

}