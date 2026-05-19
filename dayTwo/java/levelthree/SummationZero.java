import java.util.Scanner;
public class SummationZero{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("enter a number");
     int number = input.nextInt();
    int total=number;
    
  while(number !=0){
            System.out.print("enter a number");
            number = input.nextInt();
            total += number;         
        }     System.out.print(total);
    }
}
