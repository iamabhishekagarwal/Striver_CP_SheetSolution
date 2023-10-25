import java.util.Scanner;
public class palindromeTwist {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of the String");
        int n=sc.nextInt();
        System.out.println("Enter String");
        String s=sc.next();
        System.out.println();
        int p1=0;
        int p2=n-1;
        boolean ispalindrome=true;
        String ans="";
        while(p1<p2)
        {
            int first=s.charAt(p1);
            int second=s.charAt(p2);
            if(first!=97 && first!=122){
            if(first==(second-2) || first==(second+2)||first==(second+1)|| first==(second-1)|| first==second)
            {
                p1++;
                p2--;
                continue;
            }
            else{
                ispalindrome=false;
                break;
            }
        }
        else{
            if(first!=second)
            {
                ispalindrome=false;
                break;
            }
            p1++;
            p2--;
        }
        }
        if(ispalindrome)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
