import java.util.Scanner;

public class Conversion {
	
	static float anyCountryToIndianRupees(String country, int amt) {
		float res=0.0f;
		if(country.equalsIgnoreCase("USA")) {
			res = amt * 78.67f;
		}
		else if(country.equalsIgnoreCase("UK")) {
			res = amt * 120.56f;
		}
		else if(country.equalsIgnoreCase("UAE")) {
			res = amt * 20.56f;
		}
		
		return res;
	}
	static int getAmt() {
		return 100;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter country....");
		String country = sc.next();
		
		String cC = getAmtDetails(country);
		
		System.out.println("Please enter "+cC);
		if((cC.equalsIgnoreCase("Country not found!!"))) {
			System.out.println("Not able to process");
		}
		else {
			int amt = sc.nextInt();
			System.out.println("For this "+country+" for this amt= "+ amt + "indian amt will be  " +anyCountryToIndianRupees(country,amt));
		}
		
		}
	 static String getAmtDetails(String country) {
		 
		 String res = "";
		 if(country.equalsIgnoreCase("USA")) {
			 res = "Dollar";
		 }
		 else if(country.equalsIgnoreCase("UK")) {
			 res = "Pounds";
		 }
		 else if(country.equalsIgnoreCase("UAE")) {
			 res = "Dirams";
		
	}
		 else
		res = "Country not found!!";



	 return res;
}
	 
}