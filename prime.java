import java.util.Scanner;
public class prime
{
	public static void main(String[]args)
	{
		int  i,num,j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		sc.close();
		for(i=2;i<=num/2;++i)
		{ 
		if(num %i==0)
			{
			j=1;
			break;
			}
		}
		if(j==0)
		System.out.println(num+"is a prime number.");
		else
		System.out.println(num+"is not a prime number.");
	}

}