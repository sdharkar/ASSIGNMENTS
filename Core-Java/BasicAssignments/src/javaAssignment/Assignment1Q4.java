package javaAssignment;

import java.util.Scanner;

class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
		
    	System.out.println(subject1Marks + " " + subject2Marks + " "+ subject3Marks);
    	if(subject1Marks >= 60.0 && subject2Marks >= 60.0 && subject3Marks >= 60.0) {
    		System.out.println("passed");
    	}
    	else if ((subject1Marks >= 60.0 && subject2Marks >= 60.0 && subject3Marks < 60.0) 
    			|| (subject1Marks >= 60.0 && subject2Marks < 60.0 && subject3Marks >= 60.0)
    			|| (subject1Marks < 60.0 && subject2Marks >= 60.0 && subject3Marks >= 60.0)) {
    		System.out.println("promoted");
    	}
    	else {
    		System.out.println("Failed");
    	}
		return null;
    	
    }
}

public class Assignment1Q4 {
	
	public static void main(String[] args) {
		
		/*try(Scanner sc = new Scanner(System.in)){
			double subject1Marks = sc.nextDouble();
			double subject2Marks = sc.nextDouble();
			double subject3Marks = sc.nextDouble();
		}
		*/
		ResultDeclaration result1 = new ResultDeclaration();
		result1.declareResults(70 ,80 , 40);
		
		
	}

}
