import java.util.*;

public class program1{

	public static void main(String args[]){
		int last = 25;	//O(1)
		int count[] = {11, 21, 22 ,21 ,21, 22, 10, 11, 23, 3, 4, 3, 4, 7, 8, 9, 5, 1, 19, 20, 3, 7, 5};	//O(1)

		int max = 0; int min = count[0];
		for(int i=0; i<count.length; i++){
			if(count[i] > max){
				max = count[i];
			}

			if(count[i] < min){
				min = count[i];
			}
		}

		System.out.println(min + " " + max);


		Set<Integer> set = new HashSet<Integer>();//O(1)

		for(int i = 0; i < count.length; i++) {	//O(n)
			set.add(count[i]);	//O(1)
		}
		System.out.println(set);

		for(int i=min; i<=max; i++){	//O(n)
			if(!set.contains(i)){	//O(1)
				System.out.print(i + ", ");	//O(1)
			}
		}
	}
}