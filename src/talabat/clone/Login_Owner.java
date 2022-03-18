package talabat.clone;

import java.awt.Color;
import java.awt.Toolkit;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author Aya
 */
public class Login_Owner extends javax.swing.JFrame {

    /**
     * Creates new form Login_Owner
     */
    public Login_Owner() {
        initComponents();
        seticon();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        RegisterPanel = new javax.swing.JPanel();
        RegisterLabel = new javax.swing.JLabel();
        ForgetPassPanel = new javax.swing.JPanel();
        ForgetPassLabel = new javax.swing.JLabel();
        SignInPanel = new javax.swing.JPanel();
        SignInLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        RestaurantName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Owner");
        setLocation(new java.awt.Point(450, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 8, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Talabat");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 250));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 153, 0));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("User Name:");

        UserName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        UserName.setForeground(new java.awt.Color(255, 153, 0));
        UserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UserName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Password:");

        Password.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 153, 0));
        Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));

        RegisterPanel.setBackground(new java.awt.Color(255, 153, 0));
        RegisterPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        RegisterPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegisterPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegisterPanelMouseExited(evt);
            }
        });

        RegisterLabel.setBackground(new java.awt.Color(255, 255, 255));
        RegisterLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        RegisterLabel.setForeground(new java.awt.Color(255, 255, 255));
        RegisterLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegisterLabel.setText("Register");
        RegisterLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout RegisterPanelLayout = new javax.swing.GroupLayout(RegisterPanel);
        RegisterPanel.setLayout(RegisterPanelLayout);
        RegisterPanelLayout.setHorizontalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
        );
        RegisterPanelLayout.setVerticalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        ForgetPassPanel.setBackground(new java.awt.Color(255, 153, 0));
        ForgetPassPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        ForgetPassPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForgetPassPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ForgetPassPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ForgetPassPanelMouseExited(evt);
            }
        });

        ForgetPassLabel.setBackground(new java.awt.Color(255, 255, 255));
        ForgetPassLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ForgetPassLabel.setForeground(new java.awt.Color(255, 255, 255));
        ForgetPassLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ForgetPassLabel.setText("Forget Your Password");
        ForgetPassLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout ForgetPassPanelLayout = new javax.swing.GroupLayout(ForgetPassPanel);
        ForgetPassPanel.setLayout(ForgetPassPanelLayout);
        ForgetPassPanelLayout.setHorizontalGroup(
            ForgetPassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ForgetPassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
        );
        ForgetPassPanelLayout.setVerticalGroup(
            ForgetPassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ForgetPassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        SignInPanel.setBackground(new java.awt.Color(255, 153, 0));
        SignInPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        SignInPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignInPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignInPanelMouseExited(evt);
            }
        });

        SignInLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        SignInLabel.setForeground(new java.awt.Color(255, 255, 255));
        SignInLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignInLabel.setText("Sign In");
        SignInLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout SignInPanelLayout = new javax.swing.GroupLayout(SignInPanel);
        SignInPanel.setLayout(SignInPanelLayout);
        SignInPanelLayout.setHorizontalGroup(
            SignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignInLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SignInPanelLayout.setVerticalGroup(
            SignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignInLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(" Restaurant Name:");

        RestaurantName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        RestaurantName.setForeground(new java.awt.Color(255, 153, 0));
        RestaurantName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RestaurantName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(SignInPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(UserName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(Password, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RestaurantName, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(ForgetPassPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RegisterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SignInPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addComponent(ForgetPassPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 430, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void RegisterPanelMouseClicked(java.awt.event.MouseEvent evt) {                                           
         String username=UserName.getText();
        
        String password=Password.getPassword().toString();
        int pass=Password.getPassword().length;
        String ResName=RestaurantName.getText();
        if (username.isEmpty()||password.isEmpty()||ResName.isEmpty()) 
        {
            JOptionPane.showConfirmDialog(this,"You must fill all fields completely","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if (pass<6) 
        {
            JOptionPane.showConfirmDialog(this,"Password must be greater than 6","Error",JOptionPane.ERROR_MESSAGE);
        }else if (!Pattern.matches("[a-zA-Z]+", username))
        {
             JOptionPane.showConfirmDialog(this,"Tha name is Invalid","Error",JOptionPane.ERROR_MESSAGE);
             UserName.setText("");
        }
    }                                          

    private void RegisterPanelMouseEntered(java.awt.event.MouseEvent evt) {                                           
        RegisterLabel.setForeground(new Color(255,153,0));
        RegisterPanel.setBackground(Color.white);
        RegisterPanel.setBorder(new LineBorder(new Color(255,153,0),1,true));
    }                                          

    private void RegisterPanelMouseExited(java.awt.event.MouseEvent evt) {                                          
        RegisterLabel.setForeground(Color.white);
        RegisterPanel.setBackground(new Color(255,153,0));
        RegisterPanel.setBorder(new LineBorder(new Color(255,153,0),1,true));
    }                                         

    private void ForgetPassPanelMouseClicked(java.awt.event.MouseEvent evt) {                                             
        new ForgetPassword().setVisible(true);
             this.setVisible(false);
    }                                            

    private void ForgetPassPanelMouseEntered(java.awt.event.MouseEvent evt) {                                             
        ForgetPassLabel.setForeground(new Color(255,153,0));
        ForgetPassPanel.setBackground(Color.white);
        ForgetPassPanel.setBorder(new LineBorder(new Color(255,153,0),1,true));
    }                                            

    private void ForgetPassPanelMouseExited(java.awt.event.MouseEvent evt) {                                            
        ForgetPassLabel.setForeground(Color.white);
        ForgetPassPanel.setBackground(new Color(255,153,0));
        ForgetPassPanel.setBorder(new LineBorder(new Color(255,153,0),1,true));
    }                                           

    private void SignInPanelMouseClicked(java.awt.event.MouseEvent evt) {                                         
        String username=UserName.getText();
        
        String password=Password.getPassword().toString();
        int pass=Password.getPassword().length;
        String ResName=RestaurantName.getText();
        if (username.isEmpty()||password.isEmpty()||ResName.isEmpty()) 
        {
            JOptionPane.showConfirmDialog(this,"You must fill all fields completely","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if (pass<6) 
        {
            JOptionPane.showConfirmDialog(this,"Password must be greater than 6","Error",JOptionPane.ERROR_MESSAGE);
        }else if (!Pattern.matches("[a-zA-Z]+", username))
        {
             JOptionPane.showConfirmDialog(this,"Tha name is Invalid","Error",JOptionPane.ERROR_MESSAGE);
             UserName.setText("");
        }
    }                                        

    private void SignInPanelMouseEntered(java.awt.event.MouseEvent evt) {                                         
        SignInLabel.setForeground(new Color(255,153,0));
        SignInPanel.setBackground(Color.white);
        SignInPanel.setBorder(new LineBorder(new Color(255,153,0),1,true));
    }                                        

    private void SignInPanelMouseExited(java.awt.event.MouseEvent evt) {                                        
        SignInLabel.setForeground(Color.white);
        SignInPanel.setBackground(new Color(255,153,0));
        SignInPanel.setBorder(new LineBorder(new Color(255,153,0),1,true));
    }                                       

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
            java.util.logging.Logger.getLogger(Login_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Owner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel ForgetPassLabel;
    private javax.swing.JPanel ForgetPassPanel;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel RegisterLabel;
    private javax.swing.JPanel RegisterPanel;
    private javax.swing.JTextField RestaurantName;
    private javax.swing.JLabel SignInLabel;
    private javax.swing.JPanel SignInPanel;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration                   

    private void seticon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Talabat.png")));
    }
}

