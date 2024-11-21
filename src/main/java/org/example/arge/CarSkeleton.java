package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
        this.name = "Test";
        this.description = "test";
    }
    public CarSkeleton(String name,String description) {
        this.description = description;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void startEngine() {
        System.out.println(name + ": The engine is starting.");
    }

    public void drive() {
        System.out.println(name + ": The car is driving.");
        runEngine();
    }

    protected void runEngine() {
        System.out.println(name + ": The engine is running.");
    }


}
