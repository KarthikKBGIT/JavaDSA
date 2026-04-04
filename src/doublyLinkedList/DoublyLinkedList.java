package doublyLinkedList;

public class DoublyLinkedList {

    private Node head;
    private int size;

    public DoublyLinkedList(){
        this.size = 0;
    }

    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public void displayAll(){
       Node temp = head;
       System.out.println("Accending order");
       while(true){
           System.out.print(temp.data + " -> ");
           if(temp.next == null)
               break;
           temp = temp.next;
       }
       System.out.println("null");
       System.out.println("Decending order");
       while(temp != null){
           System.out.print(temp.data + " -> ");
           temp = temp.prev;
       }
       System.out.println("null");
    }

    public void insertAtFirst(int data){
        Node node = new Node(data);
        if(head == null) {
            head = node;
        }
        else{
            node.next = head;
            head.prev = node;
            head = node;
        }
        ++size;
    }

    public void insertAtLast(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        else{
            Node temp = head;
            while(true){
                if(temp.next == null){
                    node.prev = temp;
                    temp.next = node;
                    break;
                }
                temp = temp.next;
            }
        }
        ++size;
    }

    public void insertAtIndex(int data, int index){
        if(index > size || index < 0){
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
            for(int i=0;i<index;i++){
                temp = temp.next;
            }
            temp.prev.next = node;
            node.prev = temp. prev;
            temp.prev = node;
            node.next = temp;
            ++size;
        }
    }

    public void deleteAtFirst(){
        if(head == null){
            throw new RuntimeException("List is empty");
        }
        else{
            head = head.next;
            if(head != null){
                head.prev = null;
            }
            --size;
        }
    }

    public void deleteAtLast(){
        if(head == null){
            throw new RuntimeException("List is empty");
        }
        else if(head.next == null){
            head = null;
            --size;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.prev.next = null;
            --size;
        }
    }

    public void deleteAtIndex(int index){
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if(index == 0){
            deleteAtFirst();
        }
        else if(index == size-1){
            deleteAtLast();
        }
        else{
            Node temp = head;
            for(int i=0;i<index;i++){
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            --size;
        }
    }

}
