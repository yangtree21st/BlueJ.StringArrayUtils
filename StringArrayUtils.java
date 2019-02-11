 import java.util.Arrays;
 import java.util.Set;
 import java.util.HashSet;
 import java.util.List;
 import java.util.ArrayList;
 import java.util.Collections;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String s:array){
            if(s.equals(value))
                return true;
            }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reversed = new String[array.length];
        int last = array.length -1;
        for(String ele:array){
            reversed[last] = ele;
            last--;  
        }
        return reversed;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        return Arrays.equals(array, reverse(array));
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    
     public static boolean isPangramic(String[] array) {
         boolean isPangra = false;
        String comboW = "";
        for (int i = 0; i < array.length; i++){
            comboW += array[i];
        }        
        comboW = comboW.replaceAll(" ", "");
        comboW = comboW.toLowerCase();
        char[] allLetters = comboW.toCharArray();
        Set<Character> alphabet = new HashSet<>();
        for (char x: allLetters){
            alphabet.add(x);
        }
        if (alphabet.size() == 26) {
            isPangra = true;
        }
        return isPangra;
    }
    

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i = 0; i <array.length; i++) {
            if (array[i].equals(value)){
                count ++;
            }
        }
        return count;
    }
    

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> str = new ArrayList<String>();
        for (int i = 0; i < array.length; i ++) {
            if (array[i].equals(valueToRemove) == false){
                str.add(array[i]);
            }
        }
        int newLength = str.size();
        String [] newArray = str.toArray(new String[newLength]);
        return newArray;
    }
    

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> reDup = new ArrayList<String>();
        reDup.add(array[0]);
        for (int i = 1; i < array.length; i ++) {
            if (array[i].equals(array[i-1]) == false) {
                reDup.add(array[i]);
            }
        }
        int newLength = reDup.size();
        String [] newArray = reDup.toArray(new String[newLength]);
      return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> arrList = new ArrayList<String>();
        String str = array[0];
        for (int i = 1; i < array.length; i ++) {
            if (array[i].equals(array[i-1])) {
            str += array[i];
           } else {
            arrList.add(str);
            str = array[i];
          }
       }
       arrList.add(str);
       String [] packDups = arrList.toArray(new String[arrList.size()]);
       return packDups;   
    }
    }



