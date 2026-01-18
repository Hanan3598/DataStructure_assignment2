package Queue;

public class Main {
    public static void main(String[] args){
        SLinkedQueque<String> lqueue=new SLinkedQueque<String>();
        lqueue.enqueue("Abdullah");
        lqueue.enqueue("mohammed");
        lqueue.enqueue("Albaraa");
        lqueue.enqueue("Ahmed");
        System.out.println("the front element is = "+lqueue.front());

        System.out.println("the front element is : "+ lqueue.front());
          lqueue.display();

//    while (!lqueue.isEmpty()){
//        System.out.println("element removed: "+lqueue.dequeue());
//    }
    }
}
