import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//Your challenge is to read in a price
		System.out.println("Enter the price of the item");
		double price=in.nextDouble();
		//Read in the amount paid
		System.out.println("Enter the amount Paid");
		double paidAmount=in.nextDouble();
		//Print out the amount of change
		
		double change= paidAmount-price;
		System.out.println("Your change is: $"+change);
		
		//Break the change into all denominations: 
		
		int num100 = (int)(change/100);  
		System.out.println("your number of $100 bills is " +num100+" x 100");
		change -=100*num100;
		int num50 = (int)(change/50);
		System.out.println("Your number of $50 bills is " +num50+" x 50");
		change -=50*num50;
		int num20 = (int)(change/20);
		System.out.println("Your number of $20 bills is " +num20+" x 20");
		change -=20*num20;
		int num10 = (int)(change/10);
		System.out.println("Your number of $10 bills is " +num10+" x 10");
		change -=10*num10;
		int num5 = (int)(change/5);
		System.out.println("Your number of $5 bills is " +num5+" x 5");
		change -=5*num5;
		int num2 = (int)(change/2);
		System.out.println("Your number of $2 bills is " +num2+" x 2");
		change -=2*num2;
		int num1 = (int)(change/1);
		System.out.println("Your number of $1 bills is " +num1+" x 1");
		change -=1*num1;
		int numquater = (int)(change/0.25);
		System.out.println("Your number of $0.25 coins is " +numquater+" x 0.25");
		change -=0.25*numquater;
		int numtenth = (int)(change/0.1);
		System.out.println("Your number of $0.10 coins is " +numtenth+" x 0.10");
		change -=0.1*numtenth;
		int numtwenth = (int)(change/0.1);
		System.out.println("Your number of $0.05 coins is " +numtwenth+" x 0.05");
		
		//$100,$50,$20,$10,$5,$2,$1,$0.25,$0.10,$0.05
		
		//As a bonus, make your project round to the nearest $0.05 like actual stores.
		
		
	}

}
