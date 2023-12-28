### Question 1. Why is Java a platform-independent language?

> Java language was developed in such a way that it does not depend on any hardware or software due to the fact that the compiler compiles the code and then converts it to platform-independent byte code which can be > run on multiple systems.
> The only condition to run that byte code is for the machine to have a runtime environment (JRE) installed in it.

### Question 2. Why is Java not a pure object-oriented language?
> Java supports primitive data types - byte, boolean, char, short, int, float, long, and double and hence it is not a pure object-oriented language.

### Question 3. Difference between Heap and Stack Memory in Java. And how Java utilizes this.
> Stack memory is the portion of memory where all the reference variables and method names are stored. And it is fixed. On the other hand, Heap memory is the portion of the memory that is not allocated to the java program but it will be available for use by the Java program when it is required, mostly during the runtime of the program.
>Java Utilizes this memory as - 
When we write a Java program all the variables, methods, etc are stored in the stack memory.
When we create any object in the Java program that object is created in the heap memory. And it was referenced from the stack memory.
![photo_2023-12-05_19-27-13](https://github.com/Sanjeetsahu29/Mastering-DSA/assets/108270460/89f3e227-bd27-454e-aea8-7f6c48a2c780)

### Question 4. Can Java be said to be the complete object-oriented programming language?
> It is not wrong if we claim that Java is the complete object-oriented programming language. Because Everything in Java is under the classes. And we can access that by creating the objects.
But also we can say that Java is not a completely object-oriented programming language because it has the support of primitive data types like int, float, char, boolean, double, etc.<br>
Now for the question: Is Java a completely object-oriented programming language? We can say that - Java is not a pure object-oriented programming language, because it has direct access to primitive data types. And these primitive data types don't directly belong to the Integer classes.

### Question 5. On which memory arrays are created in Java?
> Arrays are created on dynamic memory by JVM. There is no question of static memory in Java everything (variable, array, object, etc.) is created on dynamic memory only.

### Question 6. Can we call the main() method of a class from another class?
> Yes! We can call the main() method of a class from another class using Classname.main(). At the time of calling the main() method, we should pass a string type array to it.

### Question 7. Is it possible to declare array size as negative?
> No, it is not possible to declare array size as negative. Still, if we declare the negative size, there will be no compile-time error. But we get the `NegativeArraySizeException` at run-time.

### Question 8. What is the difference between int array[] and int[] array?
> There is no difference between array[] and []array. Both array[] and []array are the ways to declare an array. The only difference between them is that if we are declaring more than one array in a line, we should use prefix []. If we are declaring a single array in a line, we should use postfix []. For example, consider the following declaration:![photo_2023-12-28_11-40-31](https://github.com/Sanjeetsahu29/Mastering-DSA/assets/108270460/5dcd919f-ac92-4d7e-b0c3-ec3b66dde522)

### Question 9. How to copy an array in Java?
> We can create a copy of an array in two ways, first one is manually by iterating over the array and the second one is by using the arrayCopy() method. Using the arrayCopy() method of the System class is the fastest way to copy an array and also allows us to copy a part of the array. These two methods are the popular ways to copy an array.<br>
> The other two methods to copy an array is to use the Arrays.copyOf() method and using clone() method.

### Question 10. What is the default value of the array?
> When we create a new array, it always initialized with the default values. The default values of the array are:
> - If an array is of byte, short, int, and long type, the default value is 0.
> - If an array is of float and double type, the default value is 0.0
> - If an array is of Boolean type, the default value is false.
> - If an array is of an Object type, the default value is null.

### Question 11. What is an anonymous array also give an example?
> Array reference that is not stored in a variable. It is used in the construction of other objects. Java's Polygon class has a constructor that parses anonymous array as a parameter.

### Question 12. What do you understand by the jagged array?
> A jagged array is a multidimensional array in which member arrays are of different sizes. For example, int array[][]=new int[3][]. The statement creates a two-dimensional jagged array.

###   Question 14. Consider the following statements and tell that the declaration is true or not. Also, specify the reason?
![photo_2023-12-28_11-51-38](https://github.com/Sanjeetsahu29/Mastering-DSA/assets/108270460/25c7441a-741e-404b-a5dc-716424c29f13) 
> The declaration of the above array is true. Because Java allows us to use two different array-specific syntax shortcuts both to initialize (put explicit values into an array's elements) and construct (instantiate the array object itself) in a single statement. The first statement is used to declare, create and initialize in one statement. The second statement does the following four things:
> - Declares an int array reference variable named number.
> - Creates an int array with a length of five (five elements).
> - Populates the array's elements with the values 12, 34, 90, 56, and 65.
> - Assigns the new array object to the reference variable number.

### Question 15. Can a Set be an array?
> In Java, a Set is an array, but an array is not necessarily a Set. Because repetition is allowed in array but in Set. For example, consider the following figure:
![photo_2023-12-28_12-01-19](https://github.com/Sanjeetsahu29/Mastering-DSA/assets/108270460/b4f2990b-d440-42ef-928d-046bfe75f198)
