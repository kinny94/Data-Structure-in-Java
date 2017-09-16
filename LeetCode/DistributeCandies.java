import java.util.*;

class DistributeCandies {
	
	public static int distributeCandies(int[] candies) {
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<candies.length; i++){
			if(!set.contains(candies[i])){
				set.add(candies[i]);
			}
		}
		
		if(set.size() > candies.length/2){
			return candies.length/2;
		}else{
			return set.size(); 
		}
		
	}
	public static void main(String args[]){
		
		int[] a = {1,1,2,3};
		System.out.println(distributeCandies(a));       
	}
}