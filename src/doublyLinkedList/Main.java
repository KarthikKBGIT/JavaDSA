package doublyLinkedList;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtFirst(30);
        list.insertAtFirst(40);
        list.insertAtLast(50);
        list.insertAtLast(60);
        list.insertAtIndex(25, 2);
        list.insertAtIndex(35, 4);
        list.insertAtIndex(45, 6);
        System.out.println("List after insertion:");
        list.displayAll();
        list.deleteAtIndex(5);
        System.out.println("List after deletion at index 5:");
        list.displayAll();
        list.deleteAtFirst();
        System.out.println("List after deletion at first:");
        list.displayAll();
        list.deleteAtLast();
        System.out.println("List after deletion at last:");
        list.displayAll();
    }

}
