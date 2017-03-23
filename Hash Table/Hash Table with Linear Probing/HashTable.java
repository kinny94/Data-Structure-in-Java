package HashTableLinearProbing;

public class HashTable {
	private HashItem[] hashTable;
	
	public HashTable(){
		this.hashTable = new HashItem[Constants.TABLE_SIZE];
	}
	
	public void put(int key, int value){
		int generatedArrayIndex = hashFunction(key);	
		System.out.println("Put method Called.. with value " + value + " generatedArrayIndex = " + generatedArrayIndex );
		
		while(hashTable[generatedArrayIndex] != null){
			generatedArrayIndex = (generatedArrayIndex + 1) % Constants.TABLE_SIZE;
			System.out.println("Collision -> nextIndex: " + generatedArrayIndex);
		}
		
		System.out.println("Inserted finally with index ");
		hashTable[generatedArrayIndex] = new HashItem(key, value);
	}
	
	public int get(int key){
		 int generatedArrayIndex = hashFunction(key);
		 while(hashTable[generatedArrayIndex] != null && hashTable[generatedArrayIndex].getKey() == key){
			 generatedArrayIndex = (generatedArrayIndex+1) % Constants.TABLE_SIZE;
			 System.out.println("Hoping to the next Index.." + generatedArrayIndex);
		 }
		 
		 if(hashTable[generatedArrayIndex] == null){
			 return -1;
		 }else{
			 return hashTable[generatedArrayIndex].getValue();
		 }
	}
	
	public int hashFunction(int key){
		return key % Constants.TABLE_SIZE;
	}
}
