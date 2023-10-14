import java.util.Scanner;
public class FixYou {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of test cases");
        int test=sc.nextInt();
        for(int x1=1;x1<=test;x1++)
        {
            System.out.println("Enter number of rows");
            int r=sc.nextInt();
            System.out.println("Enter number of column");
            int c=sc.nextInt();
            String ar[][]=new String[r][c];
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.println("Enter number at index "+i+""+j);
                    ar[i][j]=sc.next();
                    System.out.println();
                }
            }
            int changes=0;
            for(int x=0;x<r;x++)
            {
                if(ar[x][c-1].equalsIgnoreCase("R"))
                {
                    changes++;
                }
            }
            for(int y=0;y<c;y++)
            {
                if(ar[r-1][y].equalsIgnoreCase("D"))
                {
                    changes++;
                }
            }
            System.out.println(changes);
        }
    }
}
