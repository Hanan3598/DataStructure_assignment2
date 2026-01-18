package CircularLinkedLinked;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList<String> list=new CircularLinkedList<String>();
        list.addFirst("Tasneem");
        list.addFirst("Haneen");
        list.addFirst("Abdullah");
        list.addLast("Nora");
        list.removeFirst();
        list.removeLast();
        list.display();



    }

}
