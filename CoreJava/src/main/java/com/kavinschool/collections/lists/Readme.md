# Java Collection Lists
## List in Java

A `List` in Java is an ordered collection (also known as a sequence). It can contain duplicate elements and allows positional access and insertion of elements. The `List` interface is part of the Java Collections Framework and is implemented by various classes such as `ArrayList`, `LinkedList`, `Vector`, and `Stack`.

### Commonly Used Methods

- `add(E e)`: Appends the specified element to the end of the list.
- `get(int index)`: Returns the element at the specified position in the list.
- `remove(int index)`: Removes the element at the specified position in the list.
- `size()`: Returns the number of elements in the list.
- `clear()`: Removes all elements from the list.

### Example

```java
List<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
list.add("Cherry");

System.out.println(list.get(1)); // Output: Banana
list.remove(1);
System.out.println(list.size()); // Output: 2
```