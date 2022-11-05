package Demo;

class A{
    A(){
        System.out.println("A");
    }
}
class B extends A{
    B(){
        super();
        System.out.println("B");
    }
}
class C extends B{
    C(){
        super();
        System.out.println("C");
    }
}
public class ConstructorChain {
    public static void main(String[] args) {
        ChildClass obj=new ChildClass();
        obj.defaultint=12;
        obj.protectedInt=11;
        obj.publicInt=10;
    }
}
