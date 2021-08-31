import java.util.Scanner;
public class Addition {
	
	static int c;
	static double g;
	
	public static void add(int a,int b)
	{
		 c = a + b;
	        System.out.println("Result Is : "+c);
	}
	
	public static void add(double e,double f)
	{
		g = e + f;
        System.out.println("Result Is : "+g);
	}
	
	public static void add(String str1, String str2)
	{
		String str3 = str1 + str2;
        System.out.println("Result Is : "+str3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number :");
		a = sc.nextInt();
		
		System.out.println("Enter Second Number :");
		b = sc.nextInt();
		*/
		add("25","58");
		add(3,4);
		add(4.5,7.8);
	}

}
