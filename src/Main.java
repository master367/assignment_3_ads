import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        MyHashTable<Integer, String> hashTable = new MyHashTable<>();

        hashTable.put(1,"didar");
        hashTable.put(2,"merey");
        hashTable.put(3,"damir");
        hashTable.put(4,"ilyas");

        System.out.println(hashTable.get(4));
        hashTable.remove(3);
        System.out.println(hashTable.get(3));
        System.out.println(hashTable.contains("merey"));
        System.out.println(hashTable.getKey("didar"));

    }
}