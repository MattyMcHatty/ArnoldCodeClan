import components.Chassis;
import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.ElectricCar;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {
    Customer customer;
    ElectricCar car;
    Dealership dealership;
    Chassis chassis;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        customer = new Customer("Joey", 10000);
        chassis = new Chassis("CHA-123", 3000, 4, "Titanium");
        engine = new Engine("ENG-456", 1500, 3.0, "Petrol");
        tyres = new Tyres("TYR-789", 100, "Winter", "Michelin");
        car = new ElectricCar(chassis, engine, tyres, "silver", 500, "Volvo Vulva");
        dealership = new Dealership("Arnold CodeClan", 250000);
    }

    @Test
    public void canCalculateCost(){
        assertEquals(4100, car.totalCost(), 0.01);
    }
}
