/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.VitalSignHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Parth
 */
public class ViewVitalsJPanel extends javax.swing.JPanel {

    private VitalSignHistory vsh;

    public ViewVitalsJPanel(VitalSignHistory vsh) {
        initComponents();
        this.vsh = vsh;
        populateTable();
    }

    public void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) tblVitalSigns.getModel();
        dtm.setRowCount(0); //no rows on table

        //standard for all tables
        for (VitalSigns vs : vsh.getVitalSignHistory()) {
            Object row[] = new Object[2];
            row[0] = vs;
            row[1] = vs.getBloodPressure();
            dtm.addRow(row);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVitalSigns = new javax.swing.JTable();
        btnViewDetails = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtTemperature = new javax.swing.JTextField();
        lblTemp1 = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        lblTemp2 = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        lblTemp3 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        lblTemp4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText(" View Vital Signs");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0), 3));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 170, 50));

        tblVitalSigns.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblVitalSigns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Blood Pressure"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVitalSigns);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, 150));

        btnViewDetails.setBackground(new java.awt.Color(0, 153, 0));
        btnViewDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnViewDetails.setText("VIEW DETAILS");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });
        add(btnViewDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 140, 40));

        btnDelete.setBackground(new java.awt.Color(0, 153, 0));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 130, 40));

        txtTemperature.setBackground(new java.awt.Color(153, 255, 255));
        txtTemperature.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTemperature.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTemperature.setEnabled(false);
        add(txtTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 120, 30));

        lblTemp1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTemp1.setText("Blood Pressure");
        add(lblTemp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        txtBloodPressure.setBackground(new java.awt.Color(153, 255, 255));
        txtBloodPressure.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBloodPressure.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBloodPressure.setEnabled(false);
        add(txtBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 120, 30));

        lblTemp2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTemp2.setText("Pulse");
        add(lblTemp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        txtPulse.setBackground(new java.awt.Color(153, 255, 255));
        txtPulse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPulse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPulse.setEnabled(false);
        add(txtPulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 120, 30));

        lblTemp3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTemp3.setText("Date");
        add(lblTemp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, -1, -1));

        txtDate.setBackground(new java.awt.Color(153, 255, 255));
        txtDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDate.setEnabled(false);
        add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 120, 30));

        lblTemp4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTemp4.setText("Temperature");
        add(lblTemp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed

        int selectedRow = tblVitalSigns.getSelectedRow();
        if (selectedRow >= 0) {
            VitalSigns vs = (VitalSigns) tblVitalSigns.getValueAt(selectedRow, 0); //HOW? Doubt
            txtBloodPressure.setText(String.valueOf(vs.getBloodPressure()));
            txtTemperature.setText(String.valueOf(vs.getTemperature()));
            txtPulse.setText(String.valueOf(vs.getPulse()));
            txtDate.setText(vs.getDate()); //how just VS

        } else {
            JOptionPane.showMessageDialog(null, "Please select any row!");
        }

    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int selectedRow = tblVitalSigns.getSelectedRow();
        if (selectedRow >= 0) {
            VitalSigns vs = (VitalSigns) tblVitalSigns.getValueAt(selectedRow, 0);
            vsh.deleteVitals(vs);
//            JOptionPane.showMessageDialog(null, "Vital Sign deleted!");

            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?");
            if (dialogResult == JOptionPane.YES_OPTION) {
                vsh.deleteVitals(vs);
                populateTable();
            } else {
                JOptionPane.showMessageDialog(null, "Thank you for not deleting Vital Signs data!");
            }
            populateTable();

        } else {
            JOptionPane.showMessageDialog(null, "Please select any row!");
        }


    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTemp1;
    private javax.swing.JLabel lblTemp2;
    private javax.swing.JLabel lblTemp3;
    private javax.swing.JLabel lblTemp4;
    private javax.swing.JTable tblVitalSigns;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}
