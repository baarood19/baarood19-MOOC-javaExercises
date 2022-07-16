
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kripal
 */
public class Recipe {
    private String name;
    private int timeToPrepare;
    private ArrayList<String> ingredients ;

    public Recipe(String name, int timeToPrepare, ArrayList<String> ingredients) {
        this.name = name;
        this.timeToPrepare = timeToPrepare;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeToPrepare() {
        return timeToPrepare;
    }

    public void setTimeToPrepare(int timeToPrepare) {
        this.timeToPrepare = timeToPrepare;
    }
    
    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }
    
    public String toString(){
        
        return this.getName() + ", cooking time: " + this.getTimeToPrepare();
        
    }
    
}
