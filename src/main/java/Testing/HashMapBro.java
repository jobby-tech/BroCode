package Testing;
import java.util.HashMap;

public class HashMapBro {

    public static void main(String[] args) {
        //HashMaps implements the Map Interface
        //HashMap is similar to Array List, but with key-value pairs
        //Stores objects, need to use Wrapper class(converting primitive data type into object)
        //Ex(name,email), (username,userID), (country,capital)

        HashMap<String,String> countries = new HashMap<String,String>();

        //add a key and value

        countries.put("USA","Washington DC");
        countries.put("India","Del");
        countries.put("Russia","Moscow");
        countries.put("China","Beijing");


        for (String i:countries.keySet()
             ) {
            System.out.print(i+"\t"+"= ");
            System.out.println(countries.get(i));
        }

       // System.out.println(countries);

//        countries.remove("USA");

       // System.out.println(countries);

//        System.out.println(countries.get("Russia"));


//        countries.clear();
//        System.out.println(countries);

       // System.out.println(countries.size());

//        countries.replace("USA","Texa");
//        System.out.println(countries);

//        System.out.println(countries.containsKey("India"));
//        System.out.println(countries.containsKey("Engla"));
//        System.out.println(countries.containsValue("Beijing"));

    }
}
