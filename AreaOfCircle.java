import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r,a,p,pi = 3.14;
		
		Scanner sc = new Scanner(System.in);
		//A = pi*r^2;
		//P = 2*pi*r; 
		System.out.println("Enter the radius of Circle :");
		r = sc.nextDouble();
		
		a = pi*(r*r);
		p = 2*pi*r;
		
		System.out.println("The Area of Circle Is : "+a);
		System.out.println("The Perimeter of Circle Is : "+p);

	}

}
