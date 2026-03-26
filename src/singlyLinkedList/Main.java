package singlyLinkedList;

public class Main {

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.insertAtFirst(1);
        list.insertAtLast(2);
        list.insertAtFirst(10);
        list.insertAtIndex(4, 1);
        list.insertAtIndex(5, 3);
        list.displayAll();
        list.deleteAtFirst();
        list.displayAll();
        list.deleteAtLast();
        list.displayAll();
    }

}
