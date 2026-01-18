package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> List=new SinglyLinkedList<Integer>();
        List.addFirst(10);
        List.addLast(   20);
        List.addFirst(30);
        List.addLast(40);

        List.removeFirst();

        List.display2();
    }
}
