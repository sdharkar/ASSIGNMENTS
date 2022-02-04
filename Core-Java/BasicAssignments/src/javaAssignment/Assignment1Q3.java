package javaAssignment;

class SiCi{
	public double simpleInterest(double principalAmount, int time, double interestRate) {
		
		
		double interest = (principalAmount * time * interestRate) / 100;
		System.out.println("Simple interest "+ interest);
		return 0;
		
	}
	
public double compoundInterest(double principalAmount, int time, double interestRate) {
	
	
	double interest = principalAmount * (Math.pow((1 + interestRate/100), (time * 365))) - principalAmount;	
	System.out.println("Compound Interest "+interest);
	return 0;
		
	}
	
}

public class Assignment1Q3 {
	
	public static void main(String args[]) {
		
		SiCi simple = new SiCi();
		simple.simpleInterest(5000,10,20);
		System.out.println(simple);
		
		SiCi complex = new SiCi();
		complex.compoundInterest(5000, 10, 20);
		System.out.println(complex);
		
	}

}
