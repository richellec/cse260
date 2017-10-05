import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class CookingRecipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CookingRecipe
{
    public String name;
    public ArrayList<RecipeIngredient> ingredientsList = new ArrayList<>();
    
    public CookingRecipe(String name){
        this.name = name;
    }

    public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity){
        for(RecipeIngredient i: ingredientsList){
            if(i.equals(ingredient) && i.quantity != quantity){
                i.quantity = quantity;
                break;
            }
        }
        ingredientsList.add((RecipeIngredient)ingredient);
    }
    
    public RecipeIngredient getRecipeIngredient(Ingredient ingredient){
        RecipeIngredient ri = null;
        for (RecipeIngredient i:ingredientsList){
            if(i.equals(ingredient)){
                ri = (RecipeIngredient)i;
                break;
            }
        }
        return ri;
    }
    public RecipeIngredient getRecipeIngredient(String ingredientName){
        RecipeIngredient ri = null;
        for (RecipeIngredient i:ingredientsList){
            if(i.name.equals(ingredientName)){
                ri = (RecipeIngredient)i;
                break;
            }
        }
        return ri;
    }
    
    public RecipeIngredient removeRecipeIngredient(Ingredient ingredient){
        RecipeIngredient ri = null;
        Iterator<RecipeIngredient> itr = ingredientsList.iterator();
        while(itr.hasNext()){
            if(itr.next().equals(ingredient))
                ri = itr.next(); itr.remove();
        }
        return ri;
    }
    public RecipeIngredient removeRecipeIngredient(String ingredientName){
        RecipeIngredient ri = null;
        Iterator<RecipeIngredient> itr = ingredientsList.iterator();
        while(itr.hasNext()){
            if(itr.next().name.equals(ingredientName))
                ri = itr.next(); itr.remove();
        }
        return ri;
    }
    
    public float calculateCalories(){
        float totalCalories = 0;
        for(RecipeIngredient i: ingredientsList){
            totalCalories += i.caloriesPerUnit*i.quantity;
        }
        return totalCalories;
    }
    
    public int getNumberOfIngredients(){
        return ingredientsList.size();
    }
    
    public String toString(){
        String retStr = name + ":\n";
        for(RecipeIngredient i:ingredientsList){
            retStr += "\t" + i.name;
        }
        return retStr;
    }
}
