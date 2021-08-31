import java.util.Scanner;
public class Multiplication {
	
	static int c;
	static double g;
	
	public static void mul(int a,int b)
	{
		 c = a * b;
	        System.out.println("Result Is : "+c);
	}
	
	public static void mul(double e,double f)
	{
		double g = e * f;
        System.out.println("Result Is : "+g);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number :");
		a = sc.nextInt();
		
		System.out.println("Enter Second Number :");
		b = sc.nextInt();
		
        c = a * b;
        System.out.println("Result Is : "+c);
     */
		mul(2,3);
		mul(1.1,1.5);
	}

}
