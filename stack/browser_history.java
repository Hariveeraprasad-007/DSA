package stack;
import java.util.*;
public class browser_history{
    Stack<String> forward;
    Stack<String> backward;
    String current;
    browser_history(String homepage){
        this.current=homepage;
        this.forward=new Stack<>();
        this.backward=new Stack<>();
    }
    public void visit(String page){
        backward.push(current);
        current=page;
        forward.clear();
    }
    public void back(){
        if(backward.isEmpty()){
            System.out.println("there are no pages visited before");
            return;
        }
        forward.push(current);
        current=backward.pop();
    }
    public void forward(){
        if(forward.isEmpty()){
            System.out.println("there is no page to go forwars=d");
            return;
        }
        backward.push(current);
        current=forward.pop();
        
    }
    public void show(){
        System.out.println(current);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String homepage = sc.next();
        browser_history browser = new browser_history(homepage);

        sc.nextLine(); // consume newline
        String line = sc.nextLine();

        String[] tokens = line.split(" ");
        for (int i = 0; i < tokens.length; i++) {
            String command = tokens[i].toLowerCase();

            switch (command) {
                case "visit":
                    if (i + 1 < tokens.length) {
                        browser.visit(tokens[++i]);
                    }
                    break;
                case "back":
                    browser.back();
                    break;
                case "forward":
                    browser.forward();
                    break;
                case "show":
                    browser.show();
                    break;
                default:
                    System.out.println("Invalid command: " + command);
            }
        }

        sc.close();
    }
}