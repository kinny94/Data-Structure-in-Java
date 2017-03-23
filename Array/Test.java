import java.util.*;

public class Test{
	public static void main(String args[]){

		Test t = new Test();

		int x,s;

		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter number of elements in an array: ");
		x = scan.nextInt();

		//System.out.println("\n Enter number of elements two be shifted: ");
		s = scan.nextInt();

		int[] a1 = new int[x];
		int[] temp = new int[x];

		//System.out.println();

		//System.out.println("Fill the Array:");

		t.fillArray(a1, x);

		//t.print(a1);

		int var = 0;

		for(int i=s; i<x; i++){
			//System.out.println(a1[i]);
			temp[var] = a1[i];
			//System.out.println("temp[" + var + "] = " + a1[i]);
			var++;
		}

		for(int i=0; i<s; i++){
			temp[var] = a1[i];
			//System.out.println("temp[" + var + "] = " + a1[i]);
			var++;
		}

		t.print(temp);
	}

	public void print(int a[]){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public void fillArray(int a[], int length){
		Scanner scan2 = new Scanner(System.in);
		for(int i=0; i<length; i++){
			a[i] = scan2.nextInt();
		}
	}
}