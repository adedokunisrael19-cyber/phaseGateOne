import java.util.Scanner;
public class PrintDiscount{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("enter a price ");
    int price = input.nextInt();

    double discount = (price * 0.1);
    
    
    
    System.out.printf("discount  is %.2f%n ", discount );
    }
}
