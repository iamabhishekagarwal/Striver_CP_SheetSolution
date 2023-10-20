import java.util.Scanner;
public class luckySumOfDigits {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        String s=Solver(n,"");
        if(Lucky(s))
        {
            System.out.println(s);
        }
        else{
            System.out.println("-1");
        }

    }
    public static String Solver(int n,String s)
    {

        if(n==4)
        {
            return (s+"4");
        }
        if(n==7)
        {
            return (s+"7");
        }
        if(n<4)
        {
            return s+Integer.MAX_VALUE;
        }
        String s2=Solver(n-4,s+"4");
        String s1=Solver(n-7,s+"7");

        long m=Long.parseLong(s1);
        long n1=Long.parseLong(s2);
        return ""+Math.min(m,n1);
    }
    public static boolean Lucky(String s)
    {
        long n=Long.parseLong(s);
        while(n!=0)
        {
            long t=n%10;
            if(t==7 || t==4)
            {
                n/=10;
                continue;
            }
            return false;
        }
        return true;
    }   
}