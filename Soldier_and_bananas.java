import java.util.Scanner;
public class Soldier_and_bananas {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost of the banana");
        int k=sc.nextInt();
        System.out.println("Enter initial number of dollars");
        int n=sc.nextInt();
        System.out.println("Enter number of bananas");
        int w=sc.nextInt();
        int total_cost=(w*(w+1)/2)*k;
        System.out.println("He needs to borrow "+(total_cost-n)+" from his friend");
    }
}
