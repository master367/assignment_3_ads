import java.util.Hashtable;
import java.util.Random;

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

        MyHashTable<MyTestingClass, String> testTable = new MyHashTable<>();

        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            int id = rand.nextInt(10000);
            MyTestingClass object = new MyTestingClass(id);
            testTable.put(object, "Value " + i);
        }
        testTable.printBucketSizes();

        BST<Integer, String> bst = new BST<>();

        bst.put(1,"didar");
        bst.put(2,"merey");
        bst.put(3,"damir");
        bst.put(4,"ilyas");
        System.out.println(bst.size());
        System.out.println(bst.get(3));
        bst.delete(2);
        System.out.println(bst.get(2));




        }

}