package firstapp;
import java.util.Scanner;
public class Primenumber {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter n value");
	int n,i,c=0;
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			c++;
		}
	}
	 if(c==2)
		 System.out.println("it's primenumber");
	 else
		 System.out.println("not primenumber");
}
}
