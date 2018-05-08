/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Generations.GenerationSet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import Generations.Stem;
import javax.swing.JScrollPane;


/**
 *
 * @author Bengre
 */
public class MyCanvas extends javax.swing.JPanel {

    /**
     * Creates new form MyCanvas
     */
    private GenerationSet gs;    
    

    MyCanvas(GenerationSet gs) {
        initComponents();
        this.gs=gs;       
    }
    
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;        
        Dimension size =getSize();
        g2d.setColor(Color.black);
        g2d.fillRect(0, 0, size.width, size.height);
    }
    
    public void draw(Graphics g, Stem s){        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.red);
        int startx = (int) s.getStartX();
        int starty = (int) s.getStartY();
        int endx = (int) s.getEndX();
        int endy = (int) s.getEndY();
        g2d.drawLine(startx, starty, endx, endy);
        
       }   
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMinimumSize(new java.awt.Dimension(900, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}