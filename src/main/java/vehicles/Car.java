package vehicles;

import components.Chassis;
import components.Engine;
import components.Tyres;

public class Car extends Vehicle{

    public Car(Chassis chassis, Engine engine, Tyres tyres, String colour, String name) {
        super(chassis, engine, tyres, colour, name);
    }

    @Override
    public double totalCost() {
        return this.getChassis().getPrice() + this.getEngine().getPrice() + this.getTyres().getPrice() - this.getDamage();

    }
}
