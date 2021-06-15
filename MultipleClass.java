import java.util.Scanner;
class Opeartions
{
	public int sum()
	{
	sum=x+y;
	}
	public int sub()
	{
	sub=x-y;
	}
	public int mul()
	{
	mul=x*y;
	}
	public float div()
	{
	div=x/y;
	}
}
public class MultipleClass
{
	public static void main(String args[])
	{
	Scanner num= new Scanner(System.in);
	int x,y;
	System.out.println("Enter the two number");
	x=num.nextInt();
	y=num.nextInt();
	Operations operand = new Operations();
	operand.sum();
	operand.sub();
	operand.mul();
	operand.div();
	}
}
	