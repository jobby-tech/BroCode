package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class occurCharHashMap {

    public static void main(String[] args) {

        String sent = "sea sea shell";

        HashMap<Character,Integer> countMap = new HashMap<>();

        for (char c: sent.toCharArray()){
            countMap.put(c,countMap.getOrDefault(c,0)+1);
        }

        System.out.println("Character Occurance");

        for (Map.Entry<Character,Integer> entry: countMap.entrySet()){
            System.out.println(entry.getKey()+ " : " +entry.getValue());
        }
    }
}
