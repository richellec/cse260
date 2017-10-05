import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class RecipeBook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RecipeBook
{
    public String bookName;
    public ArrayList<CookingRecipe> recipesList = new ArrayList<>();
    public RecipeBook(String bookName){
        this.bookName = bookName;
    }
    
    public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients){
        CookingRecipe recipe = null;
        for(CookingRecipe r: recipesList){
            if(r.name.equals(name)){
                recipe = new CookingRecipe(name);
                for(RecipeIngredient i:ingredients){
                    recipe.addOrUpdateRecipeIngredient(i, i.quantity);
                }
            }
            else{
                recipe = r;
                for(RecipeIngredient i:ingredients){
                    r.addOrUpdateRecipeIngredient(i, i.quantity);
                }
            }
        }
        return recipe;
    }
    
    public CookingRecipe removeRecipe(String name){
        CookingRecipe recipe = null;
        Iterator<CookingRecipe> itr = recipesList.iterator();
        while(itr.hasNext()){
            if(itr.next().name.equals(name)){
                recipe = itr.next();
            }
        }
        return recipe;
    }
    
    public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients){
        ArrayList<CookingRecipe> recipes = new ArrayList<>();
        for(CookingRecipe r: recipesList){
            int size = ingredients.length;
            int count = 0;
            for(RecipeIngredient i: ingredients){
                if(!r.getRecipeIngredient(i).equals(null)){
                    count++;
                }
            }
            if(size == count)
                recipes.add(r);
        }
        CookingRecipe[] recipesArray = null;
        if(recipes.size()!=0){
            recipesArray = new CookingRecipe[recipes.size()];
            for(int i = 0; i < recipesArray.length; i++){
                recipesArray[i] = recipes.get(i);
            }
        }
        return recipesArray;
    }
    
    public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients){
        ArrayList<CookingRecipe> recipes = new ArrayList<>();
        for(CookingRecipe r: recipesList){
            if(r.ingredientsList.size() < numberOfIngredients)
                recipes.add(r);
        }
        CookingRecipe[] recipesArray = null;
        if(recipes.size()!=0){
            recipesArray = new CookingRecipe[recipes.size()];
            for(int i = 0; i < recipesArray.length; i++){
                recipesArray[i] = recipes.get(i);
            }
        }
        return recipesArray;
    }
    public CookingRecipe[] findRecipesLowCalories(){
        CookingRecipe[] recipesArray = null;
        if(recipesList.size() != 0){
            recipesArray = new CookingRecipe[1];
            float lowestCal = recipesList.get(0).calculateCalories();
            for(CookingRecipe r: recipesList){
                if(r.calculateCalories() < lowestCal){
                    recipesArray[0] = r;
                    lowestCal = r.calculateCalories();
                }
            }
        }
        return recipesArray;
    }
}
