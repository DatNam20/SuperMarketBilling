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
        updateTable();
    }

    Connection con = null;
    Statement stmt = null;
    ResultSet rset = null;
    
    Double productPrice = 0.0;
    Double totalPrice = 0.0;
    int itemCount = 0;
    
    String BILL_HEADING = "    ~~~~~~~~~~~~ NEAR-BZ SUPERMARKET ~~~~~~~~~~~~\n\n NO.            NAME\tQTY\tPRC\tTTL\n ---------------------------------------------------------------------- \n";
    
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
        refreshButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        tableContainerPane = new javax.swing.JScrollPane();
        productsTable = new javax.swing.JTable();
        productsTableHeadingLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        billTextArea = new javax.swing.JTextArea();
        exitLabel = new javax.swing.JLabel();
        windowHeadingLabel1 = new javax.swing.JLabel();

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
        categoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverage", "Vegetable", "Meat", "Fruit", "Toiletries" }));
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

        refreshButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshButton.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(0, 153, 153));
        refreshButton.setText("REFRESH");
        refreshButton.setBorder(null);
        refreshButton.setBorderPainted(false);
        refreshButton.setFocusPainted(false);

        clearButton.setBackground(new java.awt.Color(255, 255, 255));
        clearButton.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        clearButton.setForeground(new java.awt.Color(0, 153, 153));
        clearButton.setText("CLEAR ENTRIES");
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
        productsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productsTableMouseClicked(evt);
            }
        });
        tableContainerPane.setViewportView(productsTable);

        productsTableHeadingLabel.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        productsTableHeadingLabel.setForeground(new java.awt.Color(0, 153, 153));
        productsTableHeadingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productsTableHeadingLabel.setText("PRODUCTS INVENTORY");

        billTextArea.setColumns(20);
        billTextArea.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N
        billTextArea.setRows(5);
        jScrollPane1.setViewportView(billTextArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(productNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(productNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(productsTableHeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(filterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(tableContainerPane, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(productsTableHeadingLabel)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filterLabel)
                            .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tableContainerPane, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(productNameLabel)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(productNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(windowHeadingLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(354, 354, 354))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 919, Short.MAX_VALUE)
                    .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(windowHeadingLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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
        
    }//GEN-LAST:event_productsTableMouseClicked

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        
        if(productNameTextField.getText().isEmpty() || quantityTextField.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Please Fill all the Details");
        
        else
        {
            itemCount++;
            totalPrice = productPrice * Integer.valueOf(quantityTextField.getText());
            
            if(itemCount == 1)
                billTextArea.setText(BILL_HEADING+"  "+itemCount+"               "+productNameTextField.getText()+"\t"+quantityTextField.getText()+"\t"+productPrice+"\t"+totalPrice);
            
            else
                billTextArea.setText(billTextArea.getText()+"\n  "+itemCount+"               "+productNameTextField.getText()+"\t"+quantityTextField.getText()+"\t"+productPrice+"\t"+totalPrice);
            
        }
        
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
    private javax.swing.JLabel filterLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
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
