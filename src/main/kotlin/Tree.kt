class Tree {

    var root: Node<Int>? = null

    fun createTree(element: Int) {

        root = insertNode(element = element)

    }

    fun insertNode(element: Int): Node<Int>? {

        return insertNode(element, root)

    }

    private fun insertNode(element: Int, currentNode: Node<Int>?): Node<Int>? {

        var node: Node<Int>? = currentNode

        if (currentNode == null) {

            node = Node(element)

        } else if (element < currentNode.value) {

            currentNode.left = insertNode(element, currentNode.left)

        } else if (element > currentNode.value) {

            currentNode.left = insertNode(element, currentNode.right)

        }

        return node

    }


}