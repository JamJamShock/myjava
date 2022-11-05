package demo;

public class Retire {
    private String firstName;
    private String lastName;

    private ILifeInsurance iLifeInsurance;
    private PensionManager pensionManager;

    public void setLifeInsurance(ILifeInsurance iLifeInsurance) {
        this.iLifeInsurance = iLifeInsurance;
    }

    public void setPensionManager(PensionManager pensionManager) {
        this.pensionManager = pensionManager;
    }

    public double makePension(double amount){
        return pensionManager.makePension(amount);
    }

    public double makeLifeInsurance(){
        return iLifeInsurance.makeLifeInsurance();
    }
}
