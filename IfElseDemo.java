import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		//if ((num++ >0) || (++num>5)&& (num ++> 8)//prev qn
		
		//count notes
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amt to return");
		int rupees = sc.nextInt();
		//54
		int notes10 = 0 , coin5=0, coin2=0, coin1=0;
		if(rupees > 10) {
			//54 / 10 ---- 5
			notes10 = rupees / 10;// 5 of 10
			rupees = rupees % 10;//8
			
		}
		
		if(rupees>5) {
			coin5 = rupees / 5;
			rupees = rupees % 5;
		}
		if(rupees >2) {
			coin2 = rupees / 2;//1
			rupees = rupees % 2;//1
		}
		
		if(rupees ==1) {
			coin1 =1;//5--1
		}
		
		if(notes10 >0) 
			System.out.println("10 notes---->"+notes10);
		if(coin5>0)
			System.out.println("5 coins---->"+coin5);
		if(coin2>0)
			System.out.println("2 coins---->"+coin2);
		if(coin1>0)
			System.out.println("1 coins---->"+coin1);
			
		}

	}


