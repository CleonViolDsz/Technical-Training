import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Enter 3 values: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.print(greenTicket(a,b,c));

	}
	
	public static int greenTicket(int a,int b,int c) {
		if(a != b && a != c) {
			return 0;
		}
		else if(a == b && a == c) {
			return 20;
		}
		else {
			return 10;
		}
	}

}
