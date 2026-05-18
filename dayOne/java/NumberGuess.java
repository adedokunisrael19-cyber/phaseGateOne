import java.util.Random;
import java.util.Scanner;
public class NumberGuess{
    public static void main(String[] args){

        java.util.Random randomNumber = new java.util.Random();

        int numberGuess = randomNumber.nextInt(100);
        System.out.println(numberGuess);

       
        
      Scanner input = new Scanner(System.in);
      System.out.print("enter a random guess: ");
      int guess = input.nextInt();
    
        int count = 0;
        int rightGuess = 0;
        int wrongGuess = 0;

   
          if(guess < numberGuess ){
                System.out.print("number is lesser ");
            
             }else if(guess > numberGuess ){
                System.out.print("number is greater");
             }  
         
            while(guess != numberGuess){
                      System.out.println(numberGuess);
                if(guess == numberGuess){
                    break;
                }
                 System.out.println("enter a random guess: ");
                guess = input.nextInt();
                wrongGuess ++;
                 if(wrongGuess == 5){
            break;    
            }
        }
       if(wrongGuess ==1){
          System.out.print("Legend");    
        }else if(wrongGuess ==2){
          System.out.print("excellent");    
        }else if(wrongGuess <=3 || wrongGuess <=4){
          System.out.print("Good");   
       } else{
          System.out.print("No win, back luck");    
        }
            
        System.out.printf("correct number is" %d%n, "you attempted it", %d%n "times, rating %d%n", )
        
    }
}
