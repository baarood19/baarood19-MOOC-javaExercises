
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
    private BirdDatabase birdDB;
    
    public UserInterface(Scanner scan,BirdDatabase birdDB) {
        this.scan = scan;
        this.birdDB = birdDB;
    }
    
    public void start() {
        
        while(true) {
            
            System.out.println("?");
            String input = scan.nextLine();
            
            if(input.equals("Add")) {
                
                System.out.println("Name: ");
                String name = scan.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = scan.nextLine();
                Birds temp = new Birds(name, latinName, 0);
                birdDB.addBird(temp);
                
            } else if(input.equals("Observation")) {
                
                System.out.println("Bird?");
                String bird = scan.nextLine();
                
                birdDB.addObservation(bird);
                
            } else if(input.equals("All")){
                
                birdDB.printAllBirds();
                
            } else if(input.equals("One")) {
                
                System.out.println("Bird?");
                String bird = scan.nextLine();
                
                birdDB.printOneBirds(bird);
            } else if(input.equals("Quit")) {
                break;
            } else {
                continue;
            }
            
        }
        
        
    }
    
}
