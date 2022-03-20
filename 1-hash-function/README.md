## Hash Function

A hash function is a mathematical function that converts a numerical input value into another compressed numerical value. The input to the hash function is of arbitrary length but output is always of fixed length.

**f(x) = x mod size**

### Hashing with linear probing

Another approach to implementing hashing is to store N key-value pairs in a hash table of size M > N, relying on empty entries in the table to help with with collision resolution. Such methods are called open-addressing hashing methods. The simplest open-addressing method is called linear probing: when there is a collision (when we hash to a table index that is already occupied with a key different from the search key), then we just check the next entry in the table (by incrementing the index). 

There are three possible outcomes:
- key equal to search key: search hit
- empty position (null key at indexed position): search miss
- key not equal to search key: try next entry
