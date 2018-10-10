import java.util.Scanner;

public class labnumber3 {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		String userName;
		int userNumber;
		
		
		System.out.println("Enter your name ");
	    userName = scnr.next();
	    
	    System.out.println(userName + ", Please enter a positive number between 1 and 100: ");
	    userNumber = scnr.nextInt();
	    
	    if (userNumber % 2 == 0 && userNumber < 25) {
	    	System.out.println("Thank you, " + userName + " your number " + userNumber + " is even and less than 25.");
	    }
	    else if (userNumber % 2 == 0 && userNumber < 60) {
	    	System.out.println("Thank you, " + userName + " your number " + userNumber + " is even.");
	    	
	    }
	    else if (userNumber % 2 == 0 && userNumber > 60) {
	    	System.out.println("Thank you, " + userName + " your number " + userNumber + " is even.");
	    	
	    }
	    else if (userNumber % 2 != 0 && userNumber > 60) {
	    	System.out.println("Thank you, " + userName + " your number " + userNumber + " is odd and over 60.");
	    	
	    }
	    else {
	    	System.out.println("the number you entered " + userName +", "+  userNumber + " is odd. ");
	    }
	   
		
		
	    scnr.close();
	}
}