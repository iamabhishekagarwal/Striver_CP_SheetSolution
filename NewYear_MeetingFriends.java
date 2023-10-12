import java.util.ArrayList;
import java.util.Scanner;
public class NewYear_MeetingFriends {
    public static void main(String args[])
    {
        ArrayList <Integer> l=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[3];
        for(int x=0;x<3;x++)
        {
            System.out.println("Enter value of x"+(x+1));
            ar[x]=sc.nextInt();
        }

        //sort
        for(int z=0;z<=1;z++)
        {
            for(int y=0;y<=1;y++)
            {
                if(ar[y]>ar[y+1])
                {
                    int temp=ar[y];
                    ar[y]=ar[y+1];
                    ar[y+1]=temp;
                }
            }
        }

        //list input
        for(int i=0;i<ar.length;i++)
        {
            l.add(ar[i]);
        }

        int sum=0;
        for(int j=0;j<ar.length;j=j+2)
        {
            int number=l.get(1);
            sum+=Math.abs(number-(l.get(j)));
            
        }
        System.out.println(sum);
    }
    
}
