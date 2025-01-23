import java.util.Scanner;

public class ConvertTo {

	public static void main(String[] args) {
		char ch;
		char cod;
		int upAsc = (int )'A';
		int lowAsc = (int)'a';
		int diff = upAsc - lowAsc;
		if(diff <0) diff = -1 *diff;
		
		System.out.println(diff);
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("please enter a char");
			ch = sc.next().charAt(0);
			if( (ch >= 'A') && (ch <= 'Z')) {
				System.out.println("ch is upper case");
				ch =  (char)(ch + diff);
				
			}
			else if( ( ch >= 'a') && (ch <= 'z')) {
				ch = (char)(ch - diff);
				System.out.println("Lower case");
			}
			System.out.println("after conversion...ch--->"+ch);
			System.out.println("do you want to repeat? if yes press y or n");
			cod = sc.next().charAt(0);
			if(cod == 'n') cod=0;
			else cod =1;
		} while (cod == 1);
		System.out.println("ends");
		}
		
		
		}
		
	


