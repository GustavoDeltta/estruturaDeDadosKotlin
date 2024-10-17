package estruturaDePilha

class Stack<T>{

    private var size = 0

    private var bottom: Node<T>? = null

    private class Node<T>(val value: T, var next: Node<T>? = null)

    fun push(value: T) {
        if (bottom == null){
            bottom = Node(value, null)
        }else{
            var aux = bottom
            while (aux?.next != null) {
                aux = aux.next
            }
            aux?.next = Node(value, null)
        }
        size++
    }

    fun pop(): Boolean{
        if (bottom == null){
            return false
        }else{
            var aux = bottom
            while (aux?.next?.next != null){
                aux = aux.next
            }
            aux?.next = null
            size--
            return true
        }
    }

    fun bottom(): T?{
        return bottom?.value
    }

    fun view(){
        print("[")
        var aux = bottom
        while (aux != null){
            print(aux.value)
            aux = aux.next
            if (aux!=null){
                print(", ")
            }
        }
        print("]")
    }

    fun size(): Int{
        return size
    }

    fun clear(): Boolean{
        if (bottom == null){
            return false
        }else{
            bottom = null
            size = 0
            return true
        }
    }

}

fun main(){

    val stack = Stack<Int>()

    stack.push(10)
    stack.push(20)
    stack.push(30)

    stack.view()

    println()

    println("Tamanho da Pilha: ${stack.size()}")

    println("Elemento inicial: ${stack.bottom()}")

    stack.pop()

    stack.view()

    println()

    println("Tamanho da Pilha: ${stack.size()}")

    stack.clear()

    stack.view()

    println()

    println("Tamanho da Pilha: ${stack.size()}")

}
