import java.util.HashMap;

HashMap<String, String> myHashTable = new HashMap<String, String>(); //declares an empty map
myHashTable.put(key, value);
myHashTable.remove(key);

//look up
myHashTable.get(key); //returns null if the key is not present
myHashTable.containsKey(key); //returns a boolean value, indicating the presence of a key

myHashTable.size(); //number of (key, value) pairs in the hash table
