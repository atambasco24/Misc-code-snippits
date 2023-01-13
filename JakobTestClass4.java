import java.util.Scanner;
public class JakobTestClass4 {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number to add to itself");
		a = scan.nextInt();
		System.out.println("enter how many times you want it to be added");
		b = scan.nextInt();
		int sum = 0;
		int count = 0;
		while (count != b) {
			sum += a;
			count++;
		}
		
		System.out.println(a + " added to itself " + b + " times is " + sum);
	}

}
