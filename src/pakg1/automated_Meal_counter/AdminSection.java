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
import java.sql.Connection;
import java.sql.DriverManager;
public class AdminSection extends javax.swing.JFrame {

    /**
     * Creates new form AdminSection
     */
    public AdminSection() {
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

        jTextField1 = new javax.swing.JTextField();
        MemberAddButton = new javax.swing.JButton();
        MealUpdateButton = new javax.swing.JButton();
        MemberDeleteButton = new javax.swing.JButton();
        AdminLogoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setEditable(false);
        jTextField1.setText("Welcome to admin section!!!");

        MemberAddButton.setText("Add member");
        MemberAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberAddButtonActionPerformed(evt);
            }
        });

        MealUpdateButton.setText("Update Meal");
        MealUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MealUpdateButtonActionPerformed(evt);
            }
        });

        MemberDeleteButton.setText("Delete member");
        MemberDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberDeleteButtonActionPerformed(evt);
            }
        });

        AdminLogoutButton.setText("Logout");
        AdminLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AdminLogoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(MemberDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addComponent(MealUpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MemberAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MemberAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MealUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MemberDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AdminLogoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLogoutButtonActionPerformed
        // TODO add your handling code here:
        //when logout button is pressed
        this.dispose();
        adminLogin adminlogin = new adminLogin();
        adminlogin.setVisible(true);
    }//GEN-LAST:event_AdminLogoutButtonActionPerformed

    private void MemberAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberAddButtonActionPerformed
        // TODO add your handling code here:
        
       //loading the member adding form
       AddingMembers addmemberform = new AddingMembers();
       addmemberform.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_MemberAddButtonActionPerformed

    private void MealUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MealUpdateButtonActionPerformed
        // TODO add your handling code here:
        //updating meal and calling the update meal form
        UpdatingMeal updatemealform = new UpdatingMeal();
       updatemealform.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_MealUpdateButtonActionPerformed

    private void MemberDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberDeleteButtonActionPerformed
        // TODO add your handling code here:
        //calling to deleting frame
        DeletingMembers deletemember = new DeletingMembers();
        deletemember.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MemberDeleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminLogoutButton;
    private javax.swing.JButton MealUpdateButton;
    private javax.swing.JButton MemberAddButton;
    private javax.swing.JButton MemberDeleteButton;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
