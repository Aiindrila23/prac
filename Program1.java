import java.util.Scanner;

public class TableOf5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			int res = num*i;
			System.out.println(num+"*"+i+"="+ res);
		}
	}
}
