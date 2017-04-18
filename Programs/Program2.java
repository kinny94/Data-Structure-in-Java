/*
	DANDAN -> DA, AN, ND, DA, AN
	DANDAN -> DAN, AND,NDA, DAN 
*/

import java.util.*;


public class Program2{
	
	public static void splitIt(String x, int n){
		List<String> items = new ArrayList<String>();
		items.addAll(Arrays.asList(x.split("")));
		//System.out.println(items);
		int size = items.size();
		//System.out.println(size);
		ArrayList a = new ArrayList();
		String t = "";
		for(int i=0; i<n ;i++){
			t = t + items.get(i);	
			if((i == n-1) && (n < size)){
				System.out.println("i = " + i + " n-1 = " + (n-1) + " n+1 = " + (n+1) + " size = " + size);
				System.out.println(t);
				a.add(t);
				t = "";
				n++;
				System.out.println("n = " + n);
				items.remove(0);
				System.out.println(items);
				i = 0;
			}
		}
	}

	public static void main(String args[]){
		String x = "DANDAN";
		int n = 3;
		splitIt(x, n);
	}
}
	
