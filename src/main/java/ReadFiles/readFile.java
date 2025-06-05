package ReadFiles;

import Package1.B;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFile {

    public static void main(String[] args) throws IOException {


        //Approach 1:

        FileReader fr = new FileReader("C:\\Ajin\\Career\\Learn\\JavaPractise\\BroCodeJavaLearn\\Files\\file.template");
        BufferedReader br = new BufferedReader(fr);
        String str;

        while((str=br.readLine())!=null){
            System.out.println(str);
        }
        br.close();


        //Approach 2: Using Scanner

    }
}
