import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class kString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        System.out.println("Enter value of k");
        int k=sc.nextInt();
        ArrayList <String> l=new ArrayList<>();
        for(int x=0;x<s.length();x++)
        {
            l.add(Character.toString(s.charAt(x)));
        }
        String copy=s;
        Collections.sort(l);
        int start=0;
        int end=1;
        while(end!=l.size())
        {
            if(l.get(start).equalsIgnoreCase(l.get(end)))
            {
                l.remove(end);
                continue;
            }
            start++;
            end++;
        }
        String ans="";
        String finalans="";
        for(int i=0;i<l.size();i++)
        {
            ans+=l.get(i);
        }
        for(int j=1;j<=k;j++)
        {
            finalans+=ans;
        }       
        if(finalans.equalsIgnoreCase(copy))
        {
            System.out.println(-1);
        }
        else{
            System.out.println(finalans);
        }
    }
}
