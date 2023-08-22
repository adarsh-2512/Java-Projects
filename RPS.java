import java.util.Scanner;
import java.util.Random;
public class RPS 
{
	public static void main(String[] args)
	{
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\tWelcome to Rock,Paper and Scissors Game");
		int ch,ran = (int) (Math.random() * 3)+1;
//		System.out.print("Computer's Choice:");
//		System.out.println(ran);
		System.out.println("Player's Choice:\n1)Rock\n2)Paper\n3)Scissors");
		ch=sc.nextInt();
		if(ch==1)
			if(ran==2)
				System.out.println("You Win! Rock break's Scissors. ");
			else
				System.out.println("Sorry You Lost!,Better Luck Time.");
		if(ch==2)
			if(ran==3)
				System.out.println("You Win! Paper covers Rock. ");
			else
				System.out.println("Sorry You Lost!,Better Luck Time.");
		if(ch==3)
			if(ran==1)
				System.out.println("You Win! Scissors cut Paper. ");
			else
				System.out.println("Sorry You Lost!,Better Luck Time.");
	}
}
