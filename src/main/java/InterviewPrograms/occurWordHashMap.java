package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class occurWordHashMap {
    public static void main(String[] args) {

        String sent = "sea sea shell";

        String[] words = sent.split(" ");

        HashMap<String,Integer> wordH = new HashMap<>();

        for (String w:words){
            wordH.put(w,wordH.getOrDefault(w,0)+1);
        }

        for (Map.Entry<String ,Integer> entry: wordH.entrySet()){
            System.out.println(entry.getKey() +" : "+entry.getValue());
        }

    }
}
