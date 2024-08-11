import java.util.Scanner;
public class insurance
{
	public static void main (String arg[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("Enter your gender: ");
		String gender=sc.next().toLowerCase();
		System.out.println("Enter your health condition (excellent/poor): ");
		String health =sc.next().toLowerCase();
		System.out.println("Enter your location (city/village): ");
		String location =sc.next().toLowerCase();
		int premium = 0;
		int maxAmount = 0;
		
		if(health.equals("excellent")&& age>=25 && age<=35 && location.equals("city"))
		{
			if(gender.equals("male"))
			{
				premium =4;
				maxAmount=200000;
			}
			else if(gender.equals("female"))
			{
				premium =3;
				maxAmount=100000;
			}
		}
		else if (health.equals("poor")&& age>=25 && age<=35 && location.equals("village") && gender.equals("male"))
		{
				premium = 6;
				maxAmount=10000;
		}
		
		if(premium > 0 && maxAmount > 0)
		{
			System.out.println("The person can be insured.");
				System.out.println("Premium rate : Rs. "+ premium+ " per thousand");
				System.out.println("maximun Amount insured :Rs "+maxAmount);
		}
		else
		{ 
			System.out.println("The person cannot be insured.");
		}
	}
	
}
