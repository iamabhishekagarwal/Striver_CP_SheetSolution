import java.util.ArrayList;
import java.util.Scanner;
public class Sum_of_RoundNumbers {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0)
        {
            System.out.println("Enter number ");
            ArrayList<Integer> l=new ArrayList<>();
            int number=sc.nextInt();
            int power=0;
            while(number!=0)
            {
                if(number%10==0)
                {
                    number/=10;
                    power++;
                }
                else{
                    int ans=(int)(number%10*Math.pow(10,power));
                    l.add(ans);
                    power++;
                    number/=10;
                }
            }
            for(int z=0;z<l.size();z++)
            {
                System.out.print(l.get(z)+"\t");
            }
            System.out.println("Total numbers = "+l.size());
            n-=1;
        }
    }
}
