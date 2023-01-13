import java.util.Scanner;
public class JakobTestClass3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
		int count = 0;
		
		while(count < 8) {
			System.out.println(message);
			count++;
		}

	}

}
