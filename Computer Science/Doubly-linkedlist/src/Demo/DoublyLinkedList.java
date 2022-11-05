package Demo;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    int size;

    public void addFirst(int data){
        Node newNode=new Node();
        newNode.data=data;

        if(head == null){
            tail=newNode;
        }
        else {
            head.previous=newNode;
            newNode.next=head;
        }
        head=newNode;
        size++;
    }

    public boolean addBefore(int data, Node insertingNode){
        if(head == null) {
            return false;
        }
        Node current=head;
        while (current!=null && current.data != insertingNode.data){
            current  = current.next;
        }

        if(current==null){
            return false;
        }
            Node newNode=new Node();
            newNode.data=data;
            newNode.next=current;
            newNode.previous=current.previous;
            current.previous=newNode;

            if(current==head){
                head=newNode;
            }
            else {
                newNode.previous.next=newNode;
            }
            return true;
    }

    public boolean addAfter(int data, Node insertingNode){
        if(tail == null) {
            return false;
        }
        Node current=tail;
        while (current!=null && current.data != insertingNode.data){
            current  = current.previous;
        }

        if(current==null){
            return false;
        }
        Node newNode=new Node();
        newNode.data=data;
        newNode.previous=current;
        newNode.next=current.next;
        current.next=newNode;

        if(current==tail){
            tail=newNode;
        }
        else {
            newNode.next.previous=newNode;
        }
        return true;
    }

    public Node removeFirst(){
        Node removeNode=head;
        if(head==null){
            return null;
        }
        if(head.next==null){
            tail=null;
        }
        else{
            head.next.previous=null;
        }
        head=head.next;
        removeNode.next=null;
        size--;

        return removeNode;
    }

    public Node removeLast(){
        Node removeNode=tail;
        if(head==null){
            return null;
        }
        if(removeNode.previous==null){
            head=null;
        }
        else {
            tail.previous.next=null;
        }
        tail=tail.previous;
        removeNode.previous=null;
        size--;

        return removeNode;
    }

    public boolean isEmpty(){return head==null; }
    public void addLast(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(tail==null){
            head=newNode;
        }
        else {
            tail.next=newNode;
            newNode.previous=tail;
        }
        tail=newNode;
        size++;
    }

    public void print(){
        Node currentNode=head;
        System.out.print("Head <=> ");
        while(currentNode!=null){
            System.out.print(currentNode);
            System.out.print(" <=> ");
            currentNode=currentNode.next;
        }
        System.out.println("Tail");
    }


}
