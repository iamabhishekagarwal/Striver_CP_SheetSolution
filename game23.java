
import java.util.Scanner;
public class game23 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        System.out.println("Enter m");
        int m=sc.nextInt();
        System.out.println(game_23(n,m,0));
    }

    public static int game_23(int n, int m ,int count)
    {
        if(m==n)
        {
            return count;
        }
        if(n>m)
        {
            return -1;
        }
        int c=game_23(n*2,m,count+1);
        int b=game_23(n*3,m,count+1);
        
        return Math.max(c,b);
        
    }
}
