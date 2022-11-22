import vehicles.Car;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private double tillBalance;
    private ArrayList vehicleStock;

    public Dealership(String name, double tillBalance){
        this.name = name;
        this.tillBalance = tillBalance;
        this.vehicleStock = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTillBalance() {
        return tillBalance;
    }

    public void setTillBalance(double tillBalance) {
        this.tillBalance = tillBalance;
    }

    public ArrayList getVehicleStock() {
        return vehicleStock;
    }

    public void setVehicleStock(ArrayList vehicleStock) {
        this.vehicleStock = vehicleStock;
    }

    public void buyVehicle(Car car) {
        this.vehicleStock.add(car);
        this.tillBalance -= car.totalCost();
    }

    public void sellVehicle(Customer customer, Car car) {
        this.vehicleStock.remove(car);
        customer.buyVehicle(car);
        this.tillBalance += car.totalCost();
    }

    public void repairVehicle(Car car) {
        this.tillBalance -= car.getDamage();
        car.setDamage(0);
    }
}
