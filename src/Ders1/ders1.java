package Ders1;
import java.util.Scanner;
public class ders1 {

	public static void main(String[] args) {
		// toplama
		Scanner input = new Scanner(System.in);
		int number1 ;
		int number2 ;
		int sum ;
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		sum = number1 +number2;
		
		System.out.printf("sum is %d%n",sum);
		
		if (number1 == number2)
			System.out.printf("%d = %d%n",number1,number2);

	}

}
