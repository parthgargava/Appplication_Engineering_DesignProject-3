/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.VitalSignHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;

/**
 *
 * @author Parth
 */
public class CreateVitalJPanel extends javax.swing.JPanel {

    private VitalSignHistory vsh;

    CreateVitalJPanel(VitalSignHistory vsh) {
        initComponents();
        this.vsh = vsh;
    }
/////validation check for integer
public static boolean isNumeric (String string) //throws IllegalArgumentException
{
boolean isnumeric=true;
char chars[]=string.toCharArray();
for(int i=0;i<chars.length;i++)
{
	isnumeric = Character.isDigit(chars[i]);
	if(!isnumeric)
	break;

	}


return isnumeric;

	}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTemp = new javax.swing.JLabel();
        lblTemp1 = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        lblTemp2 = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        lblTemp3 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        lblTemp4 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtTemperature = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTemp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTemp.setText(" CREATE VITAL SIGNS");
        lblTemp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0), 3));
        add(lblTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 210, 60));

        lblTemp1.setText("Blood Pressure");
        add(lblTemp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));
        add(txtBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 120, 30));

        lblTemp2.setText("Pulse");
        add(lblTemp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));
        add(txtPulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 120, 30));

        lblTemp3.setText("Date");
        add(lblTemp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));
        add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 120, 30));

        lblTemp4.setText("Temperature");
        add(lblTemp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 102, -1, -1));

        btnSave.setBackground(new java.awt.Color(0, 204, 0));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 120, 40));
        add(txtTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        boolean checktemp = CreateVitalJPanel.isNumeric(txtTemperature.getText());
        if (txtTemperature.getText().isEmpty() || txtBloodPressure.getText().isEmpty() || txtDate.getText().isEmpty() || txtPulse.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please fill all fields!");
        }

        ///validate

        else    if(checktemp==false)
        {
            JOptionPane.showMessageDialog(null, "Temperature can only be a number");
        }

        else{
            double temperature = Double.parseDouble(txtTemperature.getText());

            double bp = Double.parseDouble(txtBloodPressure.getText());
            int pulse = Integer.parseInt(txtPulse.getText());
            String date = txtDate.getText();

            VitalSigns v = vsh.addVitals();
            v.setBloodPressure(bp);
            v.setTemperature(temperature);
            v.setPulse(pulse);
            v.setDate(date);

            JOptionPane.showMessageDialog(null, "Vital Signs added successfully");
            txtBloodPressure.setText("");
            txtDate.setText("");
            txtPulse.setText("");
            txtDate.setText("");
            txtTemperature.setText("");

    }//GEN-LAST:event_btnSaveActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblTemp;
    private javax.swing.JLabel lblTemp1;
    private javax.swing.JLabel lblTemp2;
    private javax.swing.JLabel lblTemp3;
    private javax.swing.JLabel lblTemp4;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}
