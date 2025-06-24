
public class FC{
    public static int fc(int nums[]){
        int slow=nums[0];
        int fast=nums[0];
        while(true){
            slow=nums[slow];
            fast=nums[fast];
            if(slow==fast){
                break;
            }
        }
        int slow2=nums[0];
        while(slow!=slow2){
            slow=nums[slow];
            slow2=nums[slow2];
        }
        return slow;
    }
    public static void main(String[] args){
        int[] a={1,3,4,2,2};
        int result=fc(a);
        System.out.println(result);
    }
}