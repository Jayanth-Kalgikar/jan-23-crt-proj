
public class SecondTypeFunction {
	
	static void pattern(char ch,char ch1, int num) {
		
		for(int i=1;i<=ch;i++) {
			System.out.print(ch);
			
		}
		System.out.println("\n");
	
	for(int i=1;i<=ch1;i++) {
		System.out.print(ch1);
		
	}
	System.out.println("\n");
	for(int i=1;i<=num;i++) {
		System.out.print(num);
	}
	System.out.println("\n");
	}
	public static void main(String[] args) {
		
		pattern('*','-',1);
		System.out.println("Welcome");
		pattern('.','-',2);
		System.out.println("Hyderabad");
		pattern('#','-',3);

	}

}
