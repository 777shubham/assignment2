import java.util.Scanner;
class reverse
{
	public static void main(String args[])
	{
		int n,r,rev=0,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n");
		n=s.nextInt();
		temp=n;
		while(n!=0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println("Reverse of "+temp+" is = "+rev);
	}
	
	
}