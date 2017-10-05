import java.util.Scanner;
/**
 * Write a description of class DistinctNums here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DistinctNums{
    public int count = 0;
    public Scanner scan = new Scanner(System.in);
    public int[] list = new int[10];
    
    public void DistintNums(){
        System.out.println("Enter 10 numbers");
        
        for (int i = 0; i < 10; i ++){
            System.out.print("" + (i+1) + ". ");
            int in = scan.nextInt();
            
            if(check(in) == false){
                list[count] = in;
                count++;
            }
        }
        
        System.out.println("\nDistinct numbers:");
        for (int i = 0; i < count; i++){
            System.out.print(list[i] + " ");
        }
    }
    
    public boolean check(int num){
        for(int i = 0; i < count; i ++){
            if(list[i] == num){
                return true;
            }
        }
        return false;
    }
}
