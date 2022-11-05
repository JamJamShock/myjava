package demo;

public class Manager implements Observer{
    @Override
    public void update(String operation, String record) {
        System.out.println("Manager say : " +operation + " operation take place on record:: "+ record);
    }
}
