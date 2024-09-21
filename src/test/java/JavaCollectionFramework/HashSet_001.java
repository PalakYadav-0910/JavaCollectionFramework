package JavaCollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_001 {

    public static void main(String[] args) {

        //Declare HashSet
        HashSet hs = new HashSet(); //for storing heterogeneous data

        HashSet<String> cars = new HashSet<String>(); //for homogeneous data
        HashSet<String> cars2 = new HashSet<String>();

        //Inserting elements
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Maruti");
        cars.add("Scorpio");

        //Printing HashSet Elements
        System.out.println("Elements of HashSet are : " + cars);

        //insert elements in cars2 collection
        cars2.add("Hyundai");
        cars2.add("Ford");

        //add cars2 collection to cars collection
        cars.addAll(cars2);

        //Printing HashSet
        System.out.println("Elements of HashSet cars after addAll method : " + cars);

        //Remove elements from HashSet
        cars.remove("Ford");
        System.out.println("Elements of HashSet cars after remove method : " + cars);

        //Remove Collection from HashSet
        cars.removeAll(cars2);
        System.out.println("Elements of HashSet cars after removeAll method : " + cars);

        //Search BMW in cars collection using contains method
        System.out.println(cars.contains("BMW"));

        //Search Collection in HashSet
        System.out.println(cars.containsAll(cars2));

        //isEmpty
        System.out.println("Is cars collection empty? : " + cars.isEmpty());

        //size
        System.out.println("Size of cars collection is : " + cars.size());

        //Clear all the elements of HashSet
        cars.clear();
        System.out.println("Printing HashSet after clear method : " + cars);

        //Reading elements of HashSet using advanced foreach loop
        for (Object e : cars2) {
            System.out.println(e);
        }

        //Iterator Method for reading elements of HashSet
        Iterator itr = cars2.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

}
