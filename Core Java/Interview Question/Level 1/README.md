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
