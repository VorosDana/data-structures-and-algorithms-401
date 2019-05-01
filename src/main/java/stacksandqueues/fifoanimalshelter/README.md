# fifoanimalshelter API

## FIFOAnimalShelter

### Instance Methods

| Method | Return | Input | Description |
| --- | --- | --- | --- |
| Constructor | new FIFOAnimalShelter | none | Creates a new empty FIFOAnimalShelter
|enqueue | boolean | Pet newPet | If Pet is not a Cat or Dog, does not add pet, returns false. Otherwise, creates a new Node containing newPet and puts it at the rear of the Queue, and returns true.
|dequeue | Pet adoptedPet | String pref | Returns the least recently added Pet of the appropriate type.


## Space and Efficiency

### PsuedoQueue

| Method | Time | Space | Approach
| --- | --- | --- | ---
|constructor|O(1)|O(1) | Creates a FIFOAnimalShelter containing a Queue with a placeholder Node that indicates the end of the list.
|enqueue|O(1)|O(1) | Creates a new Node. Pushes the new Node into the storage Stack.
|dequeue|O(n)|O(1) | If preference is null, returns least recently added Pet of any type. If pref is cat or dog, cycles through the front of the Queue until it either finds an approriate Pet, or the end of the queue. It then holds the Pet for output, cycles the list back to its resting state, and returns the Pet. If no suitable pet is found, it returns null.



![](../../../../../assets/fifoanimalshelter.jpg)
