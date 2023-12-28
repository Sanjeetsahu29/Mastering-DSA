# Interview Question

### Q1. On which memory arrays are created in Java?
Arrays are created on dynamic memory by JVM. There is no question of static memory in Java everything (variable, array, object, etc.) is created on dynamic memory only.

### Q2. Can we call the main() method of a class from another class?
Yes! We can call the main() method of a class from another class using Classname.main(). At the time of calling the main() method, we should pass a string type array to it.

### Q3. Is it possible to declare array size as negative?
No, it is not possible to declare array size as negative. Still, if we declare the negative size, there will be no compile-time error. But we get the NegativeArraySizeException at run-time.

### Q4. What is the difference between int array[] and int[] array?
There is no difference between array[] and []array. Both array[] and []array are the ways to declare an array. The only difference between them is that if we are declaring more than one array in a line, we should use prefix []. If we are declaring a single array in a line, we should use postfix []. For example, consider the following declaration:
```
int array1[], array2;   //array1[] is an array while array2 is just a variable of type int  
int[] arr1, arr2;  //both arr1 and arr2 are arrays of int type  
```
