import java.util.Scanner;
public class Subtraction {
	
	static int c;
	static double g;
	
	public static void sub(int a,int b)
	{
		 c = a - b;
	        System.out.println("Result Is : "+c);
	}
	
	public static void sub(double e,double f)
	{
		g = e - f;
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
	
        c = a - b;
        System.out.println("Result Is : "+c);
        */
     
		sub(5,4);
		sub(4.5,3.5);
	}

}
