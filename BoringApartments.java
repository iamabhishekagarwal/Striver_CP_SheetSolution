import java.util.Scanner;
public class BoringApartments {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of test cases");
        int testcases=sc.nextInt();
        for(int i=1;i<=testcases;i++){
        System.out.println("Enter number");
        int number=sc.nextInt();
        int sum=0;

        inner:
        for(int x=1;x<=9;x++)
        {
            int newnumber=x;
            sum+=countDigit(newnumber);
            if(newnumber==number)
            {
                break;
            }
            for(int y=1;y<=3;y++)
            {
                newnumber+=x*Math.pow(10,y);
                sum+=countDigit(newnumber);
                if(newnumber==number)
                {
                    break inner;
                }
            }           
        }
        System.out.println(sum);
    }
}
    public static int countDigit(int n)
    {
        int count=0;
        while(n!=0)
        {
            count++;
            n/=10;
        }
        return count;
    }
}
