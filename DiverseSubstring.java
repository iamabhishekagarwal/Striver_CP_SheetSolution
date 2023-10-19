import java.util.ArrayList;
import java.util.Scanner;
public class DiverseSubstring {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String ");
        String s=sc.nextLine();
        ArrayList<String> l=new ArrayList<String>();
        for(int x=0;x<s.length();x++)
        {
            String ch=Character.toString(s.charAt(x));
            l.add(ch);
        }
        int count=1;
        boolean find=true;
        for(int i=0;i<l.size()-1;i++)
        {
            if(count>(s.length()/2))
            {
                find=false;
                System.out.println("NO");
                break;
            }
            String first=l.get(i);
            String second=l.get(i+1);
            if(first.equalsIgnoreCase(second))
            {
                count++;
            }
            else{
                count=1;
            }
        }
        if(find==true)
        {
            System.out.println("YES \n"+(s.substring(0,(s.length()/2))));
        }
    }
}
