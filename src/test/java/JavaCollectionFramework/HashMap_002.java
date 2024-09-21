package JavaCollectionFramework;

import java.util.HashMap;

public class HashMap_002 {
    public static void main(String[] args) {

        //Create HashMap in Java
        HashMap<Integer, String> language = new HashMap<>();

        //Add Elements to HashMap
        language.put(1,"Java");
        language.put(2,"Python");
        language.put(3,"JavaScript");

        System.out.println("HashMap : " + language);

        //Access Elements - get() method to get value using index
        String value = language.get(1);

        System.out.println("Value at index 1 is : " + value);

        //To print all the keys - keySet() method is used
        System.out.println("KeySet : " + language.keySet());

        //To print all the values of keys - values() method is used
        System.out.println("Values : " + language.values());

        //To print keys along with values - entrySet() method is used
        System.out.println("key/Value Set : " + language.entrySet());

    }
}
