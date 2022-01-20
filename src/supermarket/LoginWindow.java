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
import net.proteanit.sql.DbUtils;
import java.sql.SQLException;

/**
 *
 * @author Deepali
 */
public class LoginWindow extends javax.swing.JFrame {

    /**
     * Creates new form LoginWindow
     */
    public LoginWindow() {
        initComponents();
    }

    Connection con = null;
    Statement stmt = null;
    ResultSet rset = null;
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        logoLabel_near = new javax.swing.JLabel();
        logoLabel_bz = new javax.swing.JLabel();
        iconLabel = new javax.swing.JLabel();
        loginAsLabel = new javax.swing.JLabel();
        userTypeComboBox = new javax.swing.JComboBox<>();
        userNameLabel = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        exitLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(0, 153, 153));

        logoLabel_near.setFont(new java.awt.Font("Gill Sans MT", 0, 21)); // NOI18N
        logoLabel_near.setForeground(new java.awt.Color(239, 228, 176));
        logoLabel_near.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel_near.setText("NEAR");
        logoLabel_near.setPreferredSize(new java.awt.Dimension(61, 29));

        logoLabel_bz.setFont(new java.awt.Font("Gill Sans MT", 1, 42)); // NOI18N
        logoLabel_bz.setForeground(new java.awt.Color(0, 102, 102));
        logoLabel_bz.setText("BZ");

        iconLabel.setIcon(new javax.swing.ImageIcon("C:\\Deepali Singh\\NetbeansProject\\SuperMarket_Billing_System\\Icons\\supermarket_icon_SUPERMINI.png")); // NOI18N

        loginAsLabel.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        loginAsLabel.setForeground(new java.awt.Color(239, 228, 176));
        loginAsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginAsLabel.setText("Login as");

        userTypeComboBox.setBackground(new java.awt.Color(0, 153, 153));
        userTypeComboBox.setFont(new java.awt.Font("Gill Sans MT", 0, 16)); // NOI18N
        userTypeComboBox.setForeground(new java.awt.Color(0, 102, 102));
        userTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Retailer" }));
        userTypeComboBox.setBorder(null);

        userNameLabel.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(239, 228, 176));
        userNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userNameLabel.setText("User Name");

        userNameTextField.setBackground(new java.awt.Color(204, 204, 204));
        userNameTextField.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        userNameTextField.setForeground(new java.awt.Color(0, 102, 102));
        userNameTextField.setBorder(null);
        userNameTextField.setMinimumSize(new java.awt.Dimension(2, 19));

        passwordLabel.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(239, 228, 176));
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("PassWord");

        passwordTextField.setBackground(new java.awt.Color(204, 204, 204));
        passwordTextField.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(0, 102, 102));
        passwordTextField.setBorder(null);
        passwordTextField.setMinimumSize(new java.awt.Dimension(2, 19));

        loginButton.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 153, 153));
        loginButton.setText("LOGIN");
        loginButton.setBorder(null);
        loginButton.setBorderPainted(false);
        loginButton.setFocusPainted(false);
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        clearButton.setForeground(new java.awt.Color(0, 153, 153));
        clearButton.setText("CLEAR");
        clearButton.setBorder(null);
        clearButton.setBorderPainted(false);
        clearButton.setFocusPainted(false);

        exitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLabel.setIcon(new javax.swing.ImageIcon("C:\\Deepali Singh\\NetbeansProject\\SuperMarket_Billing_System\\Icons\\Exit_Icon_mini.png")); // NOI18N
        exitLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loginAsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(79, 79, 79)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(userTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(userNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 89, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(iconLabel)))
                .addContainerGap())
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel_near, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(logoLabel_bz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoLabel_bz, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoLabel_near, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginAsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(iconLabel)
                .addGap(8, 8, 8))
        );

        mainPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {passwordTextField, userNameTextField});

        mainPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {loginAsLabel, passwordLabel, userNameLabel});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        if("Retailer".equals(userTypeComboBox.getSelectedItem().toString()))
        {
            String query = "SELECT * from Deepali.RETAILERSTABLE where RNAME = '"+ userNameTextField.getText() +"' and RPASSWORD = '"+ passwordTextField.getText() +"'";
            try
            {
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketDatabase", "Deepali", "password");
                stmt = con.createStatement();
                rset = stmt.executeQuery(query);
                
                if(rset.next())
                {
                    new BillingWindow().setVisible(true);
                    this.dispose();
                }
                
                else
                    JOptionPane.showMessageDialog(this, "Incorrect username or password !!!");
            }

            catch(SQLException e) { e.printStackTrace(); }
        }
        
        else
        {
            String query = "SELECT * from Deepali.ADMIN where ANAME = '"+ userNameTextField.getText() +"' and APASSWORD = '"+ passwordTextField.getText() +"'";
            try
            {
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketDatabase", "Deepali", "password");
                stmt = con.createStatement();
                rset = stmt.executeQuery(query);
                
                if(rset.next())
                {
                    new ProductManager().setVisible(true);
                    this.dispose();
                }
                
                else
                    JOptionPane.showMessageDialog(this, "Incorrect username or password !!!");
            }

            catch(SQLException e) { e.printStackTrace(); }
        }
    }//GEN-LAST:event_loginButtonMouseClicked

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
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel loginAsLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel logoLabel_bz;
    private javax.swing.JLabel logoLabel_near;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameTextField;
    private javax.swing.JComboBox<String> userTypeComboBox;
    // End of variables declaration//GEN-END:variables
}
