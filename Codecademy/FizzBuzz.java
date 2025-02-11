/* FizzBuzz problem. 
- Started with printing 1-100
- Added dividing by 3 to print "Fizz"
- Added dividing by 5 to print "Buzz"
- Added checking 3 & 5 and printing FizzBuzz but failed because that check was after the other checks. Moved FizzBuzz check first, and loop worked. 
- No external cheating! How about that! 
*/ 


class FizzBuzz {

    public static void main(String[] args) {

      for (int i = 1; i <= 100; i++){

          if ((i % 3 == 0) && (i % 5 == 0)){
            System.out.println("FizzBuzz");
          
          } else if (i % 3 == 0){
            System.out.println("Fizz");  
          
          } else if (i % 5 == 0){
            System.out.println("Buzz");
               
          } else {
            System.out.println(i);
          }

       
      }

    }


}