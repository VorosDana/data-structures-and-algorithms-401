# Stack and Queues API

## MyLinkedList**

### Instance Methods

#### Stack

| Method | Return | Input | Description |
| --- | --- | --- | --- |
|Constructor<T> | new Stack | none | Creates an empty Stack that wraps elements of type T
|push | void | T newValue | creates and inserts a new Node containing newValue at the top of the stack
|pop | T removedValue | void | Removes most recently inserted Node and returns its value
|peek | T peekedValue | void | Return value of most recently inserted Node, does NOT remove it

#### Queue

### Static Methods

| Method | Return | Input | Description |
| --- | --- | --- | --- |
|Constructor<T> | new Queue | none | Creates an empty Queue that wraps elements of type T
|enqueue | void | T newValue | creates and inserts a new Node containing newValue at the rear of the queue
|dequeue | T removedValue | void | Removes least recently inserted Node and returns its value
|peek | T peekedValue | void | Return value of least recently inserted Node, does NOT remove it


## Space and Efficiency

### Stack

| Method | Time | Space |
| --- | --- | --- |
|Constructor | O(1) | O(1)
|push | O(1) | O(1)
|pop | O(1) | O(1)
|peek | O(1) | O(1)


### Queue

| Method | Time | Space |
| --- | --- | --- |
|Constructor | O(1) | O(1)
|enqueue | O(1) | O(1)
|dequeue | O(1) | O(1)
|peek | O(1) | O(1)
