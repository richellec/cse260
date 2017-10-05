import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;
/**
 * Write a description of class IteratorsOnLinkedLists here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IteratorsOnLinkedLists
{
    public static void main (String [] args){
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5000; i ++){
            list.add(i);
        }
        
        Iterator itr = list.iterator();
        long start = System.nanoTime();
        while (itr.hasNext()){
            itr.next();
        }
        long end = System.nanoTime();
        
        System.out.println("Traversing a LinkedList with an Iterator took " + (end - start) +
            " nanoseconds.");
        
        ListIterator litr = list.listIterator();
        long startLL = System.nanoTime();
        while (litr.hasNext()){
            litr.next();
        }
        long endLL = System.nanoTime();
        
        System.out.println("Traversing a LinkedList with an ListIterator took " + (endLL - startLL) +
            " nanoseconds.");
        
        long startTime = System.nanoTime();
        for (int i = 0; i < list.size(); i ++){
            list.get(i);
        }
        long endTime = System.nanoTime();
        
        System.out.println("Traversing a LinkedList with .get() took " + (endTime-startTime) +
            " nanoseconds.");
        
        int itrTime = (int)(end - start);
        int litrTime = (int)(endLL - startLL);
        int getTime = (int)(endTime - startTime);
        System.out.println();
        
        
        int itrCount = 0;
        int litrCount = 0;
        int getCount = 0;
        for(int i = 0; i < 100; i ++){
            if (itrTime < litrTime){
                if (itrTime < getTime){
                    System.out.println("Iterator is faster.");
                    itrCount ++;
                }else if (getTime < litrTime){
                    System.out.println(".getTime is faster.");
                    getCount ++;
                }
            } else{
                if (litrTime < getTime){
                    System.out.println("ListIterator is faster.");
                    litrCount ++;
                }
            }
        }
        
        System.out.println();
        System.out.println("Iterator: " + itrCount);
        System.out.println("ListIterator: " + litrCount);
        System.out.println(".get(): " + getCount);
    }
}
