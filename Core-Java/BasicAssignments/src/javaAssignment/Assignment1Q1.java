package javaAssignment;

class Assignment1Q1{
	
		
		
	public static void main(String[] args) {
		
		System.out.println("Armstrong Number");
		
		int num=371, original, rem, total=0;
		original = num;
		
		while(original != 0) {
			rem = original%10;
			total = total + (rem*rem*rem);
			original/=10;
		}
		
		if(total == num) {
			System.out.println(num +" Armstrong Number");
		}
		else {
			System.out.println(num + " Not Armstrong Number");
		}
		
	}



}
