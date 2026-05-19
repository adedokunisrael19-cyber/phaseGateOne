import java.util.Scanner;
public class LargestNumber{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("enter your score ");
    int number = input.nextInt();
    
    System.out.print("enter your score ");
    int numbertwo = input.nextInt();
    
    int maxNumber = number;
    if(numbertwo > number){
        maxNumber = numbertwo;
    }  
    System.out.print(maxNumber);
}
}
