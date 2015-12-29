package collection;

import java.util.*;

public class DuplicateCharsInString {
 
    public void findDuplicateChars(String str){
         
        Map<Character, Integer> myMap = new HashMap<Character, Integer>();
        char chrs[] = str.toCharArray();
        for(Character ch:chrs){
            if(myMap.containsKey(ch)){
                myMap.put(ch, myMap.get(ch)+1);
            } else {
                myMap.put(ch, 1);
            }
        }
      //  Set<Character> keys = myMap.keySet();
        for(Character ch:myMap.keySet()){
            if(myMap.get(ch) > 1){
                System.out.println(ch+"--"+myMap.get(ch));
            }
        }
    }
     
    public static void main(String a[]){
        DuplicateCharsInString dcs = new DuplicateCharsInString();
        dcs.findDuplicateChars("sskdhiokkkiokkwweeemytlpmueqa");
    }
}