import java.util.Scanner;
public class Division {
	
	
	public static void div(double i,double j)
	{
		float k = (float) (i / j);
		System.out.println("Result Is : "+k);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//float a, b;
		//double c;
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number :");
		a = sc.nextInt();
		
		System.out.println("Enter Second Number :");
		b = sc.nextInt();
		
        c = a / b;
        System.out.println("Result Is : "+c);
     	*/
		
		div(20,5);
		div(4.2,1.4);
		div(4.2,1);
	}

}
