package estruturaDeArvore

class Node(
    var data: Int,
    var left: Node? = null,
    var right: Node? = null
)

class Tree{

    private var root: Node? = null

    private fun addAux(root: Node?, new: Node): Node{
        if (root == null){
            return new
        }
        if (new.data>root.data){
            root.right = addAux(root.right, new)
        }
        else if (new.data<root.data){
            root.left = addAux(root.left,new)
        }
        return root
    }

    fun add(value: Int){
        root = addAux(root, Node(value))
    }

    private fun preOrder(root: Node?){
        if (root!=null){
            print("(${root.data}")
            preOrder(root.left)
            preOrder(root.right)
            print(")")
        }
    }
    fun showInPreOrder() {
        println()
        return preOrder(root)
    }
    fun search(value: Int): Int? {
        val response = searchValue(root,value)
        return response?.data
    }
    private fun searchValue(rootAux: Node? ,value: Int): Node? {
        if (root == null){
            return null
        }
        if (rootAux != null) {
            if (value>rootAux.data){
                return searchValue(rootAux.right, value)
            }
            else if (value<rootAux.data){
                return searchValue(rootAux.left, value)
            }
        }
        return rootAux
    }

    private fun min(rootAux: Node): Node{ // fazer retornar o valor, ao invés do nó.
        if (rootAux.left == null){
            return rootAux
        }
        return min(rootAux.left!!)
    }

//    private fun max(rootAux: Node): Node{
//        // retornar o maior valor da arvore.
//    }
    private fun deleteMain(rootAux: Node?, value: Int): Node?{
        if (rootAux == null){
            return null
        }
        if (value < rootAux.data){
            rootAux.left = deleteMain(rootAux.left, value)
        }else if (value > rootAux.data){
            rootAux.right = deleteMain(rootAux.right, value)
        }else{
            // 1. Testar se o nó não tem nenhum filho
            if (rootAux.left == null && rootAux.right == null){
                return null
            }
            // 2. Testar se o nó tem apenas um filho.
            if (rootAux.left == null){
                return rootAux.right
            }
            if (rootAux.right == null){
                return rootAux.left
            }
            // 3. O nó tem dois filhos.
            val minNode = min(rootAux.right!!)
            rootAux.data = minNode.data
            rootAux.right = deleteMain(rootAux.right, minNode.data)
        }
        return rootAux
    }
    fun delete(value: Int){
        root = deleteMain(root, value)
    }

//    fun showTravessiaEmLargura(){
//        // usar uma fila!
//    }

}

fun main(){
    val arvoreBinaria = Tree()

    arvoreBinaria.add(2)
    arvoreBinaria.add(9)
    arvoreBinaria.add(6)
    arvoreBinaria.add(19)
    arvoreBinaria.add(27)
    arvoreBinaria.add(25)
    arvoreBinaria.add(31)
    arvoreBinaria.add(23)

    arvoreBinaria.showInPreOrder()

    arvoreBinaria.delete(6)

    arvoreBinaria.showInPreOrder()

    arvoreBinaria.search(31)

}