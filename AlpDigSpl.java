import java.util.Scanner;

public class AlpDigSpl {
	
	// WAP to input any character and check whether it is alphabet digit or spl character

	public static void main(String[] args) {
		
		
	
		char  ch ;
		
		Scanner sc = new Scanner(System.in);//for input
		System.out.println("Enter any character: ");
		ch = sc.next().charAt(0);
		
		
		
		
		if((ch>='A') && (ch <= 'Z') || (ch >= 'a') && (ch <= 'z')) {
			System.out.println("It is an alphabet");
		
		
		}else if((ch >= '0') && (ch <= '9')){
			System.out.println("Input is a digit");
		}
		else {
			System.out.println("Input is spl character");
		}
			
		}	
			
	}
		

