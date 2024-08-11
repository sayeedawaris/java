import java.util.Scanner;
public class charCheck
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char letter;
		System.out.print("Enter a letter or symbol: ");
		letter=sc.next().charAt(0);
		
		if(letter >= 65 && letter<=90)
			System.out.println("letter is uppercase");
		else if(letter >= 97 && letter<=122)
			System.out.println("letter is lowercase ");
		else if(letter>= 48 && letter <=57)
			System.out.println("You entered a number ");
		else	
			System.out.println("you entered some other symbol ");
	}
}
