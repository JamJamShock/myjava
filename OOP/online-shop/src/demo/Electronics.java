package demo;

public abstract class Electronics extends Product{

    private String manufacturer;

    public Electronics(String name, double price, String manufacturer) {
        super(name, price);
        this.manufacturer = manufacturer;
    }
}
