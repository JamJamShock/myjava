package another;

public class ExpensiveMemory implements IMemory{
    @Override
    public void setMemory() {
        System.out.println("High speed memory");
    }
}
