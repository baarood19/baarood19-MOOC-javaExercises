
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
    private GradeStatistics gradeStats;

    public UserInterface(Scanner scan, GradeStatistics gradeStats) {
        this.scan = scan;
        this.gradeStats = gradeStats;
    } 
    
    public void start() {
        
        System.out.println("Enter point totals, -1 stops:");
        
        while(true) {
            
            int input = Integer.valueOf(this.scan.nextLine());
            
            if(input == -1 ){
                break;
            } else {
                this.gradeStats.add(input);
            }
            
        }
        
        
        System.out.println("Point average (all): " + gradeStats.calculatePointAverage());
        
        if(gradeStats.calculatePointPassingAverage() == -1){
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + gradeStats.calculatePointPassingAverage());
        }
        
        System.out.println("Pass percentage: " + gradeStats.calculatePassPercentage());
        
        this.gradeStats.generateGradeDistribution();
    }
    
    
    
    
}
