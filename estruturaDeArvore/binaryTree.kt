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
        else if (new.data < root.data){
            root.left = addAux(root.left,new)
        }
        return root
    }

    fun add(value: Int){
        root = addAux(root, Node(value))
    }

    fun showInPreOrder(root: Node?){
        if (root!=null){
            print("(${root.data}")
            showInOrder(root.left)
            showInOrder(root.right)
            print(")")
        }
    }
}

fun main(){

}