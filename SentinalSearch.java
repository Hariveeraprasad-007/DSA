public class SentinalSearch{
    public static int sentinalsearch(int arr[],int n,int x){
        int last_element=arr[n-1];
        int i=0;
        arr[n-1]=x;
        while(arr[i]!=x){
            i++;
        }
        if(i<n-1||arr[n-1]==x){
            return i;
        }
        else{
            return -1;
        }
    }
    public static void main(String args[]){
        int arr[]={ 10, 20, 180, 30, 60, 50, 110, 100, 70 };
        int x=180;
        int n=arr.length;
        int result=sentinalsearch(arr,n,x);
        if(result==-1){
            System.out.println("The element is not found");
        }
        else{
            System.out.println("The element is found at "+result);
        }
    }
}
