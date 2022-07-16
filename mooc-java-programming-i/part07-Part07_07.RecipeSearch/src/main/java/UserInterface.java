
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
public class UserInterface {

    private Scanner scan;
    private RecipeManager recipeManager;

    public UserInterface(Scanner scan, RecipeManager recipeManager) {
        this.scan = scan;
        this.recipeManager = recipeManager;
    }
    
    public void start(){
     
        System.out.println("File to read: ");
        String fileName = scan.nextLine();
        
        recipeManager.readRecipe(fileName);
        
        System.out.println("list - lists the recipes\n" +
            "stop - stops the program\n" +
            "find name - searches recipes by name\n" +
            "find cooking time - searches recipes by cooking time\n" +
            "find ingredient - searches recipes by ingredient");
        
        while (true) {            
            
            System.out.println("Enter command: ");
            String command = scan.nextLine();
            
            if(command.equals("list")) {
                
                recipeManager.printAllRecipes();
            
            } else if(command.equals("find name")) {
                
                System.out.println("Searched word: ");
                String searchWord = scan.nextLine();
                
                ArrayList<Recipe> searchResults = recipeManager.searchRecipeByName(searchWord);
                
                System.out.println("Recipes: ");
                for (Recipe searchResult : searchResults) {
                    System.out.println(searchResult);
                }  
                
            } else if(command.equals("find cooking time")) {
                
                System.out.println("Max cooking time: ");
                int cookingTime = Integer.valueOf(scan.nextLine());
                
                ArrayList<Recipe> searchResults = recipeManager.searchRecipeByCookingTime(cookingTime);
                
                System.out.println("Recipes: ");
                for (Recipe searchResult : searchResults) {
                    System.out.println(searchResult);
                }  
                
            } else if(command.equals("find ingredient")) {
                
                System.out.println("Ingredient: ");
                String searchWord = scan.nextLine();
                
                ArrayList<Recipe> searchResults = recipeManager.searchRecipeByIngredient(searchWord);
                
                System.out.println("Recipes: ");
                for (Recipe searchResult : searchResults) {
                    System.out.println(searchResult);
                }  
                
            } else if(command.equals("stop")) {
                break;
            }
        }
        
        
        
    }
    
}
