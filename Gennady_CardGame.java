import java.util.Scanner;
public class Gennady_CardGame {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter card on table ");
        String table=sc.nextLine();
        System.out.println();
        String ar[]=new String[5];
        for(int x=0;x<5;x++)
        {
            System.out.println("Enter card "+(x+1));
            ar[x]=sc.nextLine();
        }
        String tablefirst=Character.toString(table.charAt(0));
        String tablesecond=Character.toString(table.charAt(1));
        boolean play=false;
        for(int y=0;y<5;y++)
        {
            String first=Character.toString(ar[y].charAt(0));
            String second=Character.toString(ar[y].charAt(1));
            if(first.equalsIgnoreCase(tablefirst))
            {
                play=true;
                break;
            }
            if(second.equalsIgnoreCase(tablesecond))
            {
                play=true;
                break;
            }
        }
        if(!(play))
        {
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}
