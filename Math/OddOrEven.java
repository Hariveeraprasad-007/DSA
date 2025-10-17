package Math;
public class OddOrEven {
    public static boolean check(int n){
        if((n&1)==0){
            return true;
        }   
        else{
            return false;
        }
    }
    public static void main(String[] args){
        if(check(2)){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
        if(check(3)){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}
