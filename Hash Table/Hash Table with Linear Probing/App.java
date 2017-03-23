package HashTableLinearProbing;

public class App {
	public static void main(String[] args) {
		HashTable hash = new HashTable();
		 hash.put(1, 10);
		 hash.put(2, 20);
		 hash.put(3, 30);
		 hash.put(4, 40);
		 hash.put(5, 50);
		 hash.put(1, 76);
		 
		 System.out.println(hash.get(6));
		 
	}
}
