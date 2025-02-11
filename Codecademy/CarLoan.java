/*
Simple auto loan calculator. Uses base price, down payment, loan duration, and interest rates to calulate monthly payment. 
*/


public class CarLoan {
	public static void main(String[] args) {
    int carLoan = 10000; //dollars
    int loanLength = 3; // years
    int interestRate = 5; // percent interest
    int downPayment = 2000; // total down payment
	
  // requirements for a car loan

  if (loanLength <= 0 || interestRate <= 0) {
    System.out.println("ERROR! You must take out a valid car loan"); // input validation for loan conditions
  
  } else if (downPayment >= carLoan) {
    System.out.println("The car can be paid in full"); // check to see if car can be paid in full
 
  } else {
    int remainingBalance = carLoan - downPayment; // Apply down payment
    int months = loanLength * 12; // calculate number of months in loand
    int monthlyBalance = remainingBalance / months; // calculate base cost per month
    int interest = monthlyBalance * interestRate / 100; // calculate interest costs per month
    int monthlyPayment = monthlyBalance + interest; // calculate monthly payment with interest

    System.out.println(monthlyPayment); // print monthly payment

	}
  }
}