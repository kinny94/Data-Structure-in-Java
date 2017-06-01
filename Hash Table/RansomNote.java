import java.util.*;
public class RansomNote{
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }

        if(compare(magazine, ransom)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
	}

	public static boolean compare(String a[], String b[]){
		boolean flag = false;
		for(int i=0; i<b.length; i++){
			flag = false;
			for(int j=0; j<a.length; j++){
				if(b[i].equals(a[j])){
					flag = true;
					break;
				}
			}
			if(flag == false){
				break;
			}
		}
		return flag;
	}
}