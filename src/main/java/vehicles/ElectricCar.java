package vehicles;

import components.Chassis;
import components.Engine;
import components.Tyres;

public class ElectricCar extends Vehicle{

    private double batteryCharge;

    public ElectricCar(Chassis chassis, Engine engine, Tyres tyres, String colour, double batteryCharge, String name) {
        super(chassis, engine, tyres, colour, name);
        this.batteryCharge = batteryCharge;
    }

    public double getBatteryCharge() {
        return batteryCharge;
    }

    public void setBatteryCharge(double batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    @Override
    public double totalCost() {
        double enviroDiscount = 500;
        return this.getChassis().getPrice() + this.getEngine().getPrice() + this.getTyres().getPrice() -this.getDamage() - enviroDiscount;

    }
}
