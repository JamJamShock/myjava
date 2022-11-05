package Demo;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList obj=new DoublyLinkedList();
        obj.addFirst(5);
        obj.addFirst(8);
        obj.addFirst(7);


        obj.print();

        Node node=new Node();
        node.data=5;

        obj.addBefore(11,node);

        obj.addAfter(10,node);

        obj.print();

//
//        obj.print();


//        System.out.println("Size : " + obj.size);
//
//        obj.addFirst(3);
//        obj.addLast(9);
//
//        System.out.println("\nFirst Add : 3");
//        System.out.println("Last Add : 9");
//        obj.print();
//        System.out.println("Size : " + obj.size);
//
//        System.out.println(obj.removeFirst());
//
//        System.out.println("Remove First");
//        obj.print();
//        System.out.println("Size : " + obj.size);
//
//        System.out.println(obj.removeLast());
//
//        System.out.println("Remove Last");
//        obj.print();
//        System.out.println("Size : " + obj.size);


    }
}
