/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdvisorRole;

import Business.EcoSystem;
import Business.Organization.AdvisorOrganization;
import Business.Organization.AmbassadorOrganization;
import Business.Organization.DeanOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.AmbassadorRole.AmbassadorProcessWorkRequestJPanel;
import Business.Enterprise.Enterprise;

/**
 *
 * @author Hi
 */
public class WorkRequestJPanel extends javax.swing.JPanel {
    
    
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private AdvisorOrganization labOrganization;
     private Enterprise enterprise;
     private Organization org;

    /**
     * Creates new form WorkRequestJPanel
     */
    public WorkRequestJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business, Enterprise enterprise) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        //this.labOrganization = (AdvisorOrganization)organization;
        this.org=organization;
        this.enterprise=enterprise;
        
        populateTable();
    }
 public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
       
        
        for(WorkRequest request : org.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        reqDeanBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 58, 630, 96));

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 215, -1, -1));

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 215, -1, -1));

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 26, -1, -1));

        reqDeanBtn.setText("Send Request to Dean");
        reqDeanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqDeanBtnActionPerformed(evt);
            }
        });
        add(reqDeanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable();

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        LabTestWorkRequest request = (LabTestWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);

        request.setStatus("Processing");

        AdvisorProcessworkRequestJPanel processWorkRequestJPanel = new AdvisorProcessworkRequestJPanel(userProcessContainer, request);
        userProcessContainer.add("AdvisorProcessworkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void reqDeanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqDeanBtnActionPerformed
        // TODO add your handling code here:
         int selectedRow = workRequestJTable.getSelectedRow();
         if (selectedRow < 0){
            return;
        }
        
        LabTestWorkRequest request = (LabTestWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.getMessage();
        System.out.println(request.getMessage());
        org.getWorkQueue().getWorkRequestList().add(request);
        userAccount.getWorkQueue().getWorkRequestList().add(request);
        
        
    }//GEN-LAST:event_reqDeanBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton reqDeanBtn;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
