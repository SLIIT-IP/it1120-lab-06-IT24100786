import java.util.Scanner;

public class IT24100786Lab6Q1{
public static void main(String[] args)
{
     Scanner input = new Scanner(System.in);
     
     int number;
     double square, squareRoot;
{
     System.out.print("Enter a number: ");
     number = input.nextInt();
  }   
    
  
    
     square = number * number;
     squareRoot = Math.sqrt(number);

    System.out.println("\n");

    System.out.println("The square of " + number + " is: " + square);
    System.out.println("The square root of " + number + " is: " + squareRoot);
   


}
}