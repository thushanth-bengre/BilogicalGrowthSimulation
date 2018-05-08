/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Generations.Rendering;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Rule.Rule;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author Bengre
 */
public class RuleSelectionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RuleSelectionJPanel
     */
    private Rendering rendering;
    private JPanel cardSeqJPanel;
    private Rule rule;

    RuleSelectionJPanel(JPanel cardSeqJPanel) {
        initComponents();
        this.cardSeqJPanel=cardSeqJPanel;
        rendering = new Rendering();
        rule = null;
        jTextFieldRuleNum.setText("");
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)jTableRule.getModel();
        dtm.setRowCount(0);
        for(Rule r:rendering.getListOfRules()){
            Object row[] = new Object[4];
            row[0] = r;
            row[1] = String.valueOf(r.getNoOfBranches());
            row[2] = String.valueOf(r.getAngle());;
            row[3] = String.valueOf(r.getGrowthFactor());
            dtm.addRow(row);                   
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRule = new javax.swing.JTable();
        jButtonAddRule = new javax.swing.JButton();
        jButtonSelectRule = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldRuleNum = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(900, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Select Rule and Number Of Generation");

        jTableRule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rule Number", "Child", "Angle", "Growth Factor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableRule);
        if (jTableRule.getColumnModel().getColumnCount() > 0) {
            jTableRule.getColumnModel().getColumn(0).setResizable(false);
            jTableRule.getColumnModel().getColumn(1).setResizable(false);
            jTableRule.getColumnModel().getColumn(2).setResizable(false);
            jTableRule.getColumnModel().getColumn(3).setResizable(false);
        }

        jButtonAddRule.setText("Add Rule");
        jButtonAddRule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddRuleActionPerformed(evt);
            }
        });

        jButtonSelectRule.setText("Select Rule");
        jButtonSelectRule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelectRuleActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Number Of Generation:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("NEXT>>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Rule Number:");

        jTextFieldRuleNum.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(275, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonAddRule)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSelectRule))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox1, 0, 214, Short.MAX_VALUE)
                                .addComponent(jTextFieldRuleNum))))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(165, 165, 165))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddRule)
                    .addComponent(jButtonSelectRule))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldRuleNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jButton1)
                .addContainerGap(167, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddRuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddRuleActionPerformed
        // TODO add your handling code here:
        AddRuleJPanel panel = new AddRuleJPanel(cardSeqJPanel,rendering);
        cardSeqJPanel.add("AddRuleJPanel",panel);
        CardLayout layout = (CardLayout) cardSeqJPanel.getLayout();
        layout.next(cardSeqJPanel);
    }//GEN-LAST:event_jButtonAddRuleActionPerformed

    private void jButtonSelectRuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelectRuleActionPerformed
        // TODO add your handling code here:
        int selectedRowValue = jTableRule.getSelectedRow();
        
        if(selectedRowValue >= 0){
            rule= (Rule)jTableRule.getValueAt(selectedRowValue, 0);
            jTextFieldRuleNum.setText(String.valueOf(rule.getRuleNumber()));
        }
            
    }//GEN-LAST:event_jButtonSelectRuleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int noOfGen = Integer.parseInt((String)jComboBox1.getSelectedItem());
        if(rule != null){
        JOptionPane.showMessageDialog(null, "Switch to Full Screen before clicking on start on the next page!");
        SimulationJPanel panel = new SimulationJPanel(cardSeqJPanel,rendering,rule,noOfGen);
        cardSeqJPanel.add("AddRuleJPanel",panel);
        CardLayout layout = (CardLayout) cardSeqJPanel.getLayout();
        layout.next(cardSeqJPanel);
        
    }else
            JOptionPane.showMessageDialog(null, "Select a rule");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAddRule;
    private javax.swing.JButton jButtonSelectRule;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRule;
    private javax.swing.JTextField jTextFieldRuleNum;
    // End of variables declaration//GEN-END:variables
}