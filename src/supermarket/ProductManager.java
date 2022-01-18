/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Deepali
 */
public class ProductManager extends javax.swing.JFrame {

    /**
     * Creates new form ProductManager
     */
    public ProductManager() {
        initComponents();
        updateTable();
    }

    Connection con = null;
    Statement stmt = null;
    ResultSet rset = null;
    
    public void updateTable()
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
    
    public void clearAllFields()
    {
        productIDTextField.setText("");
        productNameTextField.setText("");
        quantityTextField.setText("");
        priceTextField.setText("");
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        productIDLabel = new javax.swing.JLabel();
        productIDTextField = new javax.swing.JTextField();
        productNameLabel = new javax.swing.JLabel();
        productNameTextField = new javax.swing.JTextField();
        quantityLabel = new javax.swing.JLabel();
        quantityTextField = new javax.swing.JTextField();
        priceLabel = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        categoryComboBox = new javax.swing.JComboBox<>();
        categoryLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        tableContainerPane = new javax.swing.JScrollPane();
        productsTable = new javax.swing.JTable();
        windowHeadingLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        productIDLabel.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        productIDLabel.setForeground(new java.awt.Color(0, 153, 153));
        productIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productIDLabel.setText("ID");

        productIDTextField.setFont(new java.awt.Font("Gill Sans MT", 0, 16)); // NOI18N
        productIDTextField.setForeground(new java.awt.Color(0, 102, 102));
        productIDTextField.setBorder(null);
        productIDTextField.setMinimumSize(new java.awt.Dimension(2, 19));

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

        priceLabel.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(0, 153, 153));
        priceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priceLabel.setText("Price");

        priceTextField.setFont(new java.awt.Font("Gill Sans MT", 0, 16)); // NOI18N
        priceTextField.setForeground(new java.awt.Color(0, 102, 102));
        priceTextField.setBorder(null);
        priceTextField.setMinimumSize(new java.awt.Dimension(2, 19));

        categoryComboBox.setFont(new java.awt.Font("Gill Sans MT", 0, 16)); // NOI18N
        categoryComboBox.setForeground(new java.awt.Color(0, 102, 102));
        categoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverage", "Vegetable", "Meat", "Fruit", "Toiletries" }));
        categoryComboBox.setBorder(null);

        categoryLabel.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        categoryLabel.setForeground(new java.awt.Color(0, 153, 153));
        categoryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryLabel.setText("Category");

        addButton.setBackground(new java.awt.Color(255, 255, 255));
        addButton.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(0, 153, 153));
        addButton.setText("ADD");
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
        editButton.setText("EDIT");
        editButton.setBorder(null);
        editButton.setBorderPainted(false);
        editButton.setFocusPainted(false);
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonMouseClicked(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 255, 255));
        deleteButton.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(0, 153, 153));
        deleteButton.setText("DELETE");
        deleteButton.setBorder(null);
        deleteButton.setBorderPainted(false);
        deleteButton.setFocusPainted(false);
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "CATEGORY", "QUANTITY", "PRICE"
            }
        ));
        productsTable.setGridColor(new java.awt.Color(0, 153, 153));
        productsTable.setRowHeight(25);
        productsTable.setSelectionBackground(new java.awt.Color(0, 153, 153));
        productsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productsTableMouseClicked(evt);
            }
        });
        tableContainerPane.setViewportView(productsTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tableContainerPane)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(productNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(productIDTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(categoryComboBox, 0, 192, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(quantityTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceLabel)
                            .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(productIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(productNameLabel))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(productIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(productNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryLabel)
                    .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(tableContainerPane, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {productIDLabel, productNameLabel});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {productIDTextField, productNameTextField});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {priceTextField, quantityTextField});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {priceLabel, quantityLabel});

        windowHeadingLabel.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        windowHeadingLabel.setForeground(new java.awt.Color(239, 228, 173));
        windowHeadingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        windowHeadingLabel.setText("MANAGE PRODUCTS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(windowHeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(windowHeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
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

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        
        if(productIDTextField.getText().isEmpty() || productNameTextField.getText().isEmpty() || quantityTextField.getText().isEmpty() || priceTextField.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Please Fill all the Details");
        
        else
        {
            try
            {
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketDatabase", "Deepali", "password");
                PreparedStatement add = con.prepareStatement("INSERT into PRODUCTSTABLE values(?, ?, ?, ?, ?)");

                add.setInt(1, Integer.valueOf(productIDTextField.getText()));
                add.setString(2, productNameTextField.getText());
                add.setString(3, categoryComboBox.getSelectedItem().toString());
                add.setInt(4, Integer.valueOf(quantityTextField.getText()));
                add.setInt(5, Integer.valueOf(priceTextField.getText()));

                int row = add.executeUpdate();
                
                con.close();
                updateTable();
                clearAllFields();
            } 

            catch(Exception e) { e.printStackTrace(); }
        }
        
    }//GEN-LAST:event_addButtonMouseClicked

    private void productsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsTableMouseClicked
        
        DefaultTableModel tableModel = (DefaultTableModel) productsTable.getModel();
        int selectedRow = productsTable.getSelectedRow();
        
        productIDTextField.setText(tableModel.getValueAt(selectedRow, 0).toString());
        productNameTextField.setText(tableModel.getValueAt(selectedRow, 1).toString());
        quantityTextField.setText(tableModel.getValueAt(selectedRow, 3).toString());
        priceTextField.setText(tableModel.getValueAt(selectedRow, 4).toString());
        
    }//GEN-LAST:event_productsTableMouseClicked

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        clearAllFields();
    }//GEN-LAST:event_clearButtonMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        
        if(productIDTextField.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Enter the ID to be deleted");
        
        else if(JOptionPane.showConfirmDialog(this, "Are you sure to delete ?", "Confirm Deletion", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
            try
            {
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketDatabase", "Deepali", "password");
                Statement add = con.createStatement();
                
                String pID = productIDTextField.getText();
                String query = "DELETE from Deepali.PRODUCTSTABLE where PID = " + pID;
                
                add.executeUpdate(query);
                updateTable();
                clearAllFields();
            }

            catch(Exception e) { e.printStackTrace(); }
        }
        
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void editButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseClicked
        
        if(productIDTextField.getText().isEmpty() || productNameTextField.getText().isEmpty() || quantityTextField.getText().isEmpty() || priceTextField.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Please Fill all the Details");
        
        else if(JOptionPane.showConfirmDialog(this, "Are you sure to edit ?", "Confirm Editing", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
            try
            {
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketDatabase", "Deepali", "password");
                Statement add = con.createStatement();
                
                String query = "UPDATE Deepali.PRODUCTSTABLE set PNAME = '" + productNameTextField.getText() + "', CATEGORY = '" + 
                                    categoryComboBox.getSelectedItem().toString() + "', QUANTITY = " + quantityTextField.getText() + 
                                    ", PRICE = " + priceTextField.getText() + " where PID = " + productIDTextField.getText();
                
                add.executeUpdate(query);
                updateTable();
                clearAllFields();
            }

            catch(SQLException e) { e.printStackTrace(); }
        }
        
    }//GEN-LAST:event_editButtonMouseClicked

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
            java.util.logging.Logger.getLogger(ProductManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JComboBox<String> categoryComboBox;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JLabel productIDLabel;
    private javax.swing.JTextField productIDTextField;
    private javax.swing.JLabel productNameLabel;
    private javax.swing.JTextField productNameTextField;
    private javax.swing.JTable productsTable;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JScrollPane tableContainerPane;
    private javax.swing.JLabel windowHeadingLabel;
    // End of variables declaration//GEN-END:variables
}
