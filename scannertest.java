import java.util.Scanner;

public class scannertest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter input:");
		
		//String text = input.nextLine();
		//int number = input.nextInt();
		double floatnumber = input.nextDouble();
		
		//System.out.println("text: " + text);
		//System.out.println("number: " + number);
		System.out.println("floating point number : " + floatnumber);
	}
}