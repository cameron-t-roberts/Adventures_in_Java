// Basic Calulator Program using Classes and Methods. 

public class Calculator{
 // Calculator Constructor
 public Calculator(){

  }

// Method for Add
public int add(int a, int b){
int result = a + b;
return result;  
}

// Method for Subtract
public int subtract(int a, int b){
  int result = a - b; 
  return result; 
}

// Method for Multiply
public int multiply(int a, int b){
  int result = a * b;
  return result; 
}

// Method for Divide
public int divide(int a, int b){
  int result = a % b;
  return result; 
}

// Main Method
public static void main(String[]args){

  Calculator myCalculator = new Calculator(); 

System.out.println(myCalculator.add(5,7));

System.out.println(myCalculator.subtract(45, 11));
}


}