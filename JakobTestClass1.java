import java.util.Scanner;
public class JakobTestClass1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
	double values[];
	values = new double [4];
	
	int ArrayIndex = 0;
	
	while(ArrayIndex != 4) {
		System.out.println("Input a number");
		values[ArrayIndex] = scan.nextDouble();
		ArrayIndex++;
	}
	
	
	System.out.println("Average: " + (values[0] + values[1] + values[2] + values[3])/4);
}
}
