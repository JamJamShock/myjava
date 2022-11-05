package another;

public class ExpensiveComputer implements IComputer{
    @Override
    public IMemory makeMemory() {
        return new ExpensiveMemory();
    }

    @Override
    public IScreen makeScreen() {
        return new ExpensiveScreen();
    }

    @Override
    public IStorage makeStorage() {
        return new ExpensiveStorage();
    }
}
