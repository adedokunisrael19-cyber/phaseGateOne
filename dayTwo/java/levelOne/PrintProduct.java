import java.util.Scanner;
public class PrintProduct{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("enter a number: ");
    int numberOne = input.nextInt();
    
     System.out.print("enter a number: ");
    int numberTwo = input.nextInt();
       
     
    int product = numberOne * numberTwo;
    
    
    System.out.printf("product is %d%n ", product);
    }
}
