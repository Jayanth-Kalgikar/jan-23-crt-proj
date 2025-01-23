import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		//to check whether char is uppercase or lowercase
		
		char ch;
		
		Scanner sc = new Scanner(System.in);
		char cod;
		do {
			System.out.println("please  enter a char");
			ch = sc.next().charAt(0); //Hello
			
			//ABC...Z
			//abc...z
			if((ch>='A') && (ch <= 'Z')) {
				System.out.println("ch is uppercase");
			}
			else if((ch >= 'a') && (ch <= 'z')) {
				
				System.out.println("lowercase");
			}
			
			
			System.out.println("ch--->"+ch);
			System.out.println("do you want to repeat..y or n");
			cod = sc.next().charAt(0);

			
		}
		while(cod=='y');
		System.out.println("ends");
		
		

	}

}
