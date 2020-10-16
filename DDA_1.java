import java.util.*;
public class DDA_1
{
    public static void main(String args[])
    {
        int a[][]= new int [3][4],r,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 12 numbers :- ");
        for(r=0; r<3; r++)
        {
            for(c=0; c<4; c++)
            {
                a[r][c]=sc.nextInt();
            }
        }
        System.out.println("\n");
        
        for(r=0; r<3; r++)
        {
            for(c=0; c<4; c++)
            {
                System.out.print(" "+a[r][c]);
            }
            System.out.println("\n");
        }
    }
}
