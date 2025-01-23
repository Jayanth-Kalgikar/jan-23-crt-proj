import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();

		
		if(num>0) {
			System.out.println("+ve number");
		}
		else if(num < 0) {
			System.out.println("-ve number");
		}
		else if(num == 0) {
			System.out.println("zero number");
		}

	}

}
