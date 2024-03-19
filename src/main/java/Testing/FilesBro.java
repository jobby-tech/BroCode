package Testing;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesBro {
    public static void main(String[] args) {

        //File  = An abstract representation of file and directory path names
/*
        File file = new File("src/main/java/Testing/BroCodeFiles.txt");

        if (file.exists()){
            System.out.println("The File exists !");
            System.out.println("Absoulte path: "+file.getAbsolutePath());
            System.out.println("Path: "+file.getPath());
            System.out.println(file.isFile());
            file.delete();

        }
        else {
            System.out.println("The file doesnt exits");
        }*/

       /* // Writing data into the Files

        try {
            FileWriter writer = new FileWriter("src/main/java/Testing/BroCodeFiles.txt");
            writer.write("Roses are red \n Violtes are blue \n Rock!!");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


        // File Reader - Read the contents of a file as a stream of characters. One by one
        // read() returns an int value which contains the byte value
        // when read() returns -1, there is no more data to be read

        try {
            FileReader reader = new FileReader("src/main/java/Testing/art.txt");
            int data = reader.read();

            while (data != -1){
                System.out.print((char)data);
                data=reader.read();
            }
            reader.close();
        }

        catch (IOException e) {
            throw new RuntimeException(e);
        }
        catch (Exception e){
            System.out.println(e);
        }



    }
}
