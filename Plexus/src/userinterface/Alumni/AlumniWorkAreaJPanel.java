/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Alumni;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Business.Alumni.AlumniDirectory;
import Business.Organization.AmbassadorOrganization;
import Business.Organization.AlumniOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;



/**
 *
 * @author chels
 */
public class AlumniWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AluminiWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private AlumniDirectory alumniDirectory;
    private EcoSystem business;
    private UserAccount account;
    private AlumniOrganization organization;
    //private Organization organization;
    private Organization org;
    private Enterprise enterprise;

    public AlumniWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, AlumniOrganization organization, Enterprise enterprise) {
         initComponents();
        this.userProcessContainer=userProcessContainer;
        this.alumniDirectory=alumniDirectory;
        this.org=org;
        this.account=account;
        this.organization=organization;
        this.enterprise=enterprise;
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        chatBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Alumni Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 11, -1, -1));

        jButton1.setText("Fill the form");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 130, -1));

        jLabel2.setText("Please Fill the forms to help the Graduate Students");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 340, -1));

        chatBtn.setText("Chat");
        chatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatBtnActionPerformed(evt);
            }
        });
        add(chatBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AlumniFirstTimerJPanel alumnifirstJPanel = new AlumniFirstTimerJPanel(userProcessContainer,enterprise, organization);
        userProcessContainer.add("AlumniFirstTimerJPanel", alumnifirstJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void chatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatBtnActionPerformed
        // TODO add your handling code here:
        System.out.println("12232343");
        //chat_server cs= new chat_server();
        userinterface.Newbie.test1 t = new userinterface.Newbie.test1();
        String [] args = {};
        //t.main(args);
        
        System.out.println("ddddd");
        
        
        t.setVisible(true);
    }//GEN-LAST:event_chatBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chatBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
