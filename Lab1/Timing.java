import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Write a description of class Timing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timing
{
    public DateFormat df = new SimpleDateFormat("HH:mm:ss");
    public Date date = new Date();
    public String startTime = df.format(date);
    
    public Timing(){
        System.out.println(startTime);
    }
    
    public linearSort
}
