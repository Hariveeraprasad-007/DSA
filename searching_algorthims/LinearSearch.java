// Make sure the class name and file name match exactly (LinearSearch.java)
public class LinearSearch{
    //Make sure you need pass arrays as 'name[]',brackets are must and should
    public static int search(int arr[],int N,int x){
        for(int i=0;i<N;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={2,5,3,7,4,1};
        int x=7;
        int result=search(arr,arr.length,x);//arr.length is used find length of the arrays
        if(result==-1){
            System.out.println("The element is not found");
        }
        else{
            System.out.println("The element is found at index of "+result);
        }
    }
}