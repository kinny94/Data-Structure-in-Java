package HashMapChaining;

public class App {
	public static void main(String[] args) {
		HashTable hashTable = new HashTable();
		hashTable.put(1, 10);
		System.out.println();
		hashTable.put(2, 20);
		System.out.println();
		hashTable.put(3, 30);
		System.out.println();
		hashTable.put(4, 40);
		System.out.println();
		hashTable.put(5, 50);
		hashTable.put(6, 60);
		hashTable.put(7, 70);
		hashTable.put(8, 80);
		hashTable.put(9, 90);
		hashTable.put(10, 100);
		hashTable.put(11, 110);
		
		System.out.println(hashTable.get(27));
	}
	
}
