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
public class Generation {
    private Rule rule;    
    private int generationNumber;   
    private double length;    
    private ArrayList<Stem> listOfStem;
    
    
    public Generation(Rule rule, int generationNumber){
        this.rule = rule;
        this.generationNumber = generationNumber;
        length = 50*(generationNumber*rule.getGrowthFactor());
        listOfStem = new ArrayList<>();                
        createStems();
    }    
    
    
    private void createStems(){
        double angle =90;        
        double startX =(generationNumber *50)*(generationNumber);
        double startY = 600;
        ArrayList<Stem> parents = new ArrayList();
        for(int i=0; i<generationNumber; i++){
            if(i==0){
            Stem s = new Stem(startX, startY, angle, length);                
            parents.add(s);
            listOfStem.add(s);
            }
            else{
            parents = createChild(parents);
            }
            
        }       
    }
    
    private ArrayList<Stem> createChild(ArrayList<Stem> parents){
        ArrayList<Stem>  child = new ArrayList();
        for(Stem p:parents){        
        length = p.getLength()*0.50;
        double startX = p.getEndX();
        double startY = p.getEndY();
        double angle = (p.getAngleFromX() + (rule.getNoOfBranches()/2) * (rule.getAngle()));
        for(int i=0;i<rule.getNoOfBranches();i++){            
            Stem s = new Stem(startX, startY, angle, length);            
            child.add(s);
            listOfStem.add(s);
            angle = angle - (rule.getAngle());
        }
        }
        return child;        
    }

    public ArrayList<Stem> getListOfStem() {
        return listOfStem;
    }   
    
}
