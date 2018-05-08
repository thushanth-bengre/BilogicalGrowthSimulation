/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rule;

/**
 *
 * @author Bengre
 */
public class Rule {
    private double angle;
    private int noOfBranches;
    private int ruleNumber;
    private double growthFactor;
    public static int count =1;
    
    public Rule(double angle, int noOfBranches, double growthFactor){
        ruleNumber = count;
        count++;
        this.angle=angle;
        this.noOfBranches = noOfBranches;
        this.growthFactor = growthFactor;
    }

    public double getAngle() {
        return angle;
    }

    

    public int getNoOfBranches() {
        return noOfBranches;
    }

    
    public int getRuleNumber() {
        return ruleNumber;
    }

    public double getGrowthFactor() {
        return growthFactor;
    }
    
    @Override
    public String toString(){
        return String.valueOf(ruleNumber);
    }  
    
    
}
