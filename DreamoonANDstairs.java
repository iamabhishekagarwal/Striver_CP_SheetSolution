import java.util.Scanner;
public class DreamoonANDstairs {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of n");
        int n=sc.nextInt();
        System.out.println("Enter value of m ");
        int m=sc.nextInt();
        int no2=n/2;
        int no1=n%2;
        int ans=no2+no1;
        if(n<m)
        {
            System.out.println("-1");
        }
        else{
            while(ans%m!=0)
            {
                no2-=1;
                no1+=2;
                ans=no2+no1;
            }
            System.out.println(ans);
        }
    }
}
