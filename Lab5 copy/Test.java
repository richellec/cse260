import java.util.Scanner;
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        GenericStackExtendsArrayList<String> list = new GenericStackExtendsArrayList<>();
        for(int i = 0; i < 5; i++){
            System.out.println("Input something: ");
            list.push(scan.nextLine());
        }
        System.out.println();
        int size = list.size();
        for(int i = 0; i < size; i ++){
            System.out.println(list.pop());
        }
    }
}
