package LinkedList;

public class App {
	public static void main(String args[]){
		List<Person> list =  new LinkedListImplementation<Person>();
		
		Person p = new Person(13, "Bobby");
	
		list.insert(new Person(24, "Arjun"));
		list.insert(new Person(21, "Arun"));
		list.insert(new Person(24, "Neeraj"));
		list.insert(new Person(14, "Aakash"));
		list.insert(p);
		
		list.traveseList();
		
		list.delete(p);
		
		System.out.println();
		
		list.traveseList();
		
		System.out.println(list.size());
		
		list.delete(p);
		
		list.traveseList();
	}
}
