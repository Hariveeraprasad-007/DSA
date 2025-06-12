public class Bubblesort{
    public static void bubblesort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean swapped=false;
            for(int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
    public static void main(String[] args){
        int arr[]={64,34,25,22,12,11,90};
        bubblesort(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}