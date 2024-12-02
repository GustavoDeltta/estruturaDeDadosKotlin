package praticandoMap

import com.sun.source.util.Plugin
import org.w3c.dom.Text
import kotlin.system.measureTimeMillis

// Quest1: Construa um algoritmo que dada uma lista de números contabilize a ocorrência de repetições de valores.

fun countNumbersRepeated(numbers: List<Int>): Map<Int, Int>{
    val count = mutableMapOf<Int, Int>()
    for (number in numbers){
        count[number] = count.getOrDefault(number, 0) + 1
    }
    return count
}

// Quest2: Construa um algoritmo que dada uma frase contabilize a ocorrência de repetições dos caracteres.
fun countCharRepeated(text: String): Map<Char, Int>{
    val count = mutableMapOf<Char, Int>()
    for (character in text){
        if (character != ' '){
           count[character] = count.getOrDefault(character, 0) + 1
        }
    }
    return count
}



fun main(){

    println("Quest1: Construa um algoritmo que dada uma lista de números contabilize a ocorrência de repetições de valores.")
    val numbers = listOf(1, 2, 2, 3, 4, 4, 4)
    val frequencyNumbers = countNumbersRepeated(numbers)
    println(numbers)
    println(frequencyNumbers)
    println()

    println("Quest2: Construa um algoritmo que dada uma frase contabilize a ocorrência de repetições dos caracteres.")
    val text = "Um dia irei!"
    val frequencyChar = countCharRepeated(text)
    println(text)
    println(frequencyChar)

}