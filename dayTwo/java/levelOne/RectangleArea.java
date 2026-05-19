import java.util.Scanner;
public class RectangleArea{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("enter length ");
    int length = input.nextInt();
       System.out.print("enter width ");
     int width = input.nextInt();
    
    int area = length *width;
    
    System.out.printf("Area is %d%n ", area);
    }
}
