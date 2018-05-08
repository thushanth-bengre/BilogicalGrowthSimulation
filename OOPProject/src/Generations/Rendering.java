/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generations;

import Rule.Rule;
import java.util.ArrayList;

/**
 *
 * @author Bengre
 */
public class Rendering {    
    private ArrayList<Rule> listOfRules;
    
    public Rendering(){
        listOfRules = new ArrayList();
    }   

    public ArrayList<Rule> getListOfRules() {
        return listOfRules;
    }

    public Rule addRule(double angle, int noOfBranches, double growthFactor){
        Rule r = new Rule(angle, noOfBranches, growthFactor);
        listOfRules.add(r);
        return r;
    }
    
    public void startSimulation(Rule rule, int noOfGen){
        GenerationSet gs = new GenerationSet(rule, noOfGen);
    }
    
}
