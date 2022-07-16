/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kripal
 */
public class Container {
    
    private int holding;
    
    public Container() {
        this.holding = 0;
    }
    
    public int contains(){
        return holding;
    }
    
    public void add(int amount) {
        if(amount >= 0) {
            this.holding += amount;
            this.holding = this.holding > 100 ? 100 : this.holding;
        }
    }
    
    public void remove(int amount) {
        if(amount >=0) {
            this.holding -= amount;
            this.holding = this.holding < 0 ? 0 : this.holding;
        }
    }
    
    @Override
    public String toString() {
        
        return this.holding + "/100";
        
    }
    
}
