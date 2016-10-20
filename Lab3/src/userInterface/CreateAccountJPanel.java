/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import business.Account;
import business.AccountDirectory;
import business.Validation;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Parth
 */
public class CreateAccountJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private AccountDirectory accountDirectory;

    public CreateAccountJPanel(JPanel userProcessContainer, AccountDirectory accountDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.accountDirectory = accountDirectory;

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAccountNumber = new javax.swing.JTextField();
        txtRoutingNumber = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        txtBankName = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Routing Number");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 109, 140, 42));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Create Account");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 45, 260, 42));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Balance");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 347, 140, 42));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Account number");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 187, 140, 42));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Bank Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 270, 140, 42));
        add(txtAccountNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 194, 132, 28));

        txtRoutingNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoutingNumberActionPerformed(evt);
            }
        });
        add(txtRoutingNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 109, 132, 28));
        add(txtBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 347, 132, 28));
        add(txtBankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 270, 132, 28));

        btnCreate.setBackground(new java.awt.Color(0, 0, 0));
        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create Account!");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 422, 153, 34));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 422, 131, 34));
    }// </editor-fold>//GEN-END:initComponents

    private void txtRoutingNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoutingNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoutingNumberActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed

        Validation v=new Validation();
        String routingNumber = txtRoutingNumber.getText();
        String accountNumber = txtAccountNumber.getText();
        String bankName = txtBankName.getText();
        

        
        
        
        
        String blank = "";
        if (routingNumber.equals(blank) || accountNumber.equals(blank) || bankName.equals(blank) || txtBalance.equals(blank)) {
            JOptionPane.showMessageDialog(null, "Any field can not be empty");
        } 
        
        else if(!v.numberWithSizeCheck(accountNumber, 5))
        {
            
             JOptionPane.showMessageDialog(null, "Account number can not be left blank or not be a 5 digit number");
             txtAccountNumber.setBackground(Color.yellow);
        }
        
        else if(!v.alphabetCheck(bankName))
        {
            
             JOptionPane.showMessageDialog(null, "Name of bank can only be alphabets");
             txtBankName.setBackground(Color.yellow);
        }
        
        else if(!v.numberCheck(txtBalance.getText()))
        {
            

         JOptionPane.showMessageDialog(null, "Balance can only be a number");
             txtBalance.setBackground(Color.yellow);
            
        }
        
        
        else
        
        {
                    int balance = Integer.parseInt(txtBalance.getText());
            Account account = accountDirectory.addAccount();
            account.setRoutingNumber(routingNumber);
            account.setAccountNumber(accountNumber);
            account.setBankName(bankName);
            account.setBalance(balance);
            txtAccountNumber.setText("");
            txtBalance.setText("");
            txtBankName.setText("");
            txtRoutingNumber.setText("");
            JOptionPane.showMessageDialog(null, "Account with account number: " + accountNumber + " successfully created");

        }

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtBankName;
    private javax.swing.JTextField txtRoutingNumber;
    // End of variables declaration//GEN-END:variables
}