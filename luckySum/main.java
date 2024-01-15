import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 3 values: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		System.out.println(luckySum(a,b,c));
	}
	
	public static int luckySum(int a,int b,int c) {
		if(a == 13)
			return 0;
		else if(b == 13)
			return a;
		else if(c == 13)
			return (a + b);
		else
			return a+b+c;
	}
	

}
