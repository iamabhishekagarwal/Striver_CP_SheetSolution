import java.util.*;
public class Buttons {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of buttons lock has");
        int x=sc.nextInt();
        int ans=1;
        while(x>0)
        {
            ans*=x;
            x--;
        }
        ans+=1;
        System.out.println(ans);
    }
}
    
