package javaAssignment;

class Assignment1Q2{
	static boolean armstrongNum(int num) {
		int original, rem, total=0;
		original = num;
		
		while(original != 0) {
			rem = original%10;
			total = total + (rem*rem*rem);
			original/=10;
		}
		
		if(total == num) {
			return true;
		}
		else {
		return false;
		}
		
	}
	
	public static void main(String[] args){
		
		for(int i=100; i<=999; i++) {
			if(armstrongNum(i)) {
				System.out.println(i + " ");
			}
		}
		
	}


}
