# multibracketvalidation API

## BinaryTree

### Instance Methods

| Method | Return | Input | Description |
| --- | --- | --- | --- |
|BinaryTree<T>|none|none|Instantiates an empty BinaryTree.
|BinaryTree<T>|none|Collection<T> c|Instantiates a BinaryTree containing the values from the collection, via a reverse in order traversal.
|preOrderTraversal|List<T>|none|Return a list containing the values from the BinaryTree in preorder order.
|inOrderTraversal|List<T>|none|Return a list containing the values from the BinaryTree in inorder order.
|postOrderTraversal|List<T>|none|Return a list containing the values from the BinaryTree in postorder order.

## BinarySearchTree

### Instance Methods

| Method | Return | Input | Description |
| --- | --- | --- | --- |
|BinarySearchTree|none|none|Instantiates an empty BinarySearchTree.
|BinarySearchTree|none|Collection<Integer>|Instantiates a BinarySearchTree containing the values from the collection, via a reverse in order traversal.
|add|void|Integer val|Adds a new node to the BST containing the given value, in the appropriate location.
|contains|boolean|Integer val|Returns true if the value is contained in the BST, false otherwise.



## Space and Efficiency

### BinaryTree

| Method | Time | Space | Approach
| --- | --- | --- | ---


### BinarySearchTree

| Method | Time | Space | Approach
| --- | --- | --- | ---
|BinarySearchTree|O(1)|O(1)|calls the Object constructor
|BinarySearchTree(Collection<Integer> c)|O(n)|O(n)| Creates a new java.util.Queue using the given collection. Puts the first element from the queue in the root Node<Integer>, then iterates through the values in the created java.util.Queue, adding them to Nodes. As Nodes are created, they are enqueued into our java.stacksandqueues.Queue, and dequeued when a new current node is required.
|add|O(log(n))|O(1)|Traverses tree with >= and < until a suitable empty Node spot is found, and a new Node is created in that location wtih the given value
|contains|O(n)|O(1)|Uses a brute force breadth-first traversal to search every node for the given value.

### Queue

| Method | Time | Space | Approach
| --- | --- | --- | ---
|BinaryTree|O(1)|O(1)|calls the Object constructor
|BinarySearchTree(Collection<Integer> c)|O(n)|O(n)| Creates a new java.util.Queue using the given collection. Puts the first element from the queue in the root Node<Integer>, then iterates through the values in the created java.util.Queue, adding them to Nodes. As Nodes are created, they are enqueued into our java.stacksandqueues.Queue, and dequeued when a new current node is required.
|preOrderTraversal|O(n)|O(log(n))|recursively traverses the BinaryTree, outputting the node value before making calls on the child nodes
|inOrderTraversal|O(n)|O(log(n))|recursively traverses the BinaryTree, making a call on the left node, then outputting the current node's value, then making a call on the right node
|postOrderTraversal|O(n)|O(log(n))|recursively traverses the BinaryTree, outputting the node value after making calls on the child nodes