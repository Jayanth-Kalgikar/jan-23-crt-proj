
public class RoundOff {

	public static void main(String[] args) {
		//i/p 999.649765 -- round off
		float num= 999.849765f;
		int m = (int)(num * 10);
		int r = m % 10;
		m = m / 10;
		
		if(r>5) {
			m = m + 1;
		}
		System.out.println(m);

	}

}
