package components;

public class Engine extends Component{

    private double capacity;
    private String fuelType;

    public Engine(String modelNum, double price, double capacity, String fuelType) {
        super(modelNum, price);
        this.capacity = capacity;
        this.fuelType = fuelType;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
