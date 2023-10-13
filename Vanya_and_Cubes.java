import java.util.Scanner;
public class Vanya_and_Cubes {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of cubes");
        int cubes=sc.nextInt();
        int height=0;
        int no_of_cubes=1;
        while(cubes>=0)
        {
            int sum=0;
            for(int x=1;x<=no_of_cubes;x++)
            {
                sum+=x;
            }
            cubes-=sum;
            height++;
            no_of_cubes++;
        }
        System.out.println(height-1);
    }
}
