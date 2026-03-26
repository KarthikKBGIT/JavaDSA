package singlyLinkedList;

public class SingleLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public SingleLinkedList(){
        this.size = 0;
    }

    public void insertAtFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        ++size;
    }

    public void insertAtLast(int data){
        Node node = new Node(data);
        if(tail == null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
        ++size;
    }

    public void insertAtIndex(int data, int index){
        if(index> size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if(index == 0){
            insertAtFirst(data);
        }
        else if(index == size){
            insertAtLast(data);
        }
        else{
            Node node = new Node(data);
            Node temp = head;
            for(int i=0;i<index-1;i++){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            ++size;
        }
    }

    public void displayAll(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void deleteAtFirst(){
        if(head == null)
            return;
        head = head.next;
        --size;
    }

    public void deleteAtLast(){
        if(head == null)
            return;
        if(head.next == null){
            head = null;
            tail = null;
            --size;
        }
        else{
            Node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            --size;
        }
    }

    public void deleteAtIndex(int index){

        if(size == 0 || index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if(index == 0){
            deleteAtFirst();
        }
        else if(index == size - 1)
            deleteAtLast();
        else{
            Node temp = head;
            for(int i=0;i<index-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            --size;
        }

    }

    public int get(int index){
        if(size == 0 || index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp.data;
    }


    private class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
}
