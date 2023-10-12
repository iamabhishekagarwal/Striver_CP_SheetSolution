import java.util.Scanner;
class Chewbacca_and_Number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int copy=n;
        String ans="";
        while(copy!=0)
        {
            int digit=copy%10;
            int t=9-digit;
            
            if(t<digit && copy>9)
            {
                ans=t+ans;
                copy=copy/10;
                continue;
            }
            ans=digit+ans;
            copy/=10;
        }
        System.out.println(ans);
    }
}
