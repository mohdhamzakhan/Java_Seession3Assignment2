package session3;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num1=sc.nextInt();
		if(primeCheck(num1))
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
		sc.close();
	}
	static boolean primeCheck(int number)
	{
		boolean count=true;
		for(int i=2;i<number;i++)
		{
			if((number%i)==0)
			{
				count=false;
			}
		}
		return count;
	}

}
