import vehicles.Car;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double money;
    private ArrayList vehicles;

    public Customer(String name, double money){
        this.name = name;
        this.money = money;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList vehicles) {
        this.vehicles = vehicles;
    }

    public void buyVehicle(Car car) {
        this.vehicles.add(car);
        this.money -= car.totalCost();
    }
}
