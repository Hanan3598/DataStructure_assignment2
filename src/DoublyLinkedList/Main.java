package DoublyLinkedList;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList<String>dlist = new DoublyLinkedList<String>();
        dlist.addFirst("hanan");
        dlist.addFirst("tasnim");
        dlist.addLast("Alhammadi");
        dlist.addLast("AlanoUd");
        dlist.removeFirst();
        dlist.removeLast();
        dlist.display();

    }
}
