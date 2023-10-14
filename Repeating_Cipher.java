import java.util.Scanner;
public class Repeating_Cipher {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String ");
        String s=sc.nextLine();
        int start =0;
        int end =1;
        String ans="";
        int count=1;
        while(end<=s.length())
        {
            String get=s.substring(start, end);
            ans+=Character.toString(get.charAt(0));
            start=end+1;
            end+=++count;
        }
        System.out.println(ans);
    }
}
