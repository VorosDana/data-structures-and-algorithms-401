## API

### Stacks and Queues

#### Instance Methods

| Method | Return | Input | Description |
| --- | --- | --- | --- |
| Constructor | MyLinkedList | none | Creates a new MyLinkedList with no Nodes
| Constructor | MyLinkedList | value<T> | Creates a new MyLinkedList with one node, containing the provided value. |
| getHeadValue | <T> value | none | Returns value contained in the head Node |
| insert | void | <T> value | Creates a new Node containing the given value at the head of the MyLinkedList |
| append | void | <T> value | Creates a new Node containing the given value at the tail of the MyLinkedList |
| insertBefore | boolean | <T> newValue, <T> targetValue | Searches for a Node containing targetValue and inserts a new Node containing newValue immediately before it. If targetValue is not found, no insertion is made. Returns a boolean indicating success or failure of insertion.
| insertAfter | boolean | <T> newValue, <T> targetValue | Searches for a Node containing targetValue and inserts a new Node containing newValue immediately after it. If targetValue is not found, no insertion is made. Returns a boolean indicating success or failure of insertion.
| insertKthFromEnd | void | <T> newValue, int k | Inserts a new Node containing newValue k postions before the last node. Throws an IndexOutOfBoundsException if k < 0 or k >= MyLinkedList size. |
| contains | boolean | <T> value | Searches for a Node containing provided value, returns true if found, false if not.
| size | int |  | Counts the Nodes in the MyLinkedList and returns the number of Nodes.|

### Queue

#### Static Methods

| Method | Return | Input | Description |
| --- | --- | --- | --- |



## Space and Efficiency

### Stack

| Method | Time | Space |
| --- | --- | --- |


### Queue

| Method | Time | Space |
| --- | --- | --- |
