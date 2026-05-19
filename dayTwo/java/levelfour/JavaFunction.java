public class JavaFunction {
    public static void main (String[] args){
   int result =  add(2,3);
    System.out.println(result);

    System.out.println(evenNumber(30));

    System.out.println(square(5);

    System.out.println(conversion(50);


    
}

    public static int add(int firstNumber, int secondnumber){
        return firstNumber + secondnumber;
    }

    public static boolean evenNumber(int number){
        if(number %2 ==0){
            return true;
        }return false;
    
    }

    
    public static int square(int number){
        return number * number;
    }

      public static int conversion(int number){
            int fahrenheit = (number * 9/5) + 31;
        return fahrenheit;
        }
    
          public static int primeNumber(int number){
            int fahrenheit = (number * 9/5) + 31;
        return fahrenheit;
        }

        
    public static int add(int firstNumber, int secondNumber, int thirdNumber){
    int temp=0;
      int maxNum = temp;
        if(secondNumber > firstNumber){
          temp = secondNumber; 
              secondNumber = firstNumber;
              firstNumber = temp;
        }else if( thirdNumber > firstNumber){
              temp = thirdNumber; 
              thirdNumber  = firstNumber;
              firstNumber = temp;
          }return maxNum;
         } 
    
      public static double interest(int principal, int rate, int time ){
            double principalInterest = (principal * rate * time) / 100;
        return  principalInterest;
        }
    

         public static int areaOfTriangle(int length, int width){
             return length + width;
          }
        
          public static int reverse(int number){
                 int  reversed =0;
                int digit = 0;
                number = digit;
                digit = number %10;
               reversed = (reversed *10 ) +digit;
                number /= 10; 
                return number; 

            }
      

        

}
