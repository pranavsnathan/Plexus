/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AmbassadorRole;

import Business.EcoSystem;
import Business.Organization.AmbassadorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.RequestParser;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.Dean.ManageAmbassadorJPanel;
import Business.Enterprise.Enterprise;
import Business.Organization.DeanOrganization;
/**
 *
 * @author raunak
 */
public class AmbassadorReqWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private AmbassadorOrganization labOrganization;
    private Enterprise enterprise;
    private Organization org;
    private RequestParser req;
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public AmbassadorReqWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.org = organization;
        this.enterprise=enterprise;
        
        populateTable();
        //populateReqTbl();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTbl.getModel();
        
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
    /*public void populateReqTbl(){
        
        DefaultTableModel model = (DefaultTableModel)otherReqTbl.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : org.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            
            model.addRow(row);
        }
        
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTbl = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        requestDeanBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(workRequestJTbl);
        if (workRequestJTbl.getColumnModel().getColumnCount() > 0) {
            workRequestJTbl.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTbl.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTbl.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTbl.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 630, 96));

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
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        requestDeanBtn.setText("Send Request to Dean");
        requestDeanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestDeanBtnActionPerformed(evt);
            }
        });
        add(requestDeanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTbl.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        WorkRequest request = (WorkRequest)workRequestJTbl.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable();
        
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        
        int selectedRow = workRequestJTbl.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        LabTestWorkRequest request = (LabTestWorkRequest)workRequestJTbl.getValueAt(selectedRow, 0);
     
        request.setStatus("Processing");
        
        AmbassadorProcessWorkRequestJPanel processWorkRequestJPanel = new AmbassadorProcessWorkRequestJPanel(userProcessContainer, request);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void requestDeanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestDeanBtnActionPerformed
        // TODO add your handling code here:
         int selectedRow = workRequestJTbl.getSelectedRow();
         if (selectedRow < 0){
            return;
        }
        
        LabTestWorkRequest request = (LabTestWorkRequest)workRequestJTbl.getValueAt(selectedRow, 0);
        request.getMessage();
        System.out.println(request.getMessage());
        org.getWorkQueue().getWorkRequestList().add(request);
        userAccount.getWorkQueue().getWorkRequestList().add(request);
        
        
        
        
    }//GEN-LAST:event_requestDeanBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton requestDeanBtn;
    private javax.swing.JTable workRequestJTbl;
    // End of variables declaration//GEN-END:variables
}
