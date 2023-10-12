import java.util.ArrayList;
import java.util.Scanner;
public class Tram {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Stops");
        int stop=sc.nextInt();
        ArrayList<Integer> entry=new ArrayList<>();
        ArrayList<Integer> leave=new ArrayList<>();
        for(int x=1;x<=stop;x++)
        {
            System.out.println("Enter Entry and leave at Stop "+x);
            leave.add(sc.nextInt());
            entry.add(sc.nextInt());
            
        }
        int current_capacity=0;
        int max_capacity=0;
        for(int y=1;y<=stop-1;y++)
        {
            current_capacity+=entry.get(y-1)-leave.get(y-1);
            if(max_capacity<current_capacity)
            {
                int temp=max_capacity;
                max_capacity=current_capacity;
                
            }
        }     
        System.out.println("Capacity Required = "+max_capacity);
    }
}
