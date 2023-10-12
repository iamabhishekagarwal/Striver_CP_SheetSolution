import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        int ar[]=new int[n];
        boolean flag=true;
        for(int x=0;x<n;x++)
        {
            System.out.println("Enter 0/1");
            ar[x]=sc.nextInt();
        }
        for(int y=0;y<n;y++)
        {
            if(ar[y]==1)
            {
                flag=false;
                break;
            }
        }
        if(!(flag))
        {
            System.out.println("HARD");
        }
        else{
            System.out.println("EASY");
        }
    }
}
