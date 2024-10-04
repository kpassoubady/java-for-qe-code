# Java Generics

## Overview

The `com.kavinschool.generics` package demonstrates the use of Java Generics to create type-safe and reusable code components.

## Contents

- **Generic Classes**: Examples of classes that use generics to handle different data types.
- **Generic Methods**: Methods that use generics to operate on various types.
- **Bounded Type Parameters**: Examples showing how to restrict the types that can be used with generics.
- **Wildcards**: Usage of wildcards in generics to handle unknown types.

## Usage

To compile and run the examples in this package, use the following Maven commands:

```sh
mvn compile
mvn exec:java -Dexec.mainClass="com.kavinschool.generics.YourMainClass"
```

Replace `YourMainClass` with the actual class name you want to run.

## Examples

### Generic Class Example

```java
public class Box<T> {
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}
```

### Generic Method Example

```java
public static <T> void printArray(T[] inputArray) {
    for (T element : inputArray) {
        System.out.printf("%s ", element);
    }
    System.out.println();
}
```

### Bounded Type Parameter Example

```java
public <T extends Number> void inspect(T t) {
    System.out.println("T: " + t.getClass().getName());
}
```

### Wildcard Example

```java
public void printList(List<?> list) {
    for (Object elem : list) {
        System.out.println(elem);
    }
}
```

## References

For more information on Java Generics, refer to the [Oracle Java Documentation](https://docs.oracle.com/javase/tutorial/java/generics/).
