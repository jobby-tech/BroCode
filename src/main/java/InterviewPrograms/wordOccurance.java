package InterviewPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class wordOccurance {


    public static void main(String[] args) {

        String sentence = "She sells sells sea sea shore";

        String [] words = sentence.split(" ");

        List<String> wordsL = Arrays.asList(words);

        int freq = Collections.frequency(wordsL,"sells");

        System.out.println(freq);
    }
}
