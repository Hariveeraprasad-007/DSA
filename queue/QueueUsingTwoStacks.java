package queue;
import java.util.*;
public class QueueUsingTwoStacks{
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    public void enqueue(int data){
        s1.push(data);
        System.out.println(data+" Enqueued");
    }
    public void dequeue(){
        if(s1.isEmpty()&&s2.isEmpty()){
            System.out.println("The queue is empty");
            return;
        }
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        int val=s2.pop();
        System.out.println(val+" Dequeued");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
        
        while (sc.hasNext()) {
            String command = sc.next();

            if (command.equalsIgnoreCase("enqueue")) {
                int x = sc.nextInt();
                queue.enqueue(x);
            } 
            else if (command.equalsIgnoreCase("dequeue")) {
                queue.dequeue();
            } 
            else {
                break; // stop if invalid command
            }
        }

        sc.close();
    }
}