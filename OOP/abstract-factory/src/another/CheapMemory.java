package another;

public class CheapMemory implements IMemory{
    @Override
    public void setMemory() {
        System.out.println("Slow Speed Memory");
    }
}
