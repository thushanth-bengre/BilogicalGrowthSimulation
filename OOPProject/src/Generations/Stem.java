/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generations;

/**
 *
 * @author Bengre
 */
public class Stem {
    private double startX;
    private double startY;
    private double angleFromX;
    private double length;
    private double endX;
    private double endY;
    public final static double deg2Rad = Math.PI/180.0;
    
    public Stem(double startX, double startY, double angleFromX, double length){
        this.startX = startX;
        this.startY = startY;
        this.angleFromX = angleFromX;
        this.length = length;
    }

    public double getStartX() {
        return startX;
    }

    public double getStartY() {
        return startY;
    }

    public double getAngleFromX() {
        return angleFromX;
    }

    public double getLength() {
        return length;
    }

    public double getEndX() {
        double localAngle = angleFromX * deg2Rad;
        endX = startX - (length * Math.cos(localAngle));
        return endX;
    }

    public double getEndY() {
        double localAngle = angleFromX * deg2Rad;
        endY = startY - (length * Math.sin(localAngle));
        return endY;
    }
    
    

    
    
    
}
