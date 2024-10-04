# Java Collection Maps
## Map in Java
    A `Map` in Java is an object that maps keys to values. A map cannot contain duplicate keys, and each key can map to at most one value. The `Map` interface is part of the Java Collections Framework and is implemented by various classes such as `HashMap`, `TreeMap`, `LinkedHashMap`, and `Hashtable`.

### Commonly Used Methods

- `put(K key, V value)`: Associates the specified value with the specified key in this map.
- `get(Object key)`: Returns the value to which the specified key is mapped, or `null` if this map contains no mapping for the key.
- `remove(Object key)`: Removes the mapping for a key from this map if it is present.
- `size()`: Returns the number of key-value mappings in this map.
- `clear()`: Removes all the mappings from this map.

### Example

```java
Map<String, Integer> map = new HashMap<>();
map.put("Apple", 1);
map.put("Banana", 2);
map.put("Cherry", 3);

System.out.println(map.get("Banana")); // Output: 2
map.remove("Banana");
System.out.println(map.size()); // Output: 2
```
