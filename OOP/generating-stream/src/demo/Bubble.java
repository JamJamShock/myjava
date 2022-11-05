package demo;

public class Bubble {
    private int i;

    public Bubble(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    @Override
    public String toString() {
        return "Bubble(" +
                 + i +
                ')';
    }

    public Bubble bubbler(){
        return new Bubble(i);
    }
}
