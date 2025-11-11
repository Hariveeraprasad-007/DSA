package HAPS;
import java.util.*;
public class twosum {
    public static void main(String[] args){
    int[] arr={1,2,4,5,6,7};
    int target=14;
    Map<Integer,Integer> map=new HashMap<>();
    boolean found=false;
    for(int num:arr){
        if(map.containsKey(target-num)){
            System.out.println(num+" "+(target-num));
            found=true;
        }
        map.put(num,1);
    }
    if(!found){
        System.out.println("No pairs");
    }
}
}
