# Java Collections

## Java Collection Interfaces


Here’s a table summarizing the key interfaces in the Java Collections Framework along with their descriptions:

| **Interface**  | **Description**                                                                                               |
|----------------|---------------------------------------------------------------------------------------------------------------|
| `Collection`   | The root interface in the collection hierarchy. It represents a group of objects known as elements.            |
| `List`         | An ordered collection (also known as a sequence). Lists can contain duplicate elements and provide positional access. Common implementations include `ArrayList`, `LinkedList`. |
| `Set`          | A collection that does not allow duplicate elements. It models the mathematical set abstraction. Common implementations include `HashSet`, `LinkedHashSet`, `TreeSet`. |
| `SortedSet`    | A subinterface of `Set` that maintains the order of its elements. Elements are sorted based on their natural ordering or a custom `Comparator`. `TreeSet` is a common implementation. |
| `NavigableSet` | A subinterface of `SortedSet` that provides methods to navigate the set in both ascending and descending order. |
| `Queue`        | A collection designed for holding elements prior to processing. It typically orders elements in a FIFO (first-in, first-out) manner. Common implementations include `LinkedList`, `PriorityQueue`. |
| `Deque`        | A subinterface of `Queue` that allows elements to be added or removed from both ends (double-ended queue). Common implementations include `ArrayDeque`, `LinkedList`. |
| `Map`          | An object that maps keys to values. A map cannot contain duplicate keys, and each key can map to at most one value. Common implementations include `HashMap`, `TreeMap`. |
| `SortedMap`    | A subinterface of `Map` that orders the mappings based on the keys’ natural ordering or a custom comparator. `TreeMap` is a common implementation. |
| `NavigableMap` | A subinterface of `SortedMap` that provides methods to navigate the map in both ascending and descending order. |
| `Iterator`     | Provides a way to traverse through elements in a collection sequentially. Supports `next()`, `hasNext()`, and `remove()`. |
| `ListIterator` | A subinterface of `Iterator` that provides bidirectional traversal of a list, allowing both forward and backward iteration. |
| `Enumeration`  | An older interface similar to `Iterator` but lacks `remove()` functionality. Used in legacy classes like `Vector`. |

