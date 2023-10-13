import java.util.Scanner;
public class C {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of test Cases");
        int testcase=sc.nextInt();
        while(testcase!=0)
        {
            testcase--;
            System.out.println("Enter value of a");
            int a=sc.nextInt();
            System.out.println("Enter value of b");
            int b=sc.nextInt();
            System.out.println("Enter value o n");
            int n=sc.nextInt();
            int sum=a+b;
            int addnumber=a>b?a:b;
            int count=1;
            while(sum<=n)
            {
                int fibo=sum;
                sum+=addnumber;
                addnumber=fibo;
                count++;
            }
            System.out.println("Minimum number of operations needed = "+count);
        }
    }
}
