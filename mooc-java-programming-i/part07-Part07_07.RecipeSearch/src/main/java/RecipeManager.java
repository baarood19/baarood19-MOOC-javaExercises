
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kripal
 */
public class RecipeManager {
    
    private ArrayList<Recipe> recipes;

    public RecipeManager() {
        this.recipes = new ArrayList<>();
    }
    
    public void readRecipe(String fileName) {
        
        try(Scanner fileScan = new Scanner(Paths.get(fileName))) {
            while(fileScan.hasNext()) {
                String name = fileScan.nextLine();
                
                int timeToCook = Integer.valueOf(fileScan.nextLine());

                ArrayList<String> ingredients = new ArrayList<>();
 
                while(fileScan.hasNext()) {
                    String temp = fileScan.nextLine();
                    if(!temp.isEmpty()){
                        ingredients.add(temp);
                    } else {
                        break;
                    }
                }
                Recipe addRecipe = new Recipe(name,timeToCook,ingredients);
                this.recipes.add(addRecipe);
            }
        } catch(Exception e) {
            System.out.println("Some error occured : " + e.getMessage());
        }
    }  
    
    public void printAllRecipes(){
        
        System.out.println("Recipes:");
        
        for (Recipe recipe : recipes) {
            
            System.out.println(recipe);
            
        }
        
    }
    
    public ArrayList<Recipe> searchRecipeByName(String searchWord) {
        ArrayList<Recipe> searchResult = new ArrayList<>();
        for (Recipe recipe : this.recipes) {
            
            if(recipe.getName().contains(searchWord)) {
                searchResult.add(recipe);
            }   
        }
        return searchResult;
    }
        
    public ArrayList<Recipe> searchRecipeByCookingTime(int cookingTime) {
        ArrayList<Recipe> searchResult = new ArrayList<>();
        
        for (Recipe recipe : this.recipes) {
            if(recipe.getTimeToPrepare() <= cookingTime) {
                searchResult.add(recipe);
            }   
        }
        return searchResult;
    }
    
    public ArrayList<Recipe> searchRecipeByIngredient(String ingredient) {
        ArrayList<Recipe> searchResult = new ArrayList<>();
        
        for (Recipe recipe : this.recipes) {
            
            for (String item : recipe.getIngredients()) {
                
                if(item.equals(ingredient)) {
                    searchResult.add(recipe);
                    break;
                }
                
            }
            
            
        }
        return searchResult;
    }
    
    
    
}
