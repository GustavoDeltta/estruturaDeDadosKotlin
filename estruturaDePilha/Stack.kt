package estruturaDePilha

class Stack<T>{

    private var size = 0

    private var top: Node<T>? = null

    private class Node<T>(val value: T, val next: Node<T>?)

    fun push(item: T): Boolean{
        val newNode = Node(item, top)
        top = newNode
        size++
        return true
    }

    fun pop(): Boolean{
        if (top == null){
            return false
        }else{
            top = top?.next
            size--
            return true
        }
    }

    fun peek(): T?{
        return top?.value
    }

    fun view(){
        print("[")
        var aux = top
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
        if (top == null){
            return false
        }else{
            top = null
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

    println("Elemento do topo: ${stack.peek()}")

    stack.pop()

    stack.view()

    println()

    println("Tamanho da Pilha: ${stack.size()}")

    stack.clear()

    stack.view()

    println()

    println("Tamanho da Pilha: ${stack.size()}")

}
