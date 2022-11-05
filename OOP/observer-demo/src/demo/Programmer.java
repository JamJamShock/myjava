package demo;

public class Programmer implements Observer{
    @Override
    public void update(String operation, String record) {
        System.out.println("Programmer say : " +operation + " operation take place on record:: "+ record);
    }
}
