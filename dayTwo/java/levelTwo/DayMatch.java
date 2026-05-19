import java.util.Scanner;
public class DayMatch{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("enter a number: ");
    int number = input.nextInt();
    
  
    if(number == 1){
     System.out.print("Sunday");
    } else if (number == 2){
     System.out.print("Monday");
   } else if (number == 3){
     System.out.print("Tuesday");
    }else if (number == 4){
     System.out.print("wednesday");
    }else if (number == 5){
     System.out.print("thursday");
    }else if (number == 6){
     System.out.print("friday");
    }else if (number == 1){
     System.out.print("Saturday");
    }
    }
}
