# Array cheatsheet for coding interviews
![photo_2023-12-05_21-21-05](https://github.com/Sanjeetsahu29/Mastering-DSA/assets/108270460/63104301-f581-4a18-b09f-a6a050afef75)

# Array definition
An array is a `finite` and `ordered` collection of `homogeneous data` elements. It is finite because it contains a limited number of elements. It is ordered because all the elements are stored one by one in a contiguous location of computer memory (heap) in a linear fashion. It is homogeneous because all elements of an array are of the same data type only. We can store either `primitive types` or `object` references into it.<br><br>
![image](https://github.com/Sanjeetsahu29/Mastering-DSA/assets/108270460/e0d477f4-cb88-4ad3-a0de-144c243458f4)



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
