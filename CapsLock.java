import java.util.Scanner;
public class CapsLock {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        String ans="";
        if(allCap(s)||firstsmallrestcap(s))
        {
            for(int x=0;x<s.length();x++)
            {
                char ch=s.charAt(x);
                if(Character.isUpperCase(ch))
                {
                    ans+=Character.toString(ch).toLowerCase();
                }
                else{
                    ans+=Character.toString(ch).toUpperCase();
                }
            }
            System.out.println(ans);
        }
        else{
            System.out.println(s);
        }
    }

    public static boolean allCap(String s)
    {
        for(int x=0;x<s.length();x++)
        {
            char ch=s.charAt(x);
            if(!(Character.isUpperCase(ch)))
            {
                return false;
            }
        }
        return true;
    }

    public static boolean firstsmallrestcap(String s)
    {
        char first=s.charAt(0);
        if(Character.isLowerCase(first))
        {
            for(int x=1;x<s.length();x++)
            {
                char ch=s.charAt(x);
                if(!(Character.isUpperCase(ch)))
                {
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }
}
