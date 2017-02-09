import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  
  String[] array;
  int size; 
  int itemsInArray = 0;
  
  Solution(int newSize){
    size = newSize;
    array = new String[size];
    Arrays.fill(array, "-1");
  }
  
  public void hashFunction1(String[] stringForArray, String[] theArray){
    for(int n=0; n < stringForArray.length; n++){
      String newElement = stringForArray[n];
      theArray[Integer.parseInt(newElement)] = newElement; 
    }
  }
  
  public void hashFunction2(String[] stringsForArray, String[] theArray) {

    for (int n = 0; n < stringsForArray.length; n++) {

      String newElementVal = stringsForArray[n];

      // Create an index to store the value in by taking
      // the modulus

      int arrayIndex = Integer.parseInt(newElementVal) % 29;

      System.out.println("Modulus Index= " + arrayIndex + " for value "
          + newElementVal);

      // Cycle through the array until we find an empty space

      while (theArray[arrayIndex] != "-1") {

        ++arrayIndex;

        System.out.println("Collision Try " + arrayIndex + " Instead");

        // If we get to the end of the array go back to index 0

        arrayIndex %= size;

      }

      theArray[arrayIndex] = newElementVal;

    }

  }

  
  public void displayTheStack() {

    int increment = 0;

    for (int m = 0; m < 3; m++) {

      increment += 10;

      for (int n = 0; n < 71; n++)
        System.out.print("-");

      System.out.println();

      for (int n = increment - 10; n < increment; n++) {

        System.out.format("| %3s " + " ", n);

      }

      System.out.println("|");

      for (int n = 0; n < 71; n++)
        System.out.print("-");

      System.out.println();

      for (int n = increment - 10; n < increment; n++) {

        if (array[n].equals("-1"))
          System.out.print("|      ");

        else
          System.out
              .print(String.format("| %3s " + " ", array[n]));

      }

      System.out.println("|");

      for (int n = 0; n < 71; n++)
        System.out.print("-");

      System.out.println();

    }

  }
  
  public String find(String key){
    int arrayIndexHash = Integer.parseInt(key) % 29;
    while(array[arrayIndexHash] != "-1"){
      if(array[arrayIndexHash] == key){
        System.out.println(key + " was found in Index " + arrayIndexHash);
        return array[arrayIndexHash];
      }
  
      ++arrayIndexHash;
      arrayIndexHash %= size;
      
    } 
    
  return null;
  }

  public boolean isPrime(int number){
    if(number % 2 == 0){
      return false;
    }
    
    for(int i=3; i*i<=number; i+=2){
      if( number % i == 0){
        return false;
      }
    } 
    return true;
  }
  
  public int getNextPrime(int minNumberToCheck) {

    for (int i = minNumberToCheck; true; i++) {

      if (isPrime(i))
        return i;

    }

  }
         
 public void increaseArraySize(int minArraySize) {

    // Get a prime number bigger than the array
    // requested

    int newArraySize = getNextPrime(minArraySize);

    // Move the array into a bigger array with the
    // larger prime size

    moveOldArray(newArraySize);

  }
  
  public void moveOldArray(int newArraySize) {

    // Create an array that has all of the values of
    // theArray, but no empty spaces

    String[] cleanArray = removeEmptySpacesInArray(array);

    // Increase the size for theArray

    array = new String[newArraySize];

    size = newArraySize;

    // Fill theArray with -1 in every space

    Arrays.fill(array, "-1");

    // Send the values previously in theArray into
    // the new larger array

    hashFunction2(cleanArray, array);

  }
  
  public String[] removeEmptySpacesInArray(String[] arrayToClean) {

    ArrayList<String> stringList = new ArrayList<String>();

    // Cycle through the array and if a space doesn't
    // contain -1, or isn't empty add it to the ArrayList

    for (String theString : arrayToClean)
      if (!theString.equals("-1") && !theString.equals(""))
        stringList.add(theString);

    return stringList.toArray(new String[stringList.size()]);

  }
  
  public static void main(String[] args) {
    Solution hashFunction = new Solution(31);
    String[] elementsToAdd = {"1", "5", "17", "21", "26"};
    String[] elementToAdd2 = {"100", "510", "170", "214", "268", "398", "235", "802", "900", "723", "699", "1", "16", "999", "890", "725", "998", "978", "988", "990", "989", "984", "320", "321", "400", "415", "450", "50", "660", "624"};
    
    String[] elementsToAdd3 = { "30", "60", "90", "120", "150", "180",
        "210", "240", "270", "300", "330", "360", "390", "420", "450",
        "480", "510", "540", "570", "600", "989", "984", "320", "321",
        "400", "415", "450", "50", "660", "624" };
    hashFunction.hashFunction2(elementsToAdd3 , hashFunction.array);
    hashFunction.displayTheStack();
    hashFunction.increaseArraySize(60);
    
    hashFunction.displayTheStack();
  
    hashFunction.find("660");
  }
}
