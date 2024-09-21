package JavaCollectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        //1. In LinkedHashSet insertion order is maintained. Its underlying structure
        // is based on HashTable and linked list.
        //2. Both HashSet and LinkedHashSet has capacity 16 and load factor 0.75
        //and these are configurable.
        //3. In both duplicates are not allowed.
        //4. Performance of LinkedHashSet is slower than HashSet because of linked list.

        //Create LinkedHashSet
        //LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        //HashSet linkedHashSet = new HashSet();

        LinkedHashSet linkedHashSet = new LinkedHashSet(); //Heterogeneous

        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(4);
        linkedHashSet.add(5);

        System.out.println(linkedHashSet);

    }
}
