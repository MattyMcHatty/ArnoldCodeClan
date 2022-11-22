package components;

public class Chassis extends Component{

    private int doors;
    private String material;

    public Chassis(String modelNum, double price, int doors, String material) {
        super(modelNum, price);
        this.doors = doors;
        this.material = material;
    }
}
