# cp6
check ppts

research hash stuff - hash map, hash function, hash tables
- load factors
- https://www.freecodecamp.org/news/the-codeless-guide-to-hash/

hash table = hash set - when order isnt important
- load factor = number of used elements per table size
-   load factor needs to stay small to work well
-   clustering becomes a problem if the load factor gets close to 1 (will reallocate the table but thats expensive)

10/20
- 2 properties of hash function: 1) idk, 2) uniform distribution of buckets (need info spread out in order to find it at all)

Collections
a class within the JCF that gives additional methods
- primary one is Collections.sort(var);
-   uses Comparable

hashmap uses key, value - value is the data itself (duplictes allowed)

10/22
binary search trees TreeMap
- an alternative to hashmapping? serves same purpose but quite different in background
- treemap to sort your hashmap - only possible bc both are maps
- tree sets are naturally ordering (use Comparable) or can use alternate ordering (COmparator)

linked lists
- use it syntactically like arraylist
- considering time complexity
-   LL makes adding to the head and tail of the list cheaper
-   once arraylists get big, they stay big
-   random access not needed
-   less used for searches, more used for adding and subtracting elements
