import java.util.*;

class RepeatedCharacter{

    public static void repeatedCharacters(ArrayList<String> strings){

        ArrayList<String> answer = new ArrayList<String>();

        for(int i=0; i<strings.size(); i++){

            String current = strings.get(i);
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            
            for(int j=0; j<current.length(); j++){
                String key = String.valueOf(current.charAt(j));
                if(map.containsKey(key)){
                    map.put(key, map.get(key) + 1);
                }else{
                    map.put(key, 1);
                } 
            }

            for(int j=0; j<current.length(); j++){
                String key = String.valueOf(current.charAt(j));
                if(map.get(key) > 1){
                    answer.add(key);
                    break;
                }

                if(j == current.length() -1){
                    answer.add("-1");
                }
            }
        }

        for(int i=0; i<answer.size(); i++){
            System.out.println(answer.get(i));
        }
    }

    public static void main(String args[]){
        int numberOfStrings;
        Scanner scan = new Scanner(System.in);
        numberOfStrings = scan.nextInt();
        ArrayList<String> strings = new ArrayList<String>();

        for(int i=0; i<=numberOfStrings; i++){
            String x = scan.nextLine();
            strings.add(x);
        }

        repeatedCharacters(strings);
    }
}