package javaAssignment;

import java.util.*;

class TaxAmount{
    public double calculateTaxAmount(int ctc){
    	double amount;
    	if(ctc <= 180000) {
    		amount = ctc;
    	}
    	else if (ctc > 180000 && ctc <= 300000) {
    		amount = ctc - ctc * 0.1;
    	}
    	else if(ctc>300000 && ctc <= 500000) {
    		amount = ctc - ctc * 0.2;
    	}
    	else {
    		amount = ctc - ctc * 0.3;
    	}
    	
    	System.out.println("Taxable Income : "+amount);
		return ctc;
		}
}

public class Assignment1Q5 {
	
	public static void main(String[] args) {
		
		
			
		TaxAmount amount1 = new TaxAmount();
		amount1.calculateTaxAmount(10000000);
		
	}

}
