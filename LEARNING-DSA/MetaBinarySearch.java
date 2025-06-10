public class MetaBinarySearch{
    public static int metabinarysearch(int arr[],int x,int n){
        int pos=0;
        for(int i=Integer.SIZE-Integer.numberOfLeadingZeros(n);i>=0;i--){//Integer.SIZE = 32(32Bits) and Integer.numberOfLeadingZeros(count zeros of the bit length eg:n = 7 → 00000000 00000000 00000000 00000111 → 29 leading zeros)
    public static void main(String args[]){
        int arr[]={1, 3, 5, 7, 9, 11, 13};
        int x=9;
        int n=arr.length;
        int result=metabinarysearch(arr,x,n);
        if(result==-1){
            System.out.println("The element is not found");
        }
        else{
            System.out.println("The element is found at "+result);
        }
    }
}
