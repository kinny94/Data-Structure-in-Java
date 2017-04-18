import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Ransom {

    public static void main(String[] args) {

        boolean flag = true;
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
        
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        
        for(int i=0; i<magazine.length; i++){
            String key = magazine[i];
            if(map1.containsKey(key)){
                map1.put(key, map1.get(key) + 1);
            }else{
                map1.put(key, 1);
            }
        }

        for(int i=0; i<ransom.length; i++){
            String key = ransom[i];
            if(map2.containsKey(key)){
                map2.put(key, map2.get(key) + 1);
            }else{
                map2.put(key, 1);
            }
        }

        for (final String key : map2.keySet()) {
            if (map1.containsKey(key)) {
                if(map2.get(key) <= map1.get(key)){
                    continue;
                }else{
                    flag = false;
                    break;
                }
            }else{
                flag = false;
                break;
            }
        }

        if(flag == false){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
