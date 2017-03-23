package HashMapChaining;

public class HashTable {

	private HashItem[] hashTable;
	
	public HashTable(){
		hashTable = new HashItem[Constants.TABLE_SIZE];
	}
	
	public int get(int key){
		int generatedArrayIndex = hash(key);
		
		if(hashTable[generatedArrayIndex] == null){
			return -1;
		}else{
			HashItem hashItem = hashTable[generatedArrayIndex];
			
			while(hashItem != null && hashItem.getKey() != key){
				hashItem = hashItem.getNextHashItem();
			}
			
			if(hashItem == null){
				return -1;
			}else{
				return hashItem.getValue();
			}
		}
	}
	
	private int hash(int key){
		return key % Constants.TABLE_SIZE;
	}
	
	public void put(int key, int value){
		int hashArrayIndex = hash(key);
		
		if(hashTable[hashArrayIndex] == null){
			System.out.println("No Collision");
			hashTable[hashArrayIndex] = new HashItem(key, value);
		}else{
			System.out.println("Collision happend with key : " + key);
			HashItem hashItem = hashTable[hashArrayIndex];
			while(hashItem.getNextHashItem() != null){
				hashItem = hashItem.getNextHashItem();
				System.out.println("Get the next item in the Linked list: " + hashItem.getValue());
			}
			
			System.out.println("Found a place to insert:	");
			hashItem.setNextHashItem(new HashItem(key, value));
		}
	}
	
	
}
