import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Helpful_maths {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sum");
        String s=sc.nextLine();
        ArrayList<String> l=new ArrayList<>();
        StringTokenizer st=new StringTokenizer(s,"+");
        while(st.hasMoreTokens())
        {
            String token=st.nextToken();
            l.add(token);

        }
        String ans="";
        Collections.sort(l);
        for(int x=0;x<l.size();x++)
        {
            ans+="+"+l.get(x);
        }
        System.out.println(ans.substring(1));
    }
}
