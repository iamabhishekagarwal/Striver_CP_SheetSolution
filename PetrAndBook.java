import java.util.Scanner;
public class PetrAndBook {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int ar[]=new int[7];
        for(int x=0;x<7;x++)
        {
            System.out.println("Enter pages at "+(x+1));
            ar[x]=sc.nextInt();
        }
        int sum=0;
        int count=0;
        while(sum<n)
        {
            sum+=ar[count++];
            if(count==7)
            {
                count=0;
            }
        }
        System.out.println(count);
    }
}
