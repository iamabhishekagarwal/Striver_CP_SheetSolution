import java.util.Scanner;
public class NewYearTransportation {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of cell");
        int n=sc.nextInt();
        System.out.println("Enter target place");
        int t=sc.nextInt();
        int ar[]=new int[n-1];
        for(int x=0;x<ar.length;x++)
        {
            ar[x]=sc.nextInt();
        }
        int position=1;
        int count=0;
        while(position<t)
        {
            position+=ar[position-1];
        }
        if(position==t)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
