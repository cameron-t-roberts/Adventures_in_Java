public class Magic {
	public static void main(String[] args) {

		int myNumber = 22;
    // myNumber will be the "Original Number"
/*
    int stepOne = myNumber * myNumber;

    int stepTwo = stepOne + myNumber;

    int stepThree = stepTwo / myNumber; 

    int stepFour = stepThree + 17;

    int stepFive = stepFour - myNumber; 

    int stepSix = stepFive / 6; 
*/
    int magicNumber = ((((((myNumber * myNumber) + myNumber ) / myNumber) + 17 ) - myNumber ) / 6);
    
    System.out.println(magicNumber);

	}
}