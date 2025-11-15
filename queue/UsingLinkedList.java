package queue;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class UsingLinkedList{
    Node front;
    Node rear;
    UsingLinkedList(){
        this.front=null;
        this.rear=null;
    }
    public void enqueue(int data){
        Node newnode=new Node(data);
        if(rear==null){
            front=rear=newnode;
            System.out.println(newnode.data+" enqueued");
            return;
        }
        rear.next=newnode;
        rear=newnode;
        System.out.println(newnode.data+" enqueued");
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("there is no elements in the empty");
            return;
        }
        int val=front.data;
        front=front.next;
        if(front==null){
            rear=null;
        }
        System.out.println(val+" dequeued");
    }
    public void display(){
        if(isEmpty()){
            System.out.println("there is no elements in the empty");
            return;
        }
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("the queue is empty");
            return;
        }
        System.out.println("peek element "+front.data);
    }
    public boolean isEmpty(){
        return front==null;
    }
    public static void main(String[] args) {
    UsingLinkedList q = new UsingLinkedList();

    System.out.println("---- TESTING QUEUE ----");

    // Test enqueue
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);

    // Display queue
    System.out.print("Queue after enqueues: ");
    q.display();

    // Test dequeue
    q.dequeue();
    System.out.print("Queue after one dequeue: ");
    q.display();

    // Test peek
    System.out.print("Peek element: ");
    q.peek();

    // More operations
    q.enqueue(40);
    q.enqueue(50);
    System.out.print("Queue after more enqueues: ");
    q.display();

    // Dequeue all
    q.dequeue();
    q.dequeue();
    q.dequeue();
    q.dequeue();  // Should show empty message

    // Check empty
    if (q.isEmpty()) {
        System.out.println("Queue is empty now.");
    } else {
        System.out.println("Queue is not empty.");
    }
}

    
}
