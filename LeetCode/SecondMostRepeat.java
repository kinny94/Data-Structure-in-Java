import java.util.*;

class SecondMostRepeat{

    private static HashMap sortByValues(HashMap map) { 
        List list = new LinkedList(map.entrySet());
        // Defined Custom Comparator here
        Collections.sort(list, new Comparator() {
             public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue())
                   .compareTo(((Map.Entry) (o2)).getValue());
             }
        });
        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext();) {
               Map.Entry entry = (Map.Entry) it.next();
               sortedHashMap.put(entry.getKey(), entry.getValue());
        } 
        return sortedHashMap;
   }

    public static String secondMostRepeated(String[] strings){
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(int i=0; i<strings.length; i++){
            String key = strings[i];
            if(map.containsKey(key)){
                map.put(key, map.get(key) + 1);
            }else{
                map.put(key, 1);
            }
        }

        Map<Integer, String> hmap = sortByValues(map); 
        Set set2 = hmap.entrySet();
        Iterator iterator2 = set2.iterator();
        List<String> valuesList = new ArrayList<String>(map.keySet());
        System.out.println(valuesList.get(valuesList.size() - 1));
        return null;
    }

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int numberOfStrings = scan.nextInt();

        String[] strings = new String[numberOfStrings+1];

        for(int i=0; i<=numberOfStrings; i++){
            String x = scan.nextLine(); 
            strings[i] =  x;                                            
        }
        secondMostRepeated(strings);
    }
}