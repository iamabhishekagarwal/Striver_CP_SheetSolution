import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Maximum_increase {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements ");
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int x=0;x<n;x++)
        {
            System.out.println("Enter element at index "+x);
            ar[x]=sc.nextInt();
        }
        int start=0;
        int end=1;
        int count=0;
        ArrayList<Integer> l=new ArrayList<>();
        l.add(0);
        while(end<ar.length)
        {
            if(ar[start]>=ar[end])
            {
                start=end++;
                l.add(count);
                count=0;
                continue;
            }
            end++;
            start++;
            count++;
        }
        l.add(count);
        Collections.sort(l);
        int index=l.size()-1;
        System.out.println(l.get(index)+1);
    }
}
