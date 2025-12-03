
package HAPS;
import java.util.*;
public class Prefixsum{
    public static void presum(int[] arr){
        int[] result=new int[arr.length];
        result[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            result[i]=result[i-1]+arr[i];
        }
        for(int i:result){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int a=sc.nextInt();
        System.out.println("Enter the elements one by one ");
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        presum(arr);
    }
}