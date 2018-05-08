/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generations;

import java.util.ArrayList;
import Rule.Rule;

/**
 *
 * @author Bengre
 */
public class GenerationSet {
    
    private ArrayList<Generation> generationSet;
    private Rule r;
    private int noOfGen;
    
    public GenerationSet(Rule r, int noOfGen){
        generationSet = new ArrayList();
        this.r=r;
        this.noOfGen=noOfGen;
        addGeneration();
    }
    
    public void addGeneration(){
        for(int i =0; i<noOfGen ;i++){
            Generation g = new Generation(r, i+1);
            generationSet.add(g);
        }
    }

    public ArrayList<Generation> getGenerationSet() {
        return generationSet;
    }   
    
    
}
