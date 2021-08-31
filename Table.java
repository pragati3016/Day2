import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num; 
		int[] a = new int[20];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		num = sc.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			a[i]=num*i;
			System.out.println(a[i]);
		}
	}

}
