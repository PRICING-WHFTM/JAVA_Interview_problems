package Problems;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    /**
     * Write a method to find frequency of chars in a String
     */
    public static Map<Character, Integer> frequencyOfChar(String str) {
        str = str.replace(" ", "").toLowerCase();
        Map<Character, Integer> frequencyOfChar = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character temp = str.charAt(i);
            if (frequencyOfChar.containsKey(temp)) {
                frequencyOfChar.put(temp, frequencyOfChar.get(temp) + 1);
            } else {
                frequencyOfChar.put(temp, 1);
            }
        }
        return frequencyOfChar;
    }

    //MAIN METHOD
    public static void main(String[] args) {
       // System.out.println(frequencyOfChar("Life is wonderful").toString());
        System.out.println(value("Life is wonderful"));
    }

     public static String value (String str){
        str=str.toLowerCase().replace(" ", "").trim();
        Map<Character, Integer> map = new HashMap<>();
         for (int i = 0; i < str.length(); i++) {
             Character temp = str.charAt(i);
             if (map.containsKey(temp)) {
                 map.put(temp, map.get(temp) + 1);
             } else {
                 map.put(temp, 1);
             }
         }
         return map.toString().toUpperCase().replace("=","").replace(",","")
                 .replace("{","").replace("}","")
                 .replace(" ","");
     }
}