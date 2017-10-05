
/**
 * Write a description of class Max here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Max<E>
{
    public static <E extends Comparable<E>> E max(E[] list){
        if(list.length == 0)
            return null;
        else if (list.length == 1)
            return list[0];
        else{
            E max = list[0];
            for(int i = 0; i < list.length; i ++){
                if(list[i].compareTo(max) > 0){
                    max = list[i];
                }
            }
            
            return max;
        }
    }
}
