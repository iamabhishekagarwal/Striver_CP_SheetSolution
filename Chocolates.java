import java.util.Scanner;
public class Chocolates {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number of shop");
        int shop=sc.nextInt();
        int ar[]=new int[shop];
        for(int x=0;x<shop;x++)
        {
            System.out.println("Enter chocolates in shop" +(x+1));
            ar[x]=sc.nextInt();
        }
        int sum=ar[shop-1];
        int position=ar[shop-1];
        for(int x=shop-2;x>=0;x--)
        {
            if(ar[x]>=1 && ar[x]<position)
            {
                sum+=ar[x];
                position=ar[x];
            }
            else if(ar[x]>=1 && ar[x]>position){
               if(position>0){
                sum+=position-1;
                position-=1;}
            }
            else
            {
                break;
            }
        }
        System.out.println(sum);
    }
}
