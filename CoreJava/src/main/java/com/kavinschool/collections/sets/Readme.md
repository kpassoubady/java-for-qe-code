# Java Collection Sets
## Set in Java

A `Set` in Java is a collection that does not allow duplicate elements. It models the mathematical set abstraction and is part of the Java Collections Framework. Common implementations include `HashSet`, `LinkedHashSet`, and `TreeSet`.

### Commonly Used Methods

- `add(E e)`: Adds the specified element to the set if it is not already present.
- `contains(Object o)`: Returns `true` if the set contains the specified element.
- `remove(Object o)`: Removes the specified element from the set if it is present.
- `size()`: Returns the number of elements in the set.
- `clear()`: Removes all elements from the set.

### Example

```java
Set<String> set = new HashSet<>();
set.add("Apple");
set.add("Banana");
set.add("Cherry");

System.out.println(set.contains("Banana")); // Output: true
set.remove("Banana");
System.out.println(set.size()); // Output: 2
```
