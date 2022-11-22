package components;

public abstract  class Component {
    private String modelNum;
    private double price;

    public Component(String modelNum, double price){
        this.modelNum = modelNum;
        this.price = price;
    }

    public String getModelNum() {
        return modelNum;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
