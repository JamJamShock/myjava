package demo;

public class TV extends Electronics{

    private int size;

    public TV(String name, double price, String manufacturer, int size) {
        super(name, price, manufacturer);
        this.size = size;
    }

    @Override
    public double computeSalesPrice() {
        return getPrice() - (getPrice() * 0.02);
    }
}
