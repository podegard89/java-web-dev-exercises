package org.launchcode.java.demos.lsn6inheritance;

public class Tiger extends Cat {
    private String name;
    private String species = "Panthera tigris";

    public Tiger(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
        return "Hello, my name is " + name + "!";
    }

    public String purr() {
        return "I'm a Tiger";
    }
}

