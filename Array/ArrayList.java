import java.util.List;
public class ArrayList {
	
	/*
	
		In Arraylist we have random access. It is equivalent to vector but they are not synchronized.
		All operations runs at O(N)
		Capacity: It is a parameter we can define when we instantiate an Arraylist. It is the initial size of the array. This may reduce the amount of incremental reallocation.
		
	*/
	
	public static void main(String args[]){
	
		List<String> alist = new java.util.ArrayList<>(10);
		
		alist.add("Arjun");
		alist.add("Sonia");
		alist.add("Neeraj");
		alist.add("Aakash");
		
		alist.isEmpty();
		
		alist.get(2);
		
		alist.add(3, "Arun");
		
		for(String s: alist){
			System.out.println(s);
		}
		
		alist.remove(3);
		
		for(String s: alist){
			System.out.println(s);
		}
		
		Object[] obj = alist.toArray();
		
		for(Object t: obj){
			System.out.println(t);
		}
	}
	
}
