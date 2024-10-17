package estruturaDeFila

class Queue<T>{

    private var size = 0

    private var start: Node<T>? = null

    private var end: Node<T>? = null

    private class Node<T>(val value: T, var next: Node<T>? = null)

    fun enqueue(item: T){
        val newItem = Node(item)
        if (end != null){
            end?.next = newItem
        }
        end = newItem
        if (start == null){
            start = end
        }
        size++
    }

    fun dequeue(): Boolean{
        start = start?.next
        if (start == null){
            end = null
        }
        size--
        return true
    }

    fun start(): T?{
        return start?.value
    }

    fun view(){
        print("[")
        var current = start
        while (current != null) {
            print(current.value)
            current = current.next
            if (current != null) {
                print(", ")
            }
        }
        println("]")
    }

    fun size(): Int{
        return size
    }

    fun clear(): Boolean{
        if (start == null){
            return false
        }else{
            start = null
            size = 0
            return true
        }
    }

}

fun main(){

    val queue = Queue<Int>()

    queue.enqueue(10)
    queue.enqueue(20)
    queue.enqueue(30)


    queue.view() // Visualiza a fila

    println("Elemento do incio: ${queue.start()}")

    println("Tamanho da Fila: ${queue.size()}")

    queue.dequeue()

    queue.view()

    println("Elemento do incio: ${queue.start()}")

    println("Tamanho da Fila: ${queue.size()}")

    queue.clear()

    queue.view()

    println("Tamanho da Fila: ${queue.size()}")

}