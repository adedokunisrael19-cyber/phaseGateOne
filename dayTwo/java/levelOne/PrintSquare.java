import java.util.Scanner;
public class PrintSquare{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("enter a number: ");
    int number = input.nextInt();
       
    int square = number * number;
    
    System.out.printf("square is %d%n ", square);
    }
}
