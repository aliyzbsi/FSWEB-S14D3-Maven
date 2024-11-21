package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double getAvgKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, String name,double getAvgKmPerLiter,int batterySize,int cylinders) {
        super(description, name);
        this.getAvgKmPerLiter = getAvgKmPerLiter;
        this.batterySize=batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLiter() {
        return getAvgKmPerLiter;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + ": Hybrid engine is starting.");
    }

    @Override
    public void drive() {
        System.out.println(getName() + ": Driving as a hybrid.");
        runEngine();
    }
}
