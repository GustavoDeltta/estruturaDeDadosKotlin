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

    /*private fun delete(rootAux: Node?, value: Int): Node? {
        AVEMARIA DOIDO!
    }*/
}

fun main(){
    val arvoreBinaria = Tree()

    arvoreBinaria.add(8)
    arvoreBinaria.add(3)
    arvoreBinaria.add(10)
    arvoreBinaria.add(1)
    arvoreBinaria.add(6)
    arvoreBinaria.add(14)
    arvoreBinaria.add(4)
    arvoreBinaria.add(7)

    arvoreBinaria.showInPreOrder()

    println(arvoreBinaria.search(6))

}