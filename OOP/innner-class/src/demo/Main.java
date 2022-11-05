package demo;

class A{

}

class Outer extends A{
    private int i;

    public void test(){
        class LocalInner{
            public void local(){
                System.out.println("Local");
            }
        }
        LocalInner localInner=new LocalInner();
        localInner.local();
        System.out.println("Outer Test : ");
    }

    static class StaticInner{
        public void cal(){
            System.out.println("Static Inner Class");
        }
    }
    class Inner{
        public void doSomething(){
            System.out.println(i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.Inner inner=new Outer().new Inner();
        inner.doSomething();

        Outer.StaticInner staticInner=new Outer.StaticInner();
        staticInner.cal();

        GreetingInterface obj=new GreetingInterface() {
            @Override
            public String greet(String name) {
                return "Hello!"+name;
            }
        };
        GreetingInterface obj3= a -> "Hey Coder!" + a;
        System.out.println(obj.greet("Harry"));

        GreetingInterface obj2=new MyClass();
        System.out.println(obj2.greet("Marry"));
    }
}
class MyClass implements GreetingInterface{

    @Override
    public String greet(String name) {
        return null;
    }
}
interface GreetingInterface{
    String greet(String name);
}
