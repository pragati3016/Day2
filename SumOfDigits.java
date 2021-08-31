import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,sum = 0,n; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		num = sc.nextInt();
		
		while(num > 0)
		{
			n = num % 10;
			sum += n;
			num /= 10;
		}
		
		System.out.println("Sum of the Digits of a Number Is : "+sum);
	}

}
