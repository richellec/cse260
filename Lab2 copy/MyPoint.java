
/**
 * Write a description of class MyPoint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyPoint
{
    public double x, y;
    
    public MyPoint(){
        x = 0; 
        y = 0;
    }
    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    
    public double getDistance(MyPoint p){
        return Math.sqrt(Math.pow(Math.abs(x - p.getX()), 2) + Math.pow(Math.abs(y - p.getY()), 2));
    }
    public double getDistance(double a, double b){
        return Math.sqrt(Math.pow(Math.abs(x - a), 2) + Math.pow(Math.abs(y - b), 2));
    }
}
