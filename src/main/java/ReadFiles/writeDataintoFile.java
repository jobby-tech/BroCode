package ReadFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writeDataintoFile {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("C:\\Ajin\\Career\\Learn\\JavaPractise\\BroCodeJavaLearn\\Files\\file.template");

        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Selenium with Ja");

        System.out.println("Completed !!");

        bw.close();
    }
}
