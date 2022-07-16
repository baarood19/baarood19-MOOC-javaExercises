/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kripal
 */
public class Birds {
    
    private String name;
    private String latinName;
    private int observations;

    public Birds(String name, String latinName, int obersvations) {
        this.name = name;
        this.latinName = latinName;
        this.observations = obersvations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public int getObersvations() {
        return observations;
    }

    public void setObersvations(int obersvations) {
        this.observations = obersvations;
    }
    
    @Override
    public String toString(){
        return this.name + " (" +this.latinName+ "): " + this.observations +" observations";
    }
}
