import java.util.Scanner;
public class Nearly_LuckyNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int count=countDigits(n);
        if (count==4 || count==7)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
    }

    public static int countDigits(int n)
    {
        int count=0;
        while(n!=0)
        {
            int temp=n%10;
            if(temp==4|| temp==7){
            count++;}
            n=n/10;
        }
        return count;
    }
}
