import java.util.Scanner;
/**
 * Write a description of class TestMyInteger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestMyInteger
{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        
        MyInteger val = new MyInteger(231);
        int x = val.getInt();
        System.out.println("Your integer is " + x + "\n");
        
        //Testing methods isEven, isOdd, isPrime:
        System.out.println("Your integer " + x + " is even: " + val.isEven());
        System.out.println("Your integer " + x + " is odd: " + val.isOdd());
        System.out.println("Your integer " + x + " is prime: " + val.isPrime() + "\n\n");
        
        //Testing static methods isEven(int), isOdd(int), isPrime(int):
        System.out.print("Pick an integer: ");
        int y = scan.nextInt();
        System.out.println("\nYour integer is " + y);
        System.out.println("Your integer is even: " + MyInteger.isEven(y));
        System.out.println("Your integer is odd: " + MyInteger.isOdd(y));
        System.out.println("Your integer is prime: " + MyInteger.isPrime(y));
        
        //Testing static methods isEven(MyInteger), isOdd(MyInteger), isPrime(MyInteger):
        System.out.println("Pick an integer: ");
        MyInteger z = new MyInteger(scan.nextInt());
        System.out.println("\nYour integer is " + z.getInt());
        System.out.println("Your integer is even: " + MyInteger.isEven(z));
        System.out.println("Your integer is odd: " + MyInteger.isOdd(z));
        System.out.println("Your integer is prime: " + MyInteger.isPrime(z));
    }
}
