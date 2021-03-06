/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakg1.automated_Meal_counter;

/**
 *
 * @author Tammum Islam
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class DeletingMembers extends javax.swing.JFrame {

    /**
     * Creates new form DeletingMembers
     */
    public DeletingMembers() {
        initComponents();
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
        deletingIdTextBox = new javax.swing.JTextField();
        deletingButton = new javax.swing.JButton();
        deletingClearButton = new javax.swing.JButton();
        backtoAdminSection = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("id");

        deletingButton.setText("Delete");
        deletingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletingButtonActionPerformed(evt);
            }
        });

        deletingClearButton.setText("Clear");
        deletingClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletingClearButtonActionPerformed(evt);
            }
        });

        backtoAdminSection.setText("Back");
        backtoAdminSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtoAdminSectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deletingButton)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deletingIdTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(deletingClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backtoAdminSection, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletingIdTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletingClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backtoAdminSection, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deletingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletingButtonActionPerformed
        // TODO add your handling code here:
        //adding a member to the members database
        int status = 0;

        try{
            String id = deletingIdTextBox.getText();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mealcounter","tam1","ce13030");
            JOptionPane.showMessageDialog(this, "database connection successful");
            PreparedStatement ps=con.prepareStatement("delete from members where ids=?");
            ps.setString(1,id);
            status = ps.executeUpdate();
            if(status>0){
                JOptionPane.showMessageDialog(this, "deleting successful");
                status = 0;
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this, "database connection failed");
        }
    }//GEN-LAST:event_deletingButtonActionPerformed

    private void deletingClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletingClearButtonActionPerformed
        // TODO add your handling code here:
        //clearing the textfields for new addition
        deletingIdTextBox.setText("");
    }//GEN-LAST:event_deletingClearButtonActionPerformed

    private void backtoAdminSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtoAdminSectionActionPerformed
        // TODO add your handling code here:
        //going back to admin section
        AdminSection adminsection = new AdminSection();
        adminsection.setVisible(true);
        adminsection.setLocation(450,150);
        this.dispose();
    }//GEN-LAST:event_backtoAdminSectionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DeletingMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeletingMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeletingMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeletingMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeletingMembers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backtoAdminSection;
    private javax.swing.JButton deletingButton;
    private javax.swing.JButton deletingClearButton;
    private javax.swing.JTextField deletingIdTextBox;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
