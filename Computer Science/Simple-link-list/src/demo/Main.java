package demo;

public class Main {
    public static void main(String[] args) {
        SimpleLinkLIst obj = new SimpleLinkLIst();

        obj.addFirst(5);
        obj.addFirst(7);
        obj.addFirst(2);
        obj.addFirst(3);

        obj.print();

        System.out.println("Size : " + obj.size);

        System.out.println(obj.getFirst());
        System.out.println(obj.getFirst());

        obj.print();
        System.out.println("Size : " + obj.size);

        obj.addFirst(9);
        obj.print();
        System.out.println("Size : " + obj.size);
    }
}
