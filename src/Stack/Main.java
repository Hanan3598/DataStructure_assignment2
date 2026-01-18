package Stack;

public class Main {
    public static void main (String[] args) {
        DLinkedStack<Integer> lStack=new DLinkedStack<Integer>();
        ArrayStack<Integer> aStack=new ArrayStack<Integer>(5);
        //LinkedStack<Integer> lStack = new LinkedStack<Integer>();
        lStack.push(10);
        lStack.push(20);
        lStack.push(30);
        lStack.push(40);
        lStack.push(50);
        System.out.println("the top is = "+lStack.top());

        //while (!lStack.isEmpty()){
           // System.out.println("element removed : "+lStack.pop());}
        //lStack.display();

        aStack.display();
//        lStack.push(10);
//        lStack.push(20);
//        lStack.push(30);
//        lStack.push(40);
//        lStack.push(50);
//        System.out.println("the top is ="+lStack.top());
        //lStack.display();
//
//        while (!lStack.isEmpty()){
//            System.out.println("element removed :"+lStack.pop());
//        }
//
//
//
    }
}

