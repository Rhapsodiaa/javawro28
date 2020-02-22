package com.sda.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

    public static void main(String[] args) {


        Collection<Integer> someCollection = new ArrayList<>();
        someCollection.add(1);
        someCollection.add(2);
        someCollection.add(3);


        for (Integer integer : someCollection) {
            System.out.println(integer);
        }

        Iterator<Integer> iterator = someCollection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
