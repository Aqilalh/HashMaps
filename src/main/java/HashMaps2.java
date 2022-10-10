import java.util.HashMap;

public class HashMaps2 { public static void main(String[] args) {
    HashMap<String, String> countries = new HashMap<String,String>();

    //add a key and value
    countries.put("USA","Washington DC");
    countries.put("India", "New Delhi");
    countries.put("Yemen","Aden");
    countries.put("UK","London");

    System.out.println(countries);
    // to remove somethign from a hash set
    // countries.remove("USA");

    //Getting soemthing
    // System.out.println(countries.get("Yemen"));

    //To clear all the countries
    // countries.clear();
    //System.out.println(countries);

    // to get the size/length
    //System.out.println(countries.size());

    // How to replace something
    //countries.replace("USA","Detroit");
    //System.out.println(countries);

    //checking if it contains a key
    //System.out.println(countries.containsKey("Yemen"));

    //checking if it contains a value
    //  System.out.println(countries.containsValue("London"));

    //loop though the hash map
    for(String i:countries.keySet()){
        //print out the keys
        System.out.print(i +"\t"+"=");
        //print out the values
        System.out.println(countries.get(i));
    }
}
}


