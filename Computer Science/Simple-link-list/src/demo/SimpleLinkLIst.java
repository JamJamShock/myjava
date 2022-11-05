package demo;

public class SimpleLinkLIst {

    Node head;
    int size;

    public void addFirst(int data){
        Node newNode=new Node();
        newNode.data=data;
        newNode.next=head;
        head=newNode;
        size++;
    }

    public Node getFirst(){
        if(isEmpty()){
            return null;
        }
        Node removedNode=head;
        head=head.next;
        removedNode.next=null;
        size--;
        return removedNode;
    }

    public boolean isEmpty(){
        return  head==null;

    }

    public void print(){
        Node currentNode=head;
        System.out.print("Head =>");
        while (currentNode!=null){
            System.out.print(currentNode);
            System.out.print(" -> ");
            currentNode=currentNode.next;
        }
        System.out.println("Null");
    }
}
