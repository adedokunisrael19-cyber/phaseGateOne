import java.util.Scanner;
public class printWelcome{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("what is your name: ");
    String userName = input.nextLine();
    
    System.out.printf("welcome %s%n ", userName);
    }
}
