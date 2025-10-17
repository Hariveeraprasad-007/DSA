package Math;
public class SieveOfEratosthens{
    public static void printPrimes(int n){
        boolean[] arr=new boolean[n+1];
        for(int i=2;i<=n;i++){
            arr[i]=true;
        }
        for(int i=2;i<=n;i++){
            if(arr[i]){
                for(int j=i*i;j<=n;j+=i){
                    arr[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(arr[i]){
                System.out.println(i+" ");
            }
        }
    }
    public static void main(String[] args){
        printPrimes(42);
    }
}
