package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, String name,double avgKmPerCharge, int batterySize) {
        super(description, name);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + ": Electric engine is starting.");
    }

    @Override
    public void drive() {
        System.out.println(getName() + ": Driving on electricity.");
        runEngine();
    }
}
