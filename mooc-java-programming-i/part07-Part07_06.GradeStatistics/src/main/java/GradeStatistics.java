
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
public class GradeStatistics {
    
    private ArrayList<Integer> scores;
    
    public GradeStatistics(){
        scores = new ArrayList<>();
    }
    
    public void add(int score) {
        
        if(score >= 0 && score <=100) {
            scores.add(score);
        }
    }
    
    public double calculatePointAverage(){
        double average,sum = 0;
        
        for (Integer score : this.scores) {
//            System.out.println("="+ score);
            sum += score;
        }
        average = (sum / this.scores.size());
        
        return average;
    }
    
    public double calculatePointPassingAverage(){
        double average,sum = 0;
        int count = 0;
        
        for (Integer score : this.scores) {
            if(score>= 50){
                //System.out.println("="+ score);
                sum += score;
                count++;
            }
        }
        
        return sum == 0 ? -1 : sum / count;
    }
    
    public double calculatePassPercentage() {
        
        int passCount = 0;
        
        for (Integer score : scores) {
            if(score >= 50){
                passCount++;
            }
        }
        
        return (100.0 * passCount / this.scores.size());
        
        
    }
    
    public void generateGradeDistribution() {
        
        int[] gradeDistribution = new int[6];
        
        for (int score : this.scores) {
            
            if(score < 50){
                gradeDistribution[0]++;
            } else if(score < 60) {
                gradeDistribution[1]++;
            } else if(score < 70) {
                gradeDistribution[2]++;
            } else if(score < 80) {
                gradeDistribution[3]++;
            } else if(score < 90) {
                gradeDistribution[4]++;
            } else { //here
                gradeDistribution[5]++;
            }
            
        }
        
        this.printGradeDistribution(gradeDistribution);
        
    }
    
    public void printGradeDistribution(int[] gradeDist){
        
        System.out.println("Grade distribution: ");
        
        for (int i = 5; i >= 0; i--) {
            
            System.out.print(i +": ");
            for (int j = 0; j < gradeDist[i]; j++) {
                System.out.print("*");
            }
            
            System.out.println("");
            
        }
        
    }
    
    
}
