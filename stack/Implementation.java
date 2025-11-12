
package stack;
public class Implementation{
    private int[] stack;
    private int size;
    private int top;
    Implementation(int size){
        this.size=size;
        this.stack=new int[size];
        this.top=-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==size-1;
    }
    public void push(int x){
        if(top==size-1){
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top]=x;
        System.out.println("The element is added successfully");
    }
    public void display(){
        if(top==-1){
            System.out.println("the stack is empty");
            return;
        }
        for(int i:stack){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public void pop(){
        if(top==-1){
            System.out.println("The stack is empty");
        }
        int poped_element=stack[top--];
        System.out.println("element poped is "+poped_element);
    }
    public void peek(){
        if(top==-1){
            System.out.println("The stack is empty");
            return;
        }
        System.out.println("Top element is "+stack[top]);
    }
    public static void main(String[] args) {
        Implementation stack = new Implementation(5); // Creating a stack of size 5

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);

        // Peeking the top element
       stack.peek();

        // Popping elements from the stack
        stack.pop();
        stack.pop();
        stack.pop(); // Trying to pop from an empty stack

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}