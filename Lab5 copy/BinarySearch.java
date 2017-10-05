
/**
 * Write a description of class BinarySearch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BinarySearch<E>
{
    public static<E extends Comparable<E>> int binarySearch(E[] list, E key){
        int hi = list.length;
        int lo =  0;
        int index = -1;
        while(hi == lo){
            int mid = lo+hi/2;
            if (key.compareTo(list[mid]) == -1)
                hi = mid;
            else if (key.compareTo(list[mid]) == 1)
                lo = mid;
            else{
                index = mid;
                break;
            }
        }
        return index;
    }
}
