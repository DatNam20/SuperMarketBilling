/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supermarket;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.sql.SQLException;


/**
 *
 * @author Deepali
 */
public class RetailerManager extends javax.swing.JFrame {

    /**
     * Creates new form Retailers
     */
    public RetailerManager() {
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
            rset = stmt.executeQuery("SELECT * from Deepali.RETAILERSTABLE");
            
            retailersTable.setModel(DbUtils.resultSetToTableModel(rset));
        }

        catch(Exception e) { e.printStackTrace(); }
    }
    
    public void clearAllFields()
    {
        retailerIDTextField.setText("");
        retailerNameTextField.setText("");
        passwordTextField.setText("");
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        retailerIDLabel = new javax.swing.JLabel();
        retailerIDTextField = new javax.swing.JTextField();
        retailerNameLabel = new javax.swing.JLabel();
        retailerNameTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        tableContainerPane = new javax.swing.JScrollPane();
        retailersTable = new javax.swing.JTable();
        windowHeadingLabel = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        retailerIDLabel.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        retailerIDLabel.setForeground(new java.awt.Color(0, 153, 153));
        retailerIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        retailerIDLabel.setText("ID");

        retailerIDTextField.setFont(new java.awt.Font("Gill Sans MT", 0, 16)); // NOI18N
        retailerIDTextField.setForeground(new java.awt.Color(0, 102, 102));
        retailerIDTextField.setBorder(null);
        retailerIDTextField.setMinimumSize(new java.awt.Dimension(2, 19));

        retailerNameLabel.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        retailerNameLabel.setForeground(new java.awt.Color(0, 153, 153));
        retailerNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        retailerNameLabel.setText("Name");

        retailerNameTextField.setFont(new java.awt.Font("Gill Sans MT", 0, 16)); // NOI18N
        retailerNameTextField.setForeground(new java.awt.Color(0, 102, 102));
        retailerNameTextField.setBorder(null);
        retailerNameTextField.setMinimumSize(new java.awt.Dimension(2, 19));

        passwordLabel.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(0, 153, 153));
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("Password");

        passwordTextField.setFont(new java.awt.Font("Gill Sans MT", 0, 16)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(0, 102, 102));
        passwordTextField.setBorder(null);
        passwordTextField.setMinimumSize(new java.awt.Dimension(2, 19));

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

        retailersTable.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        retailersTable.setForeground(new java.awt.Color(0, 102, 102));
        retailersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NAME", "PASSWORD"
            }
        ));
        retailersTable.setGridColor(new java.awt.Color(0, 153, 153));
        retailersTable.setRowHeight(25);
        retailersTable.setSelectionBackground(new java.awt.Color(0, 153, 153));
        retailersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retailersTableMouseClicked(evt);
            }
        });
        tableContainerPane.setViewportView(retailersTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(retailerIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(retailerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(retailerIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(retailerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(55, 55, 55)
                        .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(tableContainerPane, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retailerIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retailerIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retailerNameLabel)
                    .addComponent(retailerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(tableContainerPane, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {passwordLabel, retailerNameLabel});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {passwordTextField, retailerNameTextField});

        windowHeadingLabel.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        windowHeadingLabel.setForeground(new java.awt.Color(239, 228, 173));
        windowHeadingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        windowHeadingLabel.setText("MANAGE RETAILERS");

        exitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLabel.setIcon(new javax.swing.ImageIcon("C:\\Deepali Singh\\NetbeansProject\\SuperMarket_Billing_System\\Icons\\Exit_Icon_mini.png")); // NOI18N
        exitLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(windowHeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 819, Short.MAX_VALUE)
                    .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(windowHeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 569, Short.MAX_VALUE)))
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
        
        if(retailerIDTextField.getText().isEmpty() || retailerNameTextField.getText().isEmpty() || passwordTextField.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Please Fill all the Details");
        
        else
        {
            try
            {
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketDatabase", "Deepali", "password");
                PreparedStatement add = con.prepareStatement("INSERT into RETAILERSTABLE values(?, ?, ?)");

                add.setInt(1, Integer.valueOf(retailerIDTextField.getText()));
                add.setString(2, retailerNameTextField.getText());
                add.setString(3, passwordTextField.getText());

                int row = add.executeUpdate();
                
                con.close();
                updateTable();
                clearAllFields();
            }

            catch(Exception e) { e.printStackTrace(); }
        }
        
    }//GEN-LAST:event_addButtonMouseClicked

    private void retailersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retailersTableMouseClicked
        
        DefaultTableModel tableModel = (DefaultTableModel) retailersTable.getModel();
        int selectedRow = retailersTable.getSelectedRow();
        
        retailerIDTextField.setText(tableModel.getValueAt(selectedRow, 0).toString());
        retailerNameTextField.setText(tableModel.getValueAt(selectedRow, 1).toString());
        passwordTextField.setText(tableModel.getValueAt(selectedRow, 2).toString());
        
    }//GEN-LAST:event_retailersTableMouseClicked

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        clearAllFields();
    }//GEN-LAST:event_clearButtonMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        
        if(retailerIDTextField.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Enter the ID to be deleted");
        
        else if(JOptionPane.showConfirmDialog(this, "Are you sure to delete ?", "Confirm Deletion", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
            try
            {
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketDatabase", "Deepali", "password");
                Statement add = con.createStatement();
                
                String rID = retailerIDTextField.getText();
                String query = "DELETE from Deepali.RETAILERSTABLE where RID = " + rID;
                
                add.executeUpdate(query);
                updateTable();
                clearAllFields();
            }

            catch(Exception e) { e.printStackTrace(); }
        }
        
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void editButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseClicked
        
        if(retailerIDTextField.getText().isEmpty() || retailerNameTextField.getText().isEmpty() || passwordTextField.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Please Fill all the Details");
        
        else if(JOptionPane.showConfirmDialog(this, "Are you sure to edit ?", "Confirm Editing", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
            try
            {
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketDatabase", "Deepali", "password");
                Statement add = con.createStatement();
                
                String query = "UPDATE Deepali.RETAILERSTABLE set RNAME = '" + retailerNameTextField.getText() + "', RPASSWORD = '" + 
                                    passwordTextField.getText() + "' where RID = " + retailerIDTextField.getText();
                
                add.executeUpdate(query);
                updateTable();
                clearAllFields();
            }

            catch(SQLException e) { e.printStackTrace(); }
        }
        
    }//GEN-LAST:event_editButtonMouseClicked

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

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
            java.util.logging.Logger.getLogger(RetailerManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RetailerManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RetailerManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RetailerManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RetailerManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JLabel retailerIDLabel;
    private javax.swing.JTextField retailerIDTextField;
    private javax.swing.JLabel retailerNameLabel;
    private javax.swing.JTextField retailerNameTextField;
    private javax.swing.JTable retailersTable;
    private javax.swing.JScrollPane tableContainerPane;
    private javax.swing.JLabel windowHeadingLabel;
    // End of variables declaration//GEN-END:variables
}
