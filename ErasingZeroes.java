import java.util.Scanner;
public class ErasingZeroes {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of test cases");
        int testcases=sc.nextInt();
        for(int x=1;x<=testcases;x++){
            System.out.println("Enter number ");
            String n=sc.next();
            System.out.println();
            int firstIndex=n.indexOf("1");
            int lastIndexOf=n.lastIndexOf("1");
            int count=0;
            if(firstIndex!=lastIndexOf){
                for(int i=firstIndex+1;i<lastIndexOf;i++)
                {
                    String s=Character.toString(n.charAt(i));
                    if(s.equalsIgnoreCase("0"))
                    {
                        count++;
                    }
                }
            }
            System.out.println(count);
    }
}
}
