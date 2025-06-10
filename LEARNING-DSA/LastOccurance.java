public class LastOccurance{
    public static int lastoccurance(int arr[],int target){
        int l=0;
        int h=arr.length-1;
        int result=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==target){
                result=mid;
                l=mid+1;
            }
            else if(arr[mid]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return result;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,3,4,5};
        int target=3;
        int result=lastoccurance(arr,target);
        if(result==-1){
            System.out.println("The element is not found");
        }
        else{
            System.out.println("The last occurence of the element is at "+result);
        }
    }
}