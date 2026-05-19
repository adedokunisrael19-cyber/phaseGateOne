import java.util.Scanner;
public class SummationFive{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

      int number =1;
    
int sum =1;
    
    for (int index =1; index<=5;  index++  ){
            System.out.print("enter a number");
            number = input.nextInt();
            number += number;         
        }   System.out.print(number);
    }
}
