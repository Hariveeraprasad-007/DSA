
package stack;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedList{
    private Node top;
    private int count;
    LinkedList(){
        this.top=null;
        this.count=0;
    }
    public void push(int x){
        Node newnNode=new Node(x);
        newnNode.next=top;
        top=newnNode;
        count++;
    }
    public void display(){
        if(top==null){
            System.out.println("There are no elements in stack");
            return;
        }
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void pop(){
        if(top==null){
            System.out.println("there are no elements in stack");
            return;
        }
        int value=top.data;
        top=top.next;
        count--;
        System.out.println("Poped element from the stack is "+value);
    }
    public void peek(){
        if(top==null){
            System.out.println("the are no elements");
            return;
        }
        System.out.println("The top element is "+top.data);
    }
    public boolean isEmpty(){
        return top==null;
    }
    public int size(){
        return count;
    }
    public static void main(String[] args) {
        LinkedList stack = new LinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display(); // Should print: 30 20 10

        stack.peek();    // Should print: Top element is 30

        stack.pop();     // Should print: Popped element: 30
        stack.display(); // Should print: 20 10

        stack.pop();
        stack.pop();
        stack.pop();     // Should show underflow message

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Current size: " + stack.size());
    }

}