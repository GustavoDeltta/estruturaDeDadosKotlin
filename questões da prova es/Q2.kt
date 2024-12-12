class Menu {
    private var map = mutableMapOf<String, Int>()

    fun acrescentarVolume() {
        println("Informações para cadastro")
        print("Informe o mês(apenas as 3 primeiras letras)")
        val mes = readln().uppercase()
        print("Informe o volume")
        val volume = readln().toInt()

        if (!map.containsKey(mes))
            map[mes] = volume
        else
            map[mes] = map[mes]!! +volume
    }

    fun listar() {
        println("Informações")
        for ((chave, valor) in map) {
            println("Mês de $chave: $valor")
        }
    }

    fun buscar() {
        println("informe o Mês para ser buscado")
        val mes = readln().uppercase()

        if (map.containsKey(mes)) {
            println("Volume: ${map[mes]}")
        } else {
            println("Mês $mes não está cadastrado")
        }
    }

    fun excluir() {
        println("informe o mês para ser excluido")
        val mes = readln().uppercase()

        if (map.containsKey(mes)) {
            map.remove(mes)
            println("removido com sucesso")
        } else {
            println("Mês $mes não está cadastrado")
        }
    }

}


fun main() {
    val menu = Menu()

    while (true){
        println(
            "\nEscolha uma opção:\n" +
                    "1- Acrescentar volume\n" +
                    "2- Listar volumes\n" +
                    "3- Buscar volume (pelo mês)\n" +
                    "4- Excluir volume (pelo mês)\n" +
                    "5- Sair"
        )
        var opc = readln()

        when(opc){
            "1"-> menu.acrescentarVolume()
            "2"-> menu.listar()
            "3"-> menu.buscar()
            "4"-> menu.excluir()
            "5"-> break
            else -> println("opção invalida")
        }
    }
}