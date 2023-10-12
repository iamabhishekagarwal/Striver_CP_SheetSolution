import java.util.Scanner;
public class Anton_polyhedrons
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ar[]={"Tetrahedron","Cube","Octahedron","Icosahedron","Dodecahedron"};
        int face[]={4,6,8,20,12};
        int sum=0;
        for(int x=0;x<n;x++)
        {
            System.out.println("Enter your polyhedron "+(x+1));
            String polyhedron=sc.next();
            System.out.println();
            for(int y=0;y<ar.length;y++)
            {
                if(ar[y].equalsIgnoreCase(polyhedron))
                {
                    sum+=face[y];
                }
            }
        }
        System.out.println("Ans = "+sum);
    }
}
