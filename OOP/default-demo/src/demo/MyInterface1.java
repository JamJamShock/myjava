package demo;

public interface MyInterface1 {

    default void test(){
        System.out.println("My Interface 1 :: test");
    }
}
