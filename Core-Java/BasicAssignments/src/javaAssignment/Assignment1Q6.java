package javaAssignment;
import java.util.*;


public class Assignment1Q6 {
	
	static String userId = "Ajay";
	static String password = "password";
	static boolean loginuser(String user, String pass) {
		if (userId.equals(user) && password.equals(pass)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			String user, pass;
			int attempt = 0;
			
			
			do {
				System.out.println("Enter userId : ");
				user = sc.next();
				
				System.out.println("Password : ");
				pass = sc.next();
				
				boolean ans =loginuser(user, pass);
				if(ans == true) {
					System.out.println("Welcome Ajay");
					break;
				}
				else if(ans == false && attempt <3) {
					System.out.println("You have entered wrong credentials ,please enter the right credentials.");
					attempt +=1;
				}
			}while(attempt != 3);
				
				if (attempt >= 3) {
					System.out.println("\n Contact Admine !!!\n");
				}
				
			
		}
		
	}

}
