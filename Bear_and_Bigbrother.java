import java.util.Scanner;
public class Bear_and_Bigbrother {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter weight of Limak");
        int a=sc.nextInt();
        System.out.println("Enter weight of Bob");
        int b=sc.nextInt();
        int count=0;
        while(a<=b)
        {
            a*=3;
            b*=2;
            count++;
        }
        System.out.println(count);
    }
}
