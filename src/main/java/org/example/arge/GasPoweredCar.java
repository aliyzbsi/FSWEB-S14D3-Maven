package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double AvgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String description, String name,double AvgKmPerLiter, int cylinders) {
        super(description, name);
        this.AvgKmPerLiter = AvgKmPerLiter;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return AvgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + ": Gas engine is starting.");
    }

    @Override
    public void drive() {
        System.out.println(getName() + ": Driving on gas.");
        runEngine();
    }
}
