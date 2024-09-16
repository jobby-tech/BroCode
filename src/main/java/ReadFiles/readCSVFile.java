package ReadFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readCSVFile {


    //CSV - Comma Separated Values

    public static void main(String[] args) {

        String file ="src\\main\\CSVFiles\\ReadFileJava.csv";

        BufferedReader reader=null;
        String line="";

        try{

            reader = new BufferedReader(new FileReader(file));
            while ((line=reader.readLine())!=null){
                String [] row=line.split(",");

                for (String i:row){
                    System.out.printf("%-10s",i);
                }
                System.out.println();
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

        finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }


}
