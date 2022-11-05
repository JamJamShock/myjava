package demo;

public class EbookReader extends Electronics{
    private String color;

    public EbookReader(String name, double price, String manufacturer, String color) {
        super(name, price, manufacturer);
        this.color = color;
    }


    @Override
    public double computeSalesPrice() {
        return getPrice() - (getPrice() * 0.03);
    }
}
