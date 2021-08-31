import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int from, to, j=0;
		int[] a = new int[200];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number from Which the Odd Numbers to be Printed :");
		from = sc.nextInt();
		
		System.out.println("Enter the Number up to Which the Odd Numbers to be Printed :");
		to = sc.nextInt();
		
		for(int i=from; i<=to; i++)
		{
			if(i % 2 != 0)
			{
				a[j]=i;
				j++;
			}
		}
		
		for(int i=0; i<j; i++)
		{
			System.out.println(a[i]);
		}
	}

}
