
/**
 * Write a description of class Ingredient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ingredient
{
    public String name, measuringUnit;
    public int caloriesPerUnit;
    public Ingredient(String name, String measuringUnit, int caloriesPerUnit){
        this.name = name;
        this.measuringUnit = measuringUnit;
        this.caloriesPerUnit = caloriesPerUnit;
    }
}
