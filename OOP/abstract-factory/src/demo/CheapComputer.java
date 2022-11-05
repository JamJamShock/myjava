package demo;

public class CheapComputer implements IComputer{
    @Override
    public void setScreen() {
        System.out.println("low resolution");
    }

    @Override
    public void setStorage() {
        System.out.println("HDD");
    }

    @Override
    public void setRam() {
        System.out.println("low speed ram");
    }

    @Override
    public void setSoundCard() {
        System.out.println("low quality sound card");
    }
}
