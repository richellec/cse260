import java.util.ArrayList;
/**
 * Write a description of class GenericStackExtendsArrayList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GenericStackExtendsArrayList<E> extends ArrayList<E>
{
    public boolean empty(){
        return super.isEmpty();
    }
    public E peek(){
        return get(size()-1);
    }
    public E pop(){
        return remove(size()-1);
    }
    public void push(E item){
        add(item);
    }
    public int search(Object O){
        return indexOf(O);
    }
}
