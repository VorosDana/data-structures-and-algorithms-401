## Stacks and Queues API

### Stacks

#### Instance Methods

| Method | Return | Input | Description |
| --- | --- | --- | --- |
| Constructor<T> | new Stack | none | Creates a new empty Stack that holds values of type T
|push | void | T newValue |  Creates a new value containing newValue and puts it at the top of the Stack
|pop | T removedValue | none | Removes the most recently added Node and returns the value it contains
|peek|T peekedValue|none|Returns the most recently added value. Does NOT remove its Node.

### Queue

#### Instance Methods

| Method | Return | Input | Description |
| --- | --- | --- | --- |
| Constructor<T> | new Queue | none | Creates a new empty Queue that holds values of type T
|enqueue | void | T newValue |  void | Creates a new value containing newValue and puts it at the rear of the Queue
|dequeue | T removedValue | none | Removes the least recently added Node and returns the value it contains
|peek|T peekedValue|none|Returns the least recently added value. Does NOT remove its Node.


## Space and Efficiency

### Stack

| Method | Time | Space | Approach
| --- | --- | --- | ---
|constructor|O(1)|O(1) | Creates a Stack with a null top
|push|O(1)|O(1) | Creates new Node, sets current top as next, sets top as new Node
|pop|O(1)|O(1) | Takes value of top Node, sets top to the Node below Top, returns the value of Top
|peek|O(1)|O(1) | Returns the value of top, leaves it in place


### Queue

| Method | Time | Space | Approach
| --- | --- | --- | ---
|constructor|O(1)|O(1) | Creates a Queue with a null front and rear
|enqueue|O(1)|O(1) | Creates a new Node. Sets rear's next reference to new Node, sets rear as new Node. If rear is null, instead creates new Node, sets the same node as front and rear.
|dequeue|O(1)|O(1) | Takes value of front Node, sets front to front's next, return value of previous front. If front is the same object as rear (the Queue only has one element), instead returns the value of the Node and sets front and rear to null.
|peek|O(1)|O(1) | Returns the value of front, leaves it in place.
