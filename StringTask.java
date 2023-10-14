import java.util.Scanner;
public class StringTask {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine().toLowerCase();
        String ar[]={"a","o","y","e","i","u"};
        String ans="";
        outer:
        for(int x=0;x<s.length();x++)
        {
            String ch=Character.toString(s.charAt(x));
            for(int y=0;y<ar.length;y++)
            {
                if(ch.equalsIgnoreCase(ar[y]))
                {
                    continue outer;
                }
                
            }
            ans+="."+ch;
        }
        System.out.println(ans);
    }
}
