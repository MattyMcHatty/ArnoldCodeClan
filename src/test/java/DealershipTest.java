import components.Chassis;
import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
    Customer customer;
    Car car;
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
        car = new Car(chassis, engine, tyres, "silver", "Volvo Vulva");
        dealership = new Dealership("Arnold CodeClan", 250000);
    }

    @Test
    public void canBuyVehicle(){
        dealership.buyVehicle(car);
        assertEquals(1, dealership.getVehicleStock().size());
        assertEquals(245400, dealership.getTillBalance(), 0.01);
    }

    @Test
    public void canSellACustomerAVehicle(){
        dealership.buyVehicle(car);
        dealership.sellVehicle(customer, car);
        assertEquals(1, customer.getVehicles().size());
        assertEquals(5400, customer.getMoney(), 0.01);
        assertEquals(0, dealership.getVehicleStock().size());
        assertEquals(250000, dealership.getTillBalance(), 0.01);
    }

    @Test
    public void canSellACustomerADamagedVehicle(){
        dealership.buyVehicle(car);
        car.setDamage(100);
        dealership.sellVehicle(customer, car);
        assertEquals(1, customer.getVehicles().size());
        assertEquals(5500, customer.getMoney(), 0.01);
        assertEquals(0, dealership.getVehicleStock().size());
        assertEquals(249900, dealership.getTillBalance(), 0.01);
    }

    @Test
    public void canRepairAVehicle(){
        dealership.buyVehicle(car);
        car.setDamage(1000);
        dealership.repairVehicle(car);
        assertEquals(1, dealership.getVehicleStock().size());
        assertEquals(244400, dealership.getTillBalance(), 0.01);
    }
}
