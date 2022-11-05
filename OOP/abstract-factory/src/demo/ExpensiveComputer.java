package demo;

public class ExpensiveComputer implements IComputer{

    @Override
    public void setScreen() {
        System.out.println("High Resolution");
    }

    @Override
    public void setStorage() {
        System.out.println("SSD");
    }

    @Override
    public void setRam() {
        System.out.println("High Speed Ram");
    }

    @Override
    public void setSoundCard() {
        System.out.println("Good quality sound card");
    }
}
