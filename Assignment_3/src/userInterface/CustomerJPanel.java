/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import business.Product;
import business.ProductCatalog;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Parth
 */
public class CustomerJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private ProductCatalog productCatalog;

    
    public CustomerJPanel(JPanel userProcessContainer, ProductCatalog productCatalog) {
            initComponents();
               this.userProcessContainer=userProcessContainer;
   this.productCatalog=productCatalog;
populateTable();
    
    }

        private void populateTable()
    {
        
        DefaultTableModel dtm=(DefaultTableModel)tableVendor.getModel();
        dtm.setRowCount(0);

//        productCatalog.
        for(Product product:productCatalog.getProductList())
        
      
        {
        Object[] row= new Object[4];
        row[0]=product;
        row[1]=product.getModelNumber();
        row[2]=product.getProductType();
        row[3]=product.getPrice();
        dtm.addRow(row);
        
        }
        
        
    }
    
    

    private void populateTableComputer()
    {
        
        DefaultTableModel dtm=(DefaultTableModel)tableVendor.getModel();
        dtm.setRowCount(0);
        //for(Product product:productCatalog.getProductList())
      ArrayList<Product> s=productCatalog.getProductList();
      
        for(int i=0;i<s.size();i++)
        
        {
            if(s.get(i).getProductType().equals("COMPUTER"))
            {
        Object[] row= new Object[4];
        row[0]=s.get(i);
        row[1]=s.get(i).getModelNumber();
        row[2]=s.get(i).getProductType();
        row[3]=s.get(i).getPrice();
        dtm.addRow(row);
            }
        }
        
        
    }
    
    
    
    private void populateTablePrinter()
    {
        
        DefaultTableModel dtm=(DefaultTableModel)tableVendor.getModel();
        dtm.setRowCount(0);
        //for(Product product:productCatalog.getProductList())
      ArrayList<Product> s=productCatalog.getProductList();
      
        for(int i=0;i<s.size();i++)
        
        {
            if(s.get(i).getProductType().equals("PRINTER"))
            {
        Object[] row= new Object[4];
        row[0]=s.get(i);
        row[1]=s.get(i).getModelNumber();
        row[2]=s.get(i).getProductType();
        row[3]=s.get(i).getPrice();
        dtm.addRow(row);
            }
        }
        
        
    }
    
    
    
    private void populateTableHardware()
    {
        
        DefaultTableModel dtm=(DefaultTableModel)tableVendor.getModel();
        dtm.setRowCount(0);
        //for(Product product:productCatalog.getProductList())
      ArrayList<Product> s=productCatalog.getProductList();
      
        for(int i=0;i<s.size();i++)
        
        {
            if(s.get(i).getProductType().equals("HARDWARE"))
            {
        Object[] row= new Object[4];
        row[0]=s.get(i);
        row[1]=s.get(i).getModelNumber();
        row[2]=s.get(i).getProductType();
        row[3]=s.get(i).getPrice();
        dtm.addRow(row);
            }
        }
        
        
    }
    
    
    
    private void populateTableSoftware()
    {
        
        DefaultTableModel dtm=(DefaultTableModel)tableVendor.getModel();
        dtm.setRowCount(0);
        //for(Product product:productCatalog.getProductList())
      ArrayList<Product> s=productCatalog.getProductList();
      
        for(int i=0;i<s.size();i++)
        
        {
            if(s.get(i).getProductType().equals("SOFTWARE"))
            {
        Object[] row= new Object[4];
        row[0]=s.get(i);
        row[1]=s.get(i).getModelNumber();
        row[2]=s.get(i).getProductType();
        row[3]=s.get(i).getPrice();
        dtm.addRow(row);
            }
        }
        
        
    }
    
private void populateTableApple()
    {
        
        DefaultTableModel dtm=(DefaultTableModel)tableVendor.getModel();
        dtm.setRowCount(0);
        //for(Product product:productCatalog.getProductList())
      ArrayList<Product> s=productCatalog.getProductList();
      
        for(int i=0;i<s.size();i++)
        
        {
            if(s.get(i).getVendorName().equals("Apple"))
            {
        Object[] row= new Object[4];
        row[0]=s.get(i);
        row[1]=s.get(i).getModelNumber();
        row[2]=s.get(i).getProductType();
        row[3]=s.get(i).getPrice();
        dtm.addRow(row);
            }
        }
        
        
    }


private void populateTableDell()
    {
        
        DefaultTableModel dtm=(DefaultTableModel)tableVendor.getModel();
        dtm.setRowCount(0);
        //for(Product product:productCatalog.getProductList())
      ArrayList<Product> s=productCatalog.getProductList();
      
        for(int i=0;i<s.size();i++)
        
        {
            if(s.get(i).getVendorName().equals("Dell"))
            {
        Object[] row= new Object[4];
        row[0]=s.get(i);
        row[1]=s.get(i).getModelNumber();
        row[2]=s.get(i).getProductType();
        row[3]=s.get(i).getPrice();
        dtm.addRow(row);
            }
        }
        
        
    }


private void populateTableLenovo()
    {
        
        DefaultTableModel dtm=(DefaultTableModel)tableVendor.getModel();
        dtm.setRowCount(0);
        //for(Product product:productCatalog.getProductList())
      ArrayList<Product> s=productCatalog.getProductList();
      
        for(int i=0;i<s.size();i++)
        
        {
            if(s.get(i).getVendorName().equals("Lenovo"))
            {
        Object[] row= new Object[4];
        row[0]=s.get(i);
        row[1]=s.get(i).getModelNumber();
        row[2]=s.get(i).getProductType();
        row[3]=s.get(i).getPrice();
        dtm.addRow(row);
            }
        }
        
        
    }

private void populateTableHp()
    {
        
        DefaultTableModel dtm=(DefaultTableModel)tableVendor.getModel();
        dtm.setRowCount(0);
        //for(Product product:productCatalog.getProductList())
      ArrayList<Product> s=productCatalog.getProductList();
      
        for(int i=0;i<s.size();i++)
        
        {
            if(s.get(i).getVendorName().equals("Hewlett Packard"))
            {
        Object[] row= new Object[4];
        row[0]=s.get(i);
        row[1]=s.get(i).getModelNumber();
        row[2]=s.get(i).getProductType();
        row[3]=s.get(i).getPrice();
        dtm.addRow(row);
            }
        }
        
        
    }

private void populateTableName()
    {
        
        DefaultTableModel dtm=(DefaultTableModel)tableVendor.getModel();
        dtm.setRowCount(0);
        //for(Product product:productCatalog.getProductList())
      ArrayList<Product> s=productCatalog.getProductList();
      
        for(int i=0;i<s.size();i++)
        
        {
            if(s.get(i).getProductType().equals(nameSearchTextField.getText()))
            {
        Object[] row= new Object[4];
        row[0]=s.get(i);
        row[1]=s.get(i).getModelNumber();
        row[2]=s.get(i).getProductType();
        row[3]=s.get(i).getPrice();
        dtm.addRow(row);
            }
        }
        
        
    }

private void populateTableDesc()
    {
        
        DefaultTableModel dtm=(DefaultTableModel)tableVendor.getModel();
        dtm.setRowCount(0);
        //for(Product product:productCatalog.getProductList())
      ArrayList<Product> s=productCatalog.getProductList();
      
        for(int i=0;i<s.size();i++)
        
        {
            if(s.get(i).getProductType().equals(descSearchTextField.getText()))
            {
        Object[] row= new Object[4];
        row[0]=s.get(i);
        row[1]=s.get(i).getModelNumber();
        row[2]=s.get(i).getProductType();
        row[3]=s.get(i).getPrice();
        dtm.addRow(row);
            }
        }
        
        
    }

private void populateTableChoice()
    {
        
        DefaultTableModel dtm=(DefaultTableModel)tableVendor.getModel();
        dtm.setRowCount(0);
        //for(Product product:productCatalog.getProductList())
      ArrayList<Product> s=productCatalog.getProductList();
      
        for(int i=0;i<s.size();i++)
        
        {
            if(s.get(i).getProductType().equalsIgnoreCase(nameSearchTextField.getText())||s.get(i).getDescription().equalsIgnoreCase(descSearchTextField.getText())||s.get(i).getVendorName().equalsIgnoreCase(vendorSearchTextField.getText()))
            {
        Object[] row= new Object[4];
        row[0]=s.get(i);
        row[1]=s.get(i).getModelNumber();
        row[2]=s.get(i).getProductType();
        row[3]=s.get(i).getPrice();
        dtm.addRow(row);
            }
        }
        
        
    }
String blank="";
private void customPopulateTable()
    {
        
        String inputname=nameSearchTextField.getText();
        String inputvendor=vendorSearchTextField.getText();
        String inputdesc= descSearchTextField.getText();
        
        DefaultTableModel dtm=(DefaultTableModel)tableVendor.getModel();
        dtm.setRowCount(0);
        //for(Product product:productCatalog.getProductList())
      ArrayList<Product> s=productCatalog.getProductList();
      
        for(int i=0;i<s.size();i++)
        
        {
if(s.get(i).getProductName().equalsIgnoreCase(nameSearchTextField.getText())||s.get(i).getDescription().equalsIgnoreCase(descSearchTextField.getText())||s.get(i).getVendorName().equalsIgnoreCase(vendorSearchTextField.getText()))
            {
        Object[] row= new Object[4];
        row[0]=s.get(i);
        row[1]=s.get(i).getModelNumber();
        row[2]=s.get(i).getProductType();
        row[3]=s.get(i).getPrice();
        dtm.addRow(row);
            }
           
            
            
            
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        computerButton = new javax.swing.JButton();
        PrinterButton = new javax.swing.JButton();
        hardwareButton = new javax.swing.JButton();
        softwareButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVendor = new javax.swing.JTable();
        buttonAll = new javax.swing.JButton();
        viewCustomerButton = new javax.swing.JButton();
        back6Button = new javax.swing.JButton();
        appleRadio = new javax.swing.JRadioButton();
        lenovoRadio = new javax.swing.JRadioButton();
        hpRadio = new javax.swing.JRadioButton();
        dellRadio = new javax.swing.JRadioButton();
        searchButton = new javax.swing.JButton();
        nameSearchTextField = new javax.swing.JTextField();
        descSearchTextField = new javax.swing.JTextField();
        vendorSearchTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));

        computerButton.setBackground(new java.awt.Color(0, 0, 0));
        computerButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        computerButton.setForeground(new java.awt.Color(255, 255, 255));
        computerButton.setText("Computer");
        computerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computerButtonActionPerformed(evt);
            }
        });

        PrinterButton.setBackground(new java.awt.Color(0, 0, 0));
        PrinterButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PrinterButton.setForeground(new java.awt.Color(255, 255, 255));
        PrinterButton.setText("Printer");
        PrinterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrinterButtonActionPerformed(evt);
            }
        });

        hardwareButton.setBackground(new java.awt.Color(0, 0, 0));
        hardwareButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hardwareButton.setForeground(new java.awt.Color(255, 255, 255));
        hardwareButton.setText("Hardware");
        hardwareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardwareButtonActionPerformed(evt);
            }
        });

        softwareButton.setBackground(new java.awt.Color(0, 0, 0));
        softwareButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        softwareButton.setForeground(new java.awt.Color(255, 255, 255));
        softwareButton.setText("Software");
        softwareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                softwareButtonActionPerformed(evt);
            }
        });

        tableVendor.setBackground(new java.awt.Color(255, 255, 102));
        tableVendor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Model", "Type", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableVendor);

        buttonAll.setBackground(new java.awt.Color(0, 0, 0));
        buttonAll.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonAll.setForeground(new java.awt.Color(255, 255, 255));
        buttonAll.setText("All");
        buttonAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAllActionPerformed(evt);
            }
        });

        viewCustomerButton.setBackground(new java.awt.Color(0, 0, 0));
        viewCustomerButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        viewCustomerButton.setForeground(new java.awt.Color(255, 255, 255));
        viewCustomerButton.setText("view");
        viewCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomerButtonActionPerformed(evt);
            }
        });

        back6Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back6Button.setText("<<Back");
        back6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back6ButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(appleRadio);
        appleRadio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        appleRadio.setText("Apple");
        appleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appleRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(lenovoRadio);
        lenovoRadio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lenovoRadio.setText("Lenovo");
        lenovoRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lenovoRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(hpRadio);
        hpRadio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hpRadio.setText("HP");
        hpRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hpRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(dellRadio);
        dellRadio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dellRadio.setText("Dell");
        dellRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dellRadioActionPerformed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(0, 0, 0));
        searchButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Vendor");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("description");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PrinterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(computerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(appleRadio)
                            .addComponent(lenovoRadio)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hardwareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(softwareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonAll, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dellRadio)
                    .addComponent(back6Button)
                    .addComponent(hpRadio))
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(nameSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(vendorSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(descSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1)
                        .addGap(129, 129, 129)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(back6Button)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(viewCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(computerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(PrinterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(appleRadio)
                                            .addComponent(dellRadio))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lenovoRadio)
                                            .addComponent(hpRadio))))
                                .addGap(0, 26, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hardwareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(softwareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(buttonAll, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vendorSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(89, 89, 89))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void hardwareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardwareButtonActionPerformed
populateTableHardware();
        buttonGroup1.clearSelection();
// TODO add your handling code here:
    }//GEN-LAST:event_hardwareButtonActionPerformed

    private void computerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computerButtonActionPerformed

populateTableComputer();
buttonGroup1.clearSelection();
        // TODO add your handling code here:
    }//GEN-LAST:event_computerButtonActionPerformed

    private void PrinterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrinterButtonActionPerformed
populateTablePrinter();
buttonGroup1.clearSelection();
        // TODO add your handling code here:
    }//GEN-LAST:event_PrinterButtonActionPerformed

    private void softwareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_softwareButtonActionPerformed
populateTableSoftware();
buttonGroup1.clearSelection();
        // TODO add your handling code here:
    }//GEN-LAST:event_softwareButtonActionPerformed

    private void buttonAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAllActionPerformed
populateTable();
buttonGroup1.clearSelection();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAllActionPerformed

    private void viewCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustomerButtonActionPerformed

       int selectedRow = tableVendor.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table to view details!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            Product product=(Product)tableVendor.getValueAt(selectedRow, 0);

            ViewProductJPanel panel = new ViewProductJPanel(userProcessContainer, product);
            userProcessContainer.add("ViewProductJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_viewCustomerButtonActionPerformed

    private void back6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back6ButtonActionPerformed


userProcessContainer.remove(this);
CardLayout layout= (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

        // TODO add your handling code here:
    }//GEN-LAST:event_back6ButtonActionPerformed

    private void appleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appleRadioActionPerformed
populateTableApple();


        // TODO add your handling code here:
    }//GEN-LAST:event_appleRadioActionPerformed

    private void dellRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dellRadioActionPerformed
populateTableDell();
        // TODO add your handling code here:
    }//GEN-LAST:event_dellRadioActionPerformed

    private void lenovoRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lenovoRadioActionPerformed
populateTableLenovo();
        // TODO add your handling code here:
    }//GEN-LAST:event_lenovoRadioActionPerformed

    private void hpRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hpRadioActionPerformed

populateTableHp();
        // TODO add your handling code here:
    }//GEN-LAST:event_hpRadioActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        
        ArrayList<Product> comcolarr=new ArrayList<>();
        comcolarr=productCatalog.searchProduct(nameSearchTextField.getText(), vendorSearchTextField.getText(),descSearchTextField.getText());
        if(comcolarr==null)
        {
        JOptionPane.showMessageDialog(null, "No product found with these filters");
        }
        else
        {
        DefaultTableModel dtm=(DefaultTableModel)tableVendor.getModel();
        dtm.setRowCount(0);

//        productCatalog.
        for(Product product:comcolarr)
        
      
        {
        Object[] row= new Object[4];
        row[0]=product;
        row[1]=product.getModelNumber();
        row[2]=product.getProductType();
        row[3]=product.getPrice();
        dtm.addRow(row);
        
        }
        
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PrinterButton;
    private javax.swing.JRadioButton appleRadio;
    private javax.swing.JButton back6Button;
    private javax.swing.JButton buttonAll;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton computerButton;
    private javax.swing.JRadioButton dellRadio;
    private javax.swing.JTextField descSearchTextField;
    private javax.swing.JButton hardwareButton;
    private javax.swing.JRadioButton hpRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton lenovoRadio;
    private javax.swing.JTextField nameSearchTextField;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton softwareButton;
    private javax.swing.JTable tableVendor;
    private javax.swing.JTextField vendorSearchTextField;
    private javax.swing.JButton viewCustomerButton;
    // End of variables declaration//GEN-END:variables
}
