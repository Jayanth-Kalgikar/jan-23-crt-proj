
public class PrimeNoV1 {

	public static void main(String[] args) {
		
		int n=13,r;
		boolean isPrime = true;
		int i = 2;
		
		for(;i<n;i++) {
			r = n % i;
			if(r==0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime==true) 
			System.out.println("yes");
		else System.out.println("no");

	}

}
