# multibracketvalidation API

## HashMap

### Instance Methods

| Method | Return | Input | Description |
| --- | --- | --- | --- |
|HashMap<T>|none|none|Creates a new HashMap with a 30-bucket array
|HashMap<T>|none|int buckets|Creates a new HashMap with a bucket array with length defined in arguments
|private hash|int|String key|Hashes the key into an array index for where it should go in the bucket array
|add|boolean|String key, T value|Adds key to the HashMap, with attached value. Returns true if insert is successful, and false if it was not inserted because an identical key was found. Null values cannot be added.
|get|T|String key|Searches the HashMap for the appropriate key, and returns the attached value
|contains|boolean|String key|Searches the HashMap for the given key, returns true if found, false if not.

## RepeatedWord

### Static Methods

| Method | Return | Input | Description |
| --- | --- | --- | --- |
|repeatedWord|String|String text|Searches the text, and returns the first word that is repeated. If there are no repeats, returns null.

## TreeIntersection

### Static Methods

| Method | Return | Input | Description |
| --- | --- | --- | --- |
|intersection|HashSet<T>|BinaryTree<T>, BinaryTree<T>|returns a HashSet containing the elements found in both trees

## Space and Efficiency

### HashMap

| Method | Time | Space | Approach
| --- | --- | --- | ---
|HashMap<T>(int)|O(1)|O(n)|Creates an array of Nodes to initialize the internal structure
|HashMap<T>()|O(1)|O(1)|Calls the specific constructor with 30 as the parameter.
|add|O(n)|O(1)|Hashes key, searches through the Node chain at that index in buckets to see if the key already exists. If it does, returns false without inserting. If it does not, returns true after adding the key/value pair.
|get|O(n)|O(1)|Hashes the key, and searches the Node chain for the specific key. If it is found, returns the attached value, otherwise, returns null.
|contains|O(n)|O(1)|Calls get with the given key as the parameter, returns true if a value is returned, false if null is returned.

### RepeatedWord

| Method | Time | Space | Approach
| --- | --- | --- | ---
|repeatedWord|O(n)|O(n)|Creates an array of words, split on spaces, and a HashMap to hold word that are found. Then iterates through the words array, stripping off punctuation and moving words to lowercase, adding them to the hashmap as both the key and value of pairs. If the add returns false, it already exists in the Hashmap, and that word is returned. If no repeated word is found, returns null.

### TreeIntersection

| Method | Time | Space | Approach
| --- | --- | --- | ---
|intersection|O(n)|O(n)|Puts all elements of first tree into a HashMap, then attempts to add elements of second tree. On a collision, the colliding element is added to the output HashMap, with is then returned.

