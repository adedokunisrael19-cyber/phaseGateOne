import java.util.Scanner;
public class PrintSum{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("enter a number: ");
    int firstNumber = input.nextInt();
       System.out.print("enter second number: ");
     int secondNumber = input.nextInt();
    
    int sum = firstNumber + secondNumber;
    
    System.out.printf("Sum is %d%n ", sum);
    }
}
