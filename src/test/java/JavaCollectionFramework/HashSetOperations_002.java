package JavaCollectionFramework;

import java.util.HashSet;

public class HashSetOperations_002 {
    public static void main(String[] args) {

        //Create Set A
        HashSet<Integer> setA = new HashSet<>();
        setA.add(0);
        setA.add(2);
        setA.add(4);
        setA.add(6);
        setA.add(8);

        //Create Set B
        HashSet<Integer> setB = new HashSet<>();
        setB.add(1);
        setB.add(2);
        setB.add(3);
        setB.add(4);
        setB.add(5);

        //Union of two Sets A&B
        setB.addAll(setA);
        System.out.println("Union of AuB is : " + setB);

        //Intersection of two Sets A&B
        setB.retainAll(setA);
        System.out.println("Intersection of A & B is : " + setB);

        //Difference of Set A and Set B (A-B)
        setA.removeAll(setB);
        System.out.println("Difference os Set A & B is : " + setA);

        //Subset Operation (Is B subset of A?)
        System.out.println("Is B subset of A? : " + setA.containsAll(setB));

    }
}
