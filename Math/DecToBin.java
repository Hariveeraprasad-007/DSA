package Math;
public class DecToBin{
    public static void usingRecurrsion(int n,StringBuilder bin){
        if(n==0){
            return;
        }
        usingRecurrsion(n/2,bin);
        bin.append(n%2);
    }
    public static void usingDivision(int n,StringBuilder bin){
        while(n>0){
            bin.append(n%2);
            n=n/2;
        }
        bin.append('0');
    }
    public static void usingBitwise(int n ,StringBuilder bin){
        while(n>0){
            int b=n&1;
            bin.append(b);
            n=n>>1;
        }
        bin.reverse().toString();
    }
    public static void usingBuiltin(int n){
        String val=String.format("%s",Integer.toBinaryString(n));
        System.out.println(val);
    }
}