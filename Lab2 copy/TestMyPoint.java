
/**
 * Write a description of class TestMyPoint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestMyPoint
{
    public static void main (String [] args){
        MyPoint a = new MyPoint(0, 0);
        MyPoint b = new MyPoint(10, 30.5);
        
        System.out.println("The distance between (0,0) and (10, 30.5) is " + a.getDistance(b));
    }
}
