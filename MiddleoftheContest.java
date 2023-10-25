import java.util.Scanner;
import java.util.StringTokenizer;
public class MiddleoftheContest {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1");
        String s=sc.nextLine();
        System.out.println("Enter String 2");
        String s1=sc.nextLine();
        StringTokenizer st=new StringTokenizer(s,":");
        StringTokenizer st1=new StringTokenizer(s1,":");
        int h1=Integer.parseInt(st.nextToken());
        int h2=Integer.parseInt(st1.nextToken());
        int min1=Integer.parseInt(st.nextToken());
        int min2=Integer.parseInt(st1.nextToken());
        int mid=((h2-h1)*60+Math.abs(min2-min1))/2;
        min1+=mid;
        while(min1>59)
        {
            min1-=60;
            h1++;
        }
        System.out.println((h1>9?h1:("0"+h1))+":"+(min1>9?min1:("0"+min1)));
    }
}
