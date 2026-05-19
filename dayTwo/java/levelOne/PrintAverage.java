import java.util.Scanner;
public class PrintAverage{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("enter a number: ");
    int numberOne = input.nextInt();
    
     System.out.print("enter a number: ");
    int numberTwo = input.nextInt();
       
     System.out.print("enter a number: ");
    int numberThree = input.nextInt();
          
    int sum = numberOne + numberTwo + numberThree;
    double average = sum / 3; 
    
    System.out.printf("average is %.2f%n ", average);
    }
}
