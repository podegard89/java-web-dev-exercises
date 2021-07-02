package org.launchcode.java.demos.lsn6inheritance;

import java.util.ArrayList;

public class CastingDemo {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 40);
        Tiger siberianTiger = new Tiger("Jeff", 200);
        HouseCat mochi = new HouseCat("Mochi", 12);
        // Tiger casted as Cat
        Cat whiteTiger = new Tiger("Arnold", 176);

        // all objects that extend Cat can be added to this arraylist
        ArrayList<Cat> catList = new ArrayList<>();
        catList.add(garfield);
        catList.add(siberianTiger);
        catList.add(mochi);
        catList.add(whiteTiger);

        for(Cat cat : catList) {
            System.out.println(cat.getWeight());
            System.out.println(cat.noise());
        }

    }
}
