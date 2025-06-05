package Telusko;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hash {

    public static void main(String[] args) {

        Map<String,String> phoneBook = new HashMap<>();
        phoneBook.put("Aj","9352355");
        phoneBook.put("Jo","9365235");
        phoneBook.put("Hi","9735235");
        phoneBook.put("Kt","9352345");

       // System.out.println(phoneBook.get("Aj"));

        /*Set<String> keys = phoneBook.keySet();

        for (String k: keys){
            System.out.println("Key: "+k +" Value: "+phoneBook.get(k));
        }
*/

        // Using Set, Map Entry  , Nested Interface ,  Entry is an Interface in Map Interface
        // Hash map is Not Thread safe, allows null , Hash Table is Synchronized and Thread Safe , doesnot allow null

        Set<Map.Entry<String,String>> values  = phoneBook.entrySet();
        for (Map.Entry<String,String> e: values){
            System.out.println(e.getKey()+ " : " +e.getValue());
            e.setValue("III");
        }
    }
}
