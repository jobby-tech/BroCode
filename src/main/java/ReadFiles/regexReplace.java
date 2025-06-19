package ReadFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexReplace {
    public static void main(String[] args) throws IOException {

        /*FileReader fr = new FileReader("C:\\Ajin\\Career\\Learn\\JavaPractise\\BroCodeJavaLearn\\Files\\file.template");
        BufferedReader br = new BufferedReader(fr);
        String str;
        String newStr = null;
        while((str=br.readLine())!=null){
            System.out.println(str);
            str==newStr;
        }*/


        StringBuilder output = new StringBuilder();
        String inputString = "\"firstname\" : ${\"FirstName\"}";
        Pattern pattern = Pattern.compile("$\\{(.*?)\\}");
        Matcher matcher = pattern.matcher(inputString);
        int lastStart = 0;
        while (matcher.find()) {
            String subString = inputString.substring(lastStart,matcher.start());
            String varName = matcher.group(1);
            String replacement = getVarValue (varName);
            output.append(subString).append(replacement);
            lastStart = matcher.end();

            output.append(inputString.substring(lastStart));
        }
        System.out.println(output.toString());
    }

    private static String getVarValue(String varName) {
        return "value"; // do what you got to replace the variable name for its value
    }
}
