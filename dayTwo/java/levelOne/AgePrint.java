import java.util.Scanner;
public class AgePrint{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("what is your age: ");
    String userAge = input.nextLine();
    int newAge = int(userAge) + 5;
    
    System.out.printf("welcome %d%n ", newAge);
    }
}
