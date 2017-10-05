
/**
 * Write a description of class MyInteger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyInteger
{
    public int value;
    
    public MyInteger(int value){
        this.value = value;
    }
    
    public int getInt(){
        return value;
    }
    
    public boolean isEven(){
        return value % 2 == 0 ? true:false;
    }
    
    public boolean isOdd(){
        return value % 2 != 0 ? true:false;
    }
    
    public boolean isPrime(){
        for (int i = 2; i < value/2; i ++){
            if (value % i == 0){
                return false;
            }
        }
        return true;
    }
    
    
    public static boolean isEven(int val){
        return val % 2 == 0 ? true:false;
    }
    
    public static boolean isOdd(int val){
        return val % 2 != 0 ? true:false;
    }
    
    public static boolean isPrime(int val){
        for (int i = 2; i < val/2; i ++){
            if (val % i == 0){
                return false;
            }
        }
        return true;
    }
    
    
    public static boolean isEven(MyInteger val){
        return isEven(val.getInt()) ? true:false;
    }
    
    public static boolean isOdd(MyInteger val){
        return isOdd(val.getInt()) ? true:false;
    }
    
    public static boolean isPrime(MyInteger val){
        return isPrime(val.getInt()) ? true:false;
    }
    
    
    public static int parseInt(String str){
        return Integer.valueOf(str);
    }
    
    
    public static void main (String [] args){
    
    }
}
