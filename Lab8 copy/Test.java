import java.util.Stack;
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(String [] args){
        
        
        
        
    }
    public static boolean check (String s){
        if (s == null || s.equals (""))
            return true;    
        Stack stack = new Stack();
        for (Character c: s.toCharArray()){
            switch(c){
                case '(':
                case '[':
                case '{':
                	stack.push(c);
                	break;
                case ')':
                	if(stack.isEmpty() || !stack.pop().equals('('))
                		return false;
                	else
                		break; //for the switch case
                case ']':
                	if(stack.isEmpty() || !stack.pop().equals('['))
                		return false;
                	else
                		break;
                case '}':
                	if(stack.isEmpty() || !stack.pop().equals('{'))
                		return false;
                	else
                		break;
            }
        }
        return true;
    }
}
