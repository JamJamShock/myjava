package Demo;

public class ObjectEqual {
    public static void main(String[] args) {
        Apple obj1=new Apple("Red");
        Apple obj2=new Apple("Red");
        Apple obj3=obj1;

        boolean test=obj1 .equals(obj2);
        System.out.println("Obj1 and Obj2 are the same: "+ test);
    }
}
