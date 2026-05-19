import java.util.Scanner;
public class Largest{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("enter your score ");
    int number = input.nextInt();
    
    System.out.print("enter your score ");
    int numbertwo = input.nextInt();

     System.out.print("enter your score ");
    int numberthree = input.nextInt();
    
    int maxNumber = number;
    if(numbertwo > number){
        maxNumber = numbertwo;
    }else {
    maxNumber = numberthree;

}  
    System.out.print(maxNumber);
}
}
