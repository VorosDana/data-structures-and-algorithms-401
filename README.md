# Data Structures and Algorithms - Java 401d3
<!-- --- -->

## Reverse an Array 

Take an array of integers and reverse it in place.

### Challenge

We are reversing an array. The examples were all integers, so we assumed that was the target. 

### Approach & Efficiency

We used a swap value to reverse the array, starting from the first and last, and moving in. It runs in O(n)

### Solution

![](./assets/reverse-array-whiteboard.jpg)

### Code ( [Link](./src/main/java/ArrayReverse.java) )


## Insert Shift Array 

### Challenge

Make a function that takes in an array and an integer, and returns an a new array, the same as the input, but with the new value in the middle.

### Approach & Efficiency

We made a new array with a length of the input array's length + 1. We then copied in the first half of the input array (rounding up for odd indexes), put in the new value, and added the last half of the input array (rounding down for odd lengths)

### Solution

![](./assets/insert-shift-array.jpg)

### Code ( [Link](./src/main/java/InsertShiftArray.java) )

### Tests ( [Link](./src/test/java/InsertShiftArrayTest.java) )