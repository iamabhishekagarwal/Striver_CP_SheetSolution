import java.util.Scanner;
public class Fox_and_Snake {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        System.out.println("Enter value of m");
        int m=sc.nextInt();
        if(n>=3 && m<=50)
        {
            for(int x=0;x<n;x++)
            {
                if((x+1)%2!=0)
                {
                    for(int z=0;z<m;z++)
                    {
                        System.out.print("#");
                    }
                    System.out.println();
                }
                else if((x+1)%2==0 && (x+1)%4!=0)
                {
                    for(int p=0;p<m-1;p++)
                    {
                        System.out.print(".");
                    }
                    System.out.println("#");
                }
                else
                {
                    System.out.print("#");
                    for(int h=1;h<m;h++)
                    {
                        System.out.print(".");
                    }
                    System.out.println();
                }
            }
        }
        else{
            System.out.println("Value of either m or n is not in range");
        }
    }
}
