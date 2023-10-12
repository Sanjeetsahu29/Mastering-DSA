# Array cheatsheet for coding interviews
![image](https://github.com/Sanjeetsahu29/Mastering-DSA/assets/108270460/1caff0f8-b756-46fa-83a6-b9962cdb0258)

The array is a linear Data Structure that holds values of the same type at contiguous memory locations. In an array, we're usually concerned about two things - `the position/index of an element and the element itself.`<br><br>
![image](https://github.com/Sanjeetsahu29/Mastering-DSA/assets/108270460/e0d477f4-cb88-4ad3-a0de-144c243458f4)

### One-Dimensional Arrays: 
#### Creating, initializing, and accessing an Array

An array declaration has two components: the type and the name. type declares the element type of the array. The element type determines the data type of each element that comprises the array. Like an array of integers, we can also create an array of other primitive data types like char, float, double, etc., or user-defined data types (objects of a class). Thus, the element type for the array determines what type of data the array will hold. 
```
int intArray[]; 
or int[] intArray; 

byte[] byteArray;
short[] shortsArray;
boolean[] booleanArray;
long[] longArray;
float[] floatArray;
double[] doubleArray;
char[] charArray;
```
An array declaration has two components: the `type` and the `name`. type declares the element type of the array. The element type determines the data type of each element that comprises the array. Like an array of integers, we can also create an array of other primitive data types like char, float, double, etc., or user-defined data types (objects of a class). Thus, the element type for the array determines what type of data the array will hold. <br>
Although the first declaration establishes that int Array is an array variable, no actual array exists. It merely tells the compiler that this variable (int Array) will hold an array of the integer type. To link int Array with an actual, physical array of integers, you must allocate one using `new` and assign it to int Array. 
### Instantiating an Array in Java
When an array is declared, only a reference of an array is created. To create or give memory to the array, you create an array like this: The general form of new as it applies to one-dimensional arrays appears as follows: 
```
int[] arr = new int [10];
```

```
Note: 

The elements in the array allocated by new will automatically be initialized to zero (for numeric types), false (for boolean), 
or null (for reference types). Do refer to default array values in Java.
Obtaining an array is a two-step process. First, you must declare a variable of the desired array type.
Second, you must allocate the memory to hold the array, using new, and assign it to the array variable. 
Thus, in Java, all arrays are dynamically allocated.

```
Java program to illustrate creating an array
```
class Main {
	public static void main(String[] args)
	{
  // declares an Array of integers.
		int[] arr;

		// allocating memory for 5 integers.
		arr = new int[5];

		// initialize the first elements of the array
		arr[0] = 10;

		// initialize the second elements of the array
		arr[1] = 20;

		// so on...
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at index " + i
							+ " : " + arr[i]);
	}
}
```
OUTPUT
```
Element at index 0 : 10
Element at index 1 : 20
Element at index 2 : 30
Element at index 3 : 40
Element at index 4 : 50
Time Complexity: O(n)
Auxiliary Space: O(1)
```
### Arrays of Objects
An array of objects is created like an array of primitive-type data items in the following way.<br>
` Student[] arr = new Student[5]; //student is a user-defined class`

Java program to illustrate creating
an array of objects
```
// Java program to illustrate creating
// an array of objects

class Student {
	public int roll_no;
	public String name;
	Student(int roll_no, String name)
	{
		this.roll_no = roll_no;
		this.name = name;
	}
}

// Elements of the array are objects of a class Student.
public class Main {
	public static void main(String[] args)
	{
		// declares an Array of integers.
		Student[] arr;

		// allocating memory for 5 objects of type Student.
		arr = new Student[5];

		// initialize the first elements of the array
		arr[0] = new Student(1, "aman");

		// initialize the second elements of the array
		arr[1] = new Student(2, "vaibhav");

		// so on...
		arr[2] = new Student(3, "shikar");
		arr[3] = new Student(4, "dharmesh");
		arr[4] = new Student(5, "mohit");

		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at " + i + " : "
							+ arr[i].roll_no + " "
							+ arr[i].name);
	}
}
```
OUTPUT
```
Element at 0 : 1 aman
Element at 1 : 2 vaibhav
Element at 2 : 3 shikar
Element at 3 : 4 dharmesh
Element at 4 : 5 mohit
Time Complexity: O(n)
Auxiliary Space : O(1)
```

### What happens if we try to access elements outside the array size?
JVM throws `ArrayIndexOutOfBoundsException` to indicate that the array has been accessed with an illegal index. The index is either negative or greater than or equal to the size of an array.
The below code shows what happens if we try to access elements outside the array size.
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
