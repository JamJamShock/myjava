package demo;

public abstract class AbstractFacade <T>{

    private Class<T> t;
    public AbstractFacade(Class<T> t){
        this.t=t;
    }

     public void create(T t1){
        System.out.println(t1.getClass().getSimpleName() + "::created");
    }

    public void edit(T t1){
        System.out.println(t1.getClass().getSimpleName() + "::edit");
    }

    public void delete(T t1){
        System.out.println(t1.getClass().getSimpleName() + "::delete");
    }
}
