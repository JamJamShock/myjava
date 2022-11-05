package demo;

public interface MyInterface2 {

    default void test(){
        System.out.println("My Interface 2 :: test");
    }
}
