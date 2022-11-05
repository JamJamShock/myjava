package demo;

public class StudentFacade extends AbstractFacade<Supplier> implements SupplierFacadeLocal{
    public StudentFacade(){
        super(Supplier.class);
    }
}
