package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class occurCharHashMap {

    public static void main(String[] args) {

        String sent = "sea sea shell";

        char[] letter = sent.toCharArray();

        HashMap<Character,Integer> lettH = new HashMap<>();

        for (Character c:letter){
            lettH.put(c,lettH.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry:lettH.entrySet()){

            System.out.println(entry.getKey()+ " : "+entry.getValue());
        }
    }
}
