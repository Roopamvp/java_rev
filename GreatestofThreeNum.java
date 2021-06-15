import java.util.Scanner;
public class GreatestofThreeNum
{
	public static void main(String args[])
	{
	Scanner num=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter the three numbers");
        a=num.nextInt();
	b=num.nextInt();
	c=num.nextInt();
	if(a>b && a>c)
		System.out.println("1st is the greatest number");
	else if(b>c && b>a)
		System.out.println("2nd is the greatest number");
	else if(c>a && c>b)
		System.out.println("3rd is the greatest number");
	}
}
	