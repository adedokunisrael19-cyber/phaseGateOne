import java.util.Scanner;
public class TemperatureConversion{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("enter the temperature ");
    int temp = input.nextInt();
      
    
    int Fahrenheit = (temp * 9/5) + 32;
    
    System.out.printf("Sum is %d%n ", Fahrenheit);
    }
}
