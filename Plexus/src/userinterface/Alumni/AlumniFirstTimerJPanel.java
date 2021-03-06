/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Alumni;

import Business.Enterprise.Enterprise;
import javax.swing.JPanel;
import Business.Employee.Employee;
import Business.Newbie.Newbie;
import Business.Newbie.NewbieDetailsDirectory;
import Business.Alumni.Alumni;
import Business.Alumni.AlumniDirectory;
import Business.Organization.Organization;
import Business.Organization.AlumniOrganization;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author chels
 */
public class AlumniFirstTimerJPanel extends javax.swing.JPanel {
    private JPanel userprocesscontainer;
    private AlumniDirectory alumniDirectory;
    private Enterprise enterprise;
    //private AlumniOrganization organization;
    private Organization org;

    /**
     * Creates new form AlumniFirstTimerJPanel
     */
   
    public AlumniFirstTimerJPanel(JPanel userProcessContainer, Enterprise enterprise,Organization oorganization) {
        initComponents();
        this.userprocesscontainer = userprocesscontainer;
        this.org=oorganization;
        //this.newbieDetailsDirectory = enterprise.getNds;
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

        newbieSignUpBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fnameText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lnameText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        yopText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        techText = new javax.swing.JTextField();
        AlumniSignUpBtn1 = new javax.swing.JButton();
        backBtn1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        companyText1 = new javax.swing.JTextField();
        EmployedCB = new javax.swing.JComboBox<>();

        newbieSignUpBtn.setText("Submit");
        newbieSignUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newbieSignUpBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Alumni First Timer");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 11, -1, -1));

        jLabel9.setText("FirstName:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 80, -1, -1));
        add(fnameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 77, 72, -1));

        jLabel3.setText("LastName:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 116, -1, -1));
        add(lnameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 116, 70, -1));

        jLabel4.setText("Year Of Passing:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 156, -1, -1));
        add(yopText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 153, 70, -1));

        jLabel5.setText("Employment Status:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 194, -1, -1));

        jLabel6.setText("Company Name:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 232, -1, -1));
        add(techText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 267, 70, -1));

        AlumniSignUpBtn1.setText("Submit");
        AlumniSignUpBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumniSignUpBtn1ActionPerformed(evt);
            }
        });
        add(AlumniSignUpBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 354, -1, -1));

        backBtn1.setText("Back");
        backBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn1ActionPerformed(evt);
            }
        });
        add(backBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 354, -1, -1));

        jLabel7.setText("Technology Used:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 270, -1, -1));
        add(companyText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 229, 70, -1));

        EmployedCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employed", "Unemployed" }));
        add(EmployedCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 90, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void newbieSignUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newbieSignUpBtnActionPerformed
        
    }//GEN-LAST:event_newbieSignUpBtnActionPerformed

    private void AlumniSignUpBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumniSignUpBtn1ActionPerformed
        // TODO add your handling code here:
        String fname=fnameText.getText();
        String lname=lnameText.getText();
        String year=yopText.getText();
        String employ=(String)EmployedCB.getSelectedItem();
        String company=companyText1.getText();
        String tech=techText.getText();
         if(fnameText.getText().isEmpty() || lnameText.getText().isEmpty() || yopText.getText().isEmpty()|| companyText1.getText().isEmpty() || techText.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please fill all the fields");
            
            
        }
        
        else if(!fname.matches("[a-z,A-Z,]+") || !lname.matches("[a-z,A-Z,]+") || !year.matches("[0-9]+") || !company.matches("[a-z,A-Z,]+") || !tech.matches("[a-z,A-Z,]+"))
        {
           JOptionPane.showMessageDialog(null,"Please enter characters for names fields"); 
        }
        
       
       else
        {
            
         JOptionPane.showMessageDialog(null,"Successfully Submitted");
        Alumni al=org.getAl().createAlumini();
        al.setFirstName(fname);
        al.setLastName(lname);
        al.setYearOfPassing(year);
        al.setEmployed(employ);
        al.setCompanyame(company);
        al.setTechnologyUsed(tech);
        System.out.println(al.getFirstName());
        AlumniSignUpBtn1.setEnabled(false);
        }
       
    }//GEN-LAST:event_AlumniSignUpBtn1ActionPerformed

    private void backBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlumniSignUpBtn1;
    private javax.swing.JComboBox<String> EmployedCB;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton backBtn1;
    private javax.swing.JTextField companyText1;
    private javax.swing.JTextField fnameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lnameText;
    private javax.swing.JButton newbieSignUpBtn;
    private javax.swing.JTextField techText;
    private javax.swing.JTextField yopText;
    // End of variables declaration//GEN-END:variables
}
