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
class people {
    private var map = mutableMapOf<String, List<String>>()
    fun addPerson(){
        print("Digite o cpf da pessoa que deseja adicionar: ")
        val cpf = readln()
        print("Agora informe o nome dessa pessoa: ")
        val name = readln()
        print("Por ultimo a idade: ")
        val age = readln()

        val nameAge = listOf(name, age)

        if (!map.containsKey(cpf)){
            map[cpf] = nameAge
        }else{
            println("Essa pessoa já está cadastrada.")
        }
    }
    fun showPersons(){
        println("Pessoas cadastradas: ")
        for ((cpf, nameAge) in map){
            println("CPF: $cpf: | $nameAge")
        }
    }
    fun search(){
        print("Digite o CPF de quem você deseja localizar: ")
        val cpf = readln()

        if (map.containsKey(cpf)){
            println("CPF: ${map[cpf]}")
        }else{
            println("Essa pessoa não foi cadastrada.")
        }
    }
    fun delete(){
        print("Digite o CPF de quem você deseja deletar: ")
        val cpf = readln()

        if (map.containsKey(cpf)){
            map.remove(cpf)
            println("Pessoa excluida com sucesso!")
        }else{
            println("Essa pessoa não foi localizada.")
        }
    }
    fun edit(){
        print("Digite o CPF de quem você deseja editar as informações: ")
        val cpf = readln()

        if (map.containsKey(cpf)){
            println("Digite o nome que você quer agora: ")
            val name = readln()
            println("Digite a idade que você quer agora: ")
            val age = readln()

            val nameAge = listOf(name, age)
            map[cpf] = nameAge

            println("Informações alteradas com sucesso!")
        }else{
            println("Essa pessoa não foi localizada.")
        }
    }
}
fun main(){

    /*println("Quest1: Construa um algoritmo que dada uma lista de números contabilize a ocorrência de repetições de valores.")
    val numbers = listOf(1, 2, 2, 3, 4, 4, 4)
    val frequencyNumbers = countNumbersRepeated(numbers)
    println(numbers)
    println(frequencyNumbers)
    println()

    println("Quest2: Construa um algoritmo que dada uma frase contabilize a ocorrência de repetições dos caracteres.")
    val text = "Um dia irei!"
    val frequencyChar = countCharRepeated(text)
    println(text)
    println(frequencyChar)*/

    val menu = people()

    while (true){

        println("Menu para cadastro de pessoas!")
        println("Opções: 1 - Cadastrar")
        println("        2 - Listar")
        println("        3 - Buscar (pelo cpf)")
        println("        4 - Excluir (pelo cpf)")
        println("        5 - Editar")
        println("        6 - Sair")

        print("Opção desejada: ")
        val option = readln()

        when(option){
            "1" -> menu.addPerson()
            "2" -> menu.showPersons()
            "3" -> menu.search()
            "4" -> menu.delete()
            "5" -> menu.edit()
            "6" -> break
            else -> println("Opção Invalida!")
        }

    }

}