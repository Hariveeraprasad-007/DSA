package Math;
public class FloorAndCeil {
    public static int Floor(int a,int b){
        int q=a/b;
        if(((a^b)<0)&&(a%b!=0)){
            q--;
        }
        return q;
    }
    public static int ceil(int a,int b){
        int q=a/b;
        if((a^b)>0&&(a%b!=0)){
            q++;
        }
        return q;
    }
    public static void main(String[] args){
        int f1=Floor(10,2);
        int c1=ceil(10, 2);
        int f2=Floor(9,2);
        int c2=ceil(9,2);
        System.out.println(f1);
        System.out.println(c1);
        System.out.println(f2);
        System.out.println(c2);
    }
}
