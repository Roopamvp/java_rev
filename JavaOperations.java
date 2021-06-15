import java.util.Scanner;
public class JavaOperations
{
     public static void main (String args[])
        {
           int x,y,sum,sub,mul;
           float div;
           Scanner scanner = new Scanner(System.in);
           System.out.println(" Enter the numbers : ");
           x=scanner.nextInt();
           y=scanner.nextInt();
           sum=x+y;
           sub=x-y;
           mul=x*y;
           div=x/y;
           System.out.println("Addition = " + sum);
           System.out.println("Subtraction = "+sub);
           System.out.println("Multiplication = "+mul);
           System.out.println("Division = " +div);
        }
}
