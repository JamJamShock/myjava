package Demo;

public class Dog {
    String name;
    static int count;

    public Dog(String name) {
        this.name = name;
        countUp();
    }

    public String getName() {
        return name;
    }

    public void setName() {
        String name = "Pyae Sone";
        this.name = name;
    }

    public void countUp(){
        count ++;
    }

    public int getCount(){
        return count;
    }
}
