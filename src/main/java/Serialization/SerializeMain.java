package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeMain {

    /*Serialization - The process of converting an object into a byte stream.
                       Persists (saves the state) the object after program exists
                       This byte stream can be saved as a file or sent over a network, can be sent to a different machine
                       Byte stream can be saved as a file (.ser) which is platform independent
                       (like saving a file with the object's information

                       1. Your object class should implement Serializable interface
                       2. Add import java.io.Serializable
                       3. FileOutputSteam fileOut = new FileOutputStream(file path)
                       4. ObjectOutputStream objOut = new ObjectOutputStream(fileout);
                       5. objOut.writeObject(object name);
                       6. objOut.close(); fileOut.close();
     */

    /* Deserialization - The reverse process of converting a byte steam into a object
                            (like loading a saved file)
    */

    public static void main(String[] args) throws IOException, ClassNotFoundException{

        User user = new User();

        user.name = "Bro";
        user.password = "$$$AA";


        try {
            FileOutputStream fileOut = new FileOutputStream("src/main/java/Serialization/UserInfo.ser");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(user);
            objOut.close();
            fileOut.close();

            System.out.println("Object info saved !");

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}

