import java.util.Scanner;
public class word_capitalization {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Word");
        String s=sc.nextLine();
        String firstIndex=Character.toString(s.charAt(0)).toUpperCase();
        
        String ans=firstIndex+s.substring(1);
        System.out.println(ans);
    }
}
