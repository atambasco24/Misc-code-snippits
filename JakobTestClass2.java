import java.util.Scanner;

public class JakobTestClass2 {

	public static void main(String[] args) {
		int seconds;
		int minutes = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Input number of seconds");
		seconds = scan.nextInt();
		
		if(seconds > 60) {
			minutes = seconds / 60;
			seconds = seconds % 60;
			
		}
		System.out.println("Time is " + minutes + " minutes and " + seconds +  " seconds." );
		
	}

}
