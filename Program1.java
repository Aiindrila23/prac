import java.util.Scanner;

public class swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int b = sc.nextInt();
		System.out.println("Numbers before swapping are: a = " +a+ ", b =" +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Numbers after swapping are: a=  " +a+ ", b = " +b);
	}
}