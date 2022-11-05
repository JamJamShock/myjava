package another;

public class CheapComputer implements IComputer{
    @Override
    public IMemory makeMemory() {
        return new CheapMemory();
    }

    @Override
    public IScreen makeScreen() {
        return new CheapScreen();
    }

    @Override
    public IStorage makeStorage() {
        return new CheapStorage();
    }
}
