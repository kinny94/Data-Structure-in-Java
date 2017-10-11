import java.util.*;

class SortedMap{
    public static void main(String args[]){
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(23, "Arjun");
        map.put(25, "Max");
        map.put(31, "Alex");
        map.put(24, "Rock");

        for(Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    
        System.out.println(map.firstEntry().getValue());

        TreeMap<Integer, String> map2 = new TreeMap<Integer, String>(Collections.reverseOrder());
        map2.put(23, "Arjun");
        map2.put(25, "Max");
        map2.put(31, "Alex");
        map2.put(24, "Rock");

        System.out.println(map2.firstEntry().getValue());
    }
}