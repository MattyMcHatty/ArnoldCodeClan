package components;

public class Tyres extends Component{

    private String gripType;
    private String manufacturer;

    public Tyres(String modelNum, double price, String gripType, String manufacturer) {
        super(modelNum, price);
        this.gripType = gripType;
        this.manufacturer = manufacturer;
    }
}
