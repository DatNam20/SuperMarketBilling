/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Deepali
 */
public class BillingWindow extends javax.swing.JFrame {

    /**
     * Creates new form BillingWindow
     */
    public BillingWindow() {
        initComponents();
        refreshTable();
        refreshCategoryBox();
    }

    Connection con = null;
    Statement stmt = null;
    ResultSet rset = null;
    
    Double productPrice = 0.0;
    Double totalPrice = 0.0;
    Double totalAmount = 0.0;
    
    int itemCount = 0;
    int availableQuantity = 0;
    int remainingQuantity = 0;
    
    String BILL_HEADING = "    ~~~~~~~~~~~~ NEAR-BZ SUPERMARKET ~~~~~~~~~~~~\n\n NO.            NAME\tQTY\tPRC\tTTL\n ---------------------------------------------------------------------- \n";
    
    public void refreshTable()
    {
        try
        {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketDatabase", "Deepali", "password");
            stmt = con.createStatement();
            rset = stmt.executeQuery("SELECT * from Deepali.PRODUCTSTABLE");
            
            productsTable.setModel(DbUtils.resultSetToTableModel(rset));
        }

        catch(Exception e) { e.printStackTrace(); }
    }
    
    public void refreshCategoryBox()
    {
        try
        {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketDatabase", "Deepali", "password");
            stmt = con.createStatement();
            
            String query = "SELECT * from Deepali.CATEGORYTABLE";
            rset = stmt.executeQuery(query);
            
            while(rset.next())
            {
                String thisCategory = rset.getString("CNAME");
                categoryComboBox.addItem(thisCategory);
            }
        }

        catch(Exception e) { e.printStackTrace(); }
    }
    
    public void updateTable()
    {
        try
        {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketDatabase", "Deepali", "password");
            Statement add = con.createStatement();

            String query = "UPDATE Deepali.PRODUCTSTABLE set QUANTITY = " + remainingQuantity + " where PNAME = '" + productNameTextField.getText() + "'";

            add.executeUpdate(query);
            refreshTable();
        }

        catch(Exception e) { e.printStackTrace(); }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        productNameLabel = new javax.swing.JLabel();
        productNameTextField = new javax.swing.JTextField();
        quantityLabel = new javax.swing.JLabel();
        quantityTextField = new javax.swing.JTextField();
        categoryComboBox = new javax.swing.JComboBox<>();
        filterLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        filterButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        tableContainerPane = new javax.swing.JScrollPane();
        productsTable = new javax.swing.JTable();
        productsTableHeadingLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        billTextArea = new javax.swing.JTextArea();
        finalTotalLabel = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        exitLabel = new javax.swing.JLabel();
        windowHeadingLabel1 = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        productNameLabel.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        productNameLabel.setForeground(new java.awt.Color(0, 153, 153));
        productNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productNameLabel.setText("Name");

        productNameTextField.setFont(new java.awt.Font("Gill Sans MT", 0, 16)); // NOI18N
        productNameTextField.setForeground(new java.awt.Color(0, 102, 102));
        productNameTextField.setBorder(null);
        productNameTextField.setMinimumSize(new java.awt.Dimension(2, 19));

        quantityLabel.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        quantityLabel.setForeground(new java.awt.Color(0, 153, 153));
        quantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantityLabel.setText("Quantity");

        quantityTextField.setFont(new java.awt.Font("Gill Sans MT", 0, 16)); // NOI18N
        quantityTextField.setForeground(new java.awt.Color(0, 102, 102));
        quantityTextField.setBorder(null);
        quantityTextField.setMinimumSize(new java.awt.Dimension(2, 19));

        categoryComboBox.setFont(new java.awt.Font("Gill Sans MT", 0, 16)); // NOI18N
        categoryComboBox.setForeground(new java.awt.Color(0, 102, 102));
        categoryComboBox.setBorder(null);

        filterLabel.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        filterLabel.setForeground(new java.awt.Color(0, 153, 153));
        filterLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        filterLabel.setText("Filter By");

        addButton.setBackground(new java.awt.Color(255, 255, 255));
        addButton.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(0, 153, 153));
        addButton.setText("ADD TO BILL");
        addButton.setBorder(null);
        addButton.setBorderPainted(false);
        addButton.setFocusPainted(false);
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(255, 255, 255));
        editButton.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        editButton.setForeground(new java.awt.Color(0, 153, 153));
        editButton.setText("PRINT BILL");
        editButton.setBorder(null);
        editButton.setBorderPainted(false);
        editButton.setFocusPainted(false);
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonMouseClicked(evt);
            }
        });

        filterButton.setBackground(new java.awt.Color(255, 255, 255));
        filterButton.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        filterButton.setForeground(new java.awt.Color(0, 153, 153));
        filterButton.setText("FILTER");
        filterButton.setBorder(null);
        filterButton.setBorderPainted(false);
        filterButton.setFocusPainted(false);
        filterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filterButtonMouseClicked(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(255, 255, 255));
        clearButton.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        clearButton.setForeground(new java.awt.Color(0, 153, 153));
        clearButton.setText("CLEAR");
        clearButton.setBorder(null);
        clearButton.setBorderPainted(false);
        clearButton.setFocusPainted(false);
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });

        productsTable.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        productsTable.setForeground(new java.awt.Color(0, 102, 102));
        productsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "CATEGORY", "QUANTITY", "PRICE"
            }
        ));
        productsTable.setGridColor(new java.awt.Color(0, 153, 153));
        productsTable.setRowHeight(25);
        productsTable.setSelectionBackground(new java.awt.Color(0, 153, 153));
        productsTable.setShowGrid(false);
        productsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productsTableMouseClicked(evt);
            }
        });
        tableContainerPane.setViewportView(productsTable);

        productsTableHeadingLabel.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        productsTableHeadingLabel.setForeground(new java.awt.Color(0, 153, 153));
        productsTableHeadingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productsTableHeadingLabel.setText("PRODUCTS INVENTORY");

        billTextArea.setColumns(20);
        billTextArea.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N
        billTextArea.setRows(5);
        jScrollPane1.setViewportView(billTextArea);

        finalTotalLabel.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        finalTotalLabel.setForeground(new java.awt.Color(0, 153, 153));
        finalTotalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        refreshButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshButton.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(0, 153, 153));
        refreshButton.setText("SHOW ALL");
        refreshButton.setBorder(null);
        refreshButton.setBorderPainted(false);
        refreshButton.setFocusPainted(false);
        refreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productNameLabel)
                            .addComponent(quantityLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(filterLabel)
                        .addGap(18, 18, 18)
                        .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(filterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(tableContainerPane, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(finalTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(productsTableHeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(filterLabel)
                            .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(filterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productNameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(productsTableHeadingLabel)
                        .addGap(18, 18, 18)
                        .addComponent(tableContainerPane, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addComponent(finalTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {filterLabel, productNameLabel, quantityLabel});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {categoryComboBox, productNameTextField, quantityTextField});

        exitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLabel.setIcon(new javax.swing.ImageIcon("C:\\Deepali Singh\\NetbeansProject\\SuperMarket_Billing_System\\Icons\\Exit_Icon_mini.png")); // NOI18N
        exitLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });

        windowHeadingLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        windowHeadingLabel1.setForeground(new java.awt.Color(239, 228, 173));
        windowHeadingLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        windowHeadingLabel1.setText("BILLING POINT");
        windowHeadingLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        logoutLabel.setIcon(new javax.swing.ImageIcon("C:\\Deepali Singh\\NetbeansProject\\SuperMarket_Billing_System\\Icons\\Logout_Icon.png")); // NOI18N
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(408, Short.MAX_VALUE)
                .addComponent(windowHeadingLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(333, 333, 333))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 919, Short.MAX_VALUE)
                    .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(windowHeadingLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(logoutLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 599, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void productsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsTableMouseClicked
        
        DefaultTableModel tableModel = (DefaultTableModel) productsTable.getModel();
        int selectedRow = productsTable.getSelectedRow();
        
        productNameTextField.setText(tableModel.getValueAt(selectedRow, 1).toString());
        productPrice = Double.valueOf(tableModel.getValueAt(selectedRow, 4).toString());
        availableQuantity = Integer.valueOf(tableModel.getValueAt(selectedRow, 3).toString());
        
    }//GEN-LAST:event_productsTableMouseClicked

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        
        if(productNameTextField.getText().isEmpty() || quantityTextField.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Please Fill all the Details");
        
        else if(availableQuantity < Integer.valueOf(quantityTextField.getText()))
            JOptionPane.showMessageDialog(this, "Not enough quantity available !!!");
        
        else
        {
            itemCount++;
            totalPrice = productPrice * Integer.valueOf(quantityTextField.getText());
            totalAmount += totalPrice;
            remainingQuantity = availableQuantity - Integer.valueOf(quantityTextField.getText());
            availableQuantity = remainingQuantity;
            updateTable();
            
            if(itemCount == 1)
                billTextArea.setText(BILL_HEADING+"  "+itemCount+"               "+productNameTextField.getText()+"\t"+quantityTextField.getText()+"\t"+productPrice+"\t"+totalPrice);
            
            else
                billTextArea.setText(billTextArea.getText()+"\n  "+itemCount+"               "+productNameTextField.getText()+"\t"+quantityTextField.getText()+"\t"+productPrice+"\t"+totalPrice);
        }
        
        finalTotalLabel.setText("Rs. "+totalAmount.toString());
        
    }//GEN-LAST:event_addButtonMouseClicked

    private void editButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseClicked
        try
        {
            billTextArea.print();
        }
        
        catch (Exception e) {}
    }//GEN-LAST:event_editButtonMouseClicked

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        
        productNameTextField.setText("");
        quantityTextField.setText("");
        
    }//GEN-LAST:event_clearButtonMouseClicked

    private void logoutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseClicked

        new LoginWindow().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_logoutLabelMouseClicked

    private void filterButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterButtonMouseClicked
        
        try
        {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketDatabase", "Deepali", "password");
            stmt = con.createStatement();
            rset = stmt.executeQuery("SELECT * from Deepali.PRODUCTSTABLE where CATEGORY = '"+ categoryComboBox.getSelectedItem().toString() +"'");
            
            productsTable.setModel(DbUtils.resultSetToTableModel(rset));
        }

        catch(Exception e) { e.printStackTrace(); }
        
    }//GEN-LAST:event_filterButtonMouseClicked

    private void refreshButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshButtonMouseClicked
        refreshTable();
    }//GEN-LAST:event_refreshButtonMouseClicked

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
            java.util.logging.Logger.getLogger(BillingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextArea billTextArea;
    private javax.swing.JComboBox<String> categoryComboBox;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JButton filterButton;
    private javax.swing.JLabel filterLabel;
    private javax.swing.JLabel finalTotalLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel productNameLabel;
    private javax.swing.JTextField productNameTextField;
    private javax.swing.JTable productsTable;
    private javax.swing.JLabel productsTableHeadingLabel;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JButton refreshButton;
    private javax.swing.JScrollPane tableContainerPane;
    private javax.swing.JLabel windowHeadingLabel1;
    // End of variables declaration//GEN-END:variables
}
