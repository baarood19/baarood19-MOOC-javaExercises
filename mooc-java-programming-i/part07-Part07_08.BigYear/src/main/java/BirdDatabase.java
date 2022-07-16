
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
public class BirdDatabase {

    private ArrayList<Birds> birds;

    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }
    
    public void addBird(Birds addBird){
        
        this.birds.add(addBird);
        
    }
    
    public void addObservation(String bird){
        
        if(this.findBird(bird)) {
            for (Birds fetch : birds) {
                
                if(fetch.getName().equals(bird)){
                    
                    int temp = fetch.getObersvations();
                    fetch.setObersvations(temp + 1);
                    
                }
                
            }
        } else {
            System.out.println("Not a bird!");
        }
    }
    
    public void printAllBirds() {
        
        for (Birds bird : birds) {
            System.out.println(bird);
        }
    }
    
    public void printOneBirds(String fetchBird) {
        
        if(findBird(fetchBird)){
            for (Birds bird : birds) {
                if(bird.getName().equals(fetchBird)) {
                    System.out.println(bird);
                }
            }
        } else {
            System.out.println("Not a bird!");
        }
    }
    
    public boolean findBird(String findBird){
        
        boolean found = false;
                
        for (Birds bird : birds) {
              if(bird.getName().equals(findBird)){
                  found = true;
              }
        }
        
        return found;
    }
    
    
    
    
    
    
    
    
    
}
