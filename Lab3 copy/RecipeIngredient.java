
/**
 * Write a description of class RecipeIngredient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RecipeIngredient extends Ingredient
{
    public float quantity;
    
    /**
     * Constructor for objects of class RecipeIngredient
     */
    public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quatity)
    {
        super(name, measuringUnit, caloriesPerUnit);
        this.quantity = quantity;
    }
}
