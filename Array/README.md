# Array cheatsheet for coding interviews
![image](https://github.com/Sanjeetsahu29/Mastering-DSA/assets/108270460/1caff0f8-b756-46fa-83a6-b9962cdb0258)

The array is a linear Data Structure that holds values of the same type at contiguous memory locations. In an array, we're usually concerned about two things - `the position/index of an element and the element itself`. Different programming languages implement arrays under the hood differently and can affect the time complexity of operations you make to the array. In some languages like Python, JavaScript, Ruby, PHP, the array (or list in Python) size is dynamic and you do not need to have a size defined beforehand when creating the array. As a result, people usually have an easier time using these languages for interviews.<br>
Arrays are among the most common data structures encountered during interviews. Questions that ask about other topics would likely involve arrays/sequences as well. Mastery of the array is essential for interviews!<br><br>

### Advantages

- Store multiple elements of the same type with one single variable name
- Accessing elements is fast as long as you have the index, as opposed to linked lists where you have to traverse from the head.

### Disadvantages

- Addition and removal of elements into/from the middle of an array is slow because the remaining elements need to be shifted to accommodate the new/missing element. An exception to this is if the position to be inserted/removed is at the end of the array.
- For certain languages where the array size is fixed, it cannot alter its size after initialization. If an insertion causes the total number of elements to exceed the size, a new array has to be allocated and the existing elements have to be copied over. The act of creating a new array and transferring elements overtakes O(n) time.
 |
## Common terms
Common terms you see when doing problems involving arrays:

- Subarray - A range of contiguous values within an array.
Example: given an array `[2, 3, 6, 1, 5, 4],` `[3, 6, 1]` is a subarray while `[3, 1, 5]` is not a subarray.
- Subsequence - A sequence that can be derived from the given sequence by deleting some or no elements without changing the order of the remaining elements.
Example: given an array `[2, 3, 6, 1, 5, 4],` `[3, 1, 5]` is a subsequence but `[3, 5, 1]` is not a subsequence.
## Time complexity
| Operation | Big-O | Note |
|------|-----|------|
| Access | O(1) | Accessing an element in the array is a constant time operation where any element can be accessed with its index.<br> `array = [10,20,30,40,50]` so, element '20' is located at index '1' and can be accessed by its index. `array[1]` will return the element present at index '1'
|Search| O(n) | In an array, the element can be searched by iterating over each index, if found then we can return some success statement like its `index` or `boolean value 'true'` for its existence in the array. <br>So `Linear search algorithm` is generally used if our array is not sorted |
|Search (sorted array)|O(log(n)| If an array is sorted then for searching any particular element we can use the `Binary search algorithm` which is one of the most optimized searching algorithms |
|Insert|O(n)|Insertion would require shifting all the subsequent elements to the right by one and that takes O(n)|
|Insert (at the end)|O(1)|Special case of insertion where no other element needs to be shifted|
|Remove|O(n)|Removal would require shifting all the subsequent elements to the left by one and that takes O(n)|
|Remove (at the end)|O(1)	|Special case of removal where no other element needs to be shifted|
