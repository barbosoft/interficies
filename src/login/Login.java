/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.Color;

/**
 *
 * @author Dapau69
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    int xMouse, yMouse;
    public Login() {
        initComponents();
    }
    // Comprovació GIT
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        logoname = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        citybg = new javax.swing.JLabel();
        capçaleraPanel = new javax.swing.JPanel();
        tancarPanel = new javax.swing.JPanel();
        tancarLabel = new javax.swing.JLabel();
        logo_nom_empresa = new javax.swing.JLabel();
        inici_sessio = new javax.swing.JLabel();
        usuariLabel = new javax.swing.JLabel();
        usuariTextField = new javax.swing.JTextField();
        nomSeparator = new javax.swing.JSeparator();
        passSeparator = new javax.swing.JSeparator();
        passLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        entrarPanel = new javax.swing.JPanel();
        entrarLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoname.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        logoname.setForeground(new java.awt.Color(255, 255, 255));
        logoname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoname.setText("BARBOSOFT");
        bg.add(logoname, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 300, -1));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        bg.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 300, -1));

        citybg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        citybg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/city.png"))); // NOI18N
        bg.add(citybg, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 300, 500));

        capçaleraPanel.setBackground(new java.awt.Color(255, 255, 255));
        capçaleraPanel.setForeground(new java.awt.Color(255, 255, 255));
        capçaleraPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                capçaleraPanelMouseDragged(evt);
            }
        });
        capçaleraPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                capçaleraPanelMousePressed(evt);
            }
        });

        tancarPanel.setBackground(new java.awt.Color(255, 255, 255));
        tancarPanel.setForeground(new java.awt.Color(255, 255, 255));
        tancarPanel.setPreferredSize(new java.awt.Dimension(40, 40));

        tancarLabel.setBackground(new java.awt.Color(255, 255, 255));
        tancarLabel.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        tancarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tancarLabel.setText("X");
        tancarLabel.setPreferredSize(new java.awt.Dimension(40, 40));
        tancarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tancarLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tancarLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tancarLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout tancarPanelLayout = new javax.swing.GroupLayout(tancarPanel);
        tancarPanel.setLayout(tancarPanelLayout);
        tancarPanelLayout.setHorizontalGroup(
            tancarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tancarPanelLayout.createSequentialGroup()
                .addComponent(tancarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        tancarPanelLayout.setVerticalGroup(
            tancarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tancarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout capçaleraPanelLayout = new javax.swing.GroupLayout(capçaleraPanel);
        capçaleraPanel.setLayout(capçaleraPanelLayout);
        capçaleraPanelLayout.setHorizontalGroup(
            capçaleraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capçaleraPanelLayout.createSequentialGroup()
                .addComponent(tancarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 760, Short.MAX_VALUE))
        );
        capçaleraPanelLayout.setVerticalGroup(
            capçaleraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capçaleraPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tancarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(capçaleraPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        logo_nom_empresa.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        logo_nom_empresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/favicon.png"))); // NOI18N
        logo_nom_empresa.setText("BARBOSOFT");
        bg.add(logo_nom_empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        inici_sessio.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        inici_sessio.setText("INICIAR SESSIÓ");
        bg.add(inici_sessio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        usuariLabel.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        usuariLabel.setText("USUARI");
        bg.add(usuariLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        usuariTextField.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        usuariTextField.setForeground(new java.awt.Color(204, 204, 204));
        usuariTextField.setText("Introdueixi el seu usuari");
        usuariTextField.setBorder(null);
        usuariTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuariTextFieldMousePressed(evt);
            }
        });
        bg.add(usuariTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 340, 30));
        bg.add(nomSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 340, -1));
        bg.add(passSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 340, -1));

        passLabel.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        passLabel.setText("CONTRASENYA");
        bg.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(204, 204, 204));
        passwordField.setText("********");
        passwordField.setBorder(null);
        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordFieldMousePressed(evt);
            }
        });
        bg.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 340, 30));

        entrarPanel.setBackground(new java.awt.Color(0, 134, 190));
        entrarPanel.setFont(new java.awt.Font("Rockwell Condensed", 0, 14)); // NOI18N
        entrarPanel.setName(""); // NOI18N

        entrarLabel.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        entrarLabel.setForeground(new java.awt.Color(255, 255, 255));
        entrarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entrarLabel.setText("ENTRAR");
        entrarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrarLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrarLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout entrarPanelLayout = new javax.swing.GroupLayout(entrarPanel);
        entrarPanel.setLayout(entrarPanelLayout);
        entrarPanelLayout.setHorizontalGroup(
            entrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        entrarPanelLayout.setVerticalGroup(
            entrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(entrarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void capçaleraPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_capçaleraPanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_capçaleraPanelMousePressed

    private void capçaleraPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_capçaleraPanelMouseDragged
        //Al passar el ratolí la finestra es desplaça
        //Llavors creem les variables x i y, per saber on es el cursor a la pantalla
        //Per finalitzar restem les variables amb la ubicació x - xMouse i y - yMouse
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_capçaleraPanelMouseDragged

    private void tancarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tancarLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_tancarLabelMouseClicked

    private void tancarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tancarLabelMouseEntered
        tancarPanel.setBackground(Color.red);
        tancarLabel.setForeground(Color.white);
    }//GEN-LAST:event_tancarLabelMouseEntered

    private void tancarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tancarLabelMouseExited
        tancarPanel.setBackground(Color.white);
        tancarLabel.setForeground(Color.black);
    }//GEN-LAST:event_tancarLabelMouseExited

    private void entrarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarLabelMouseEntered
        entrarPanel.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_entrarLabelMouseEntered

    private void entrarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarLabelMouseExited
        entrarPanel.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_entrarLabelMouseExited

    private void usuariTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariTextFieldMousePressed
        if (usuariTextField.getText().equals("Introdueixi el seu usuari")) {
            usuariTextField.setText("");
            usuariTextField.setForeground(Color.black);
        }
        if (String.valueOf(passwordField.getPassword()).isEmpty()) {
            passwordField.setText("********");
            passwordField.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_usuariTextFieldMousePressed

    private void passwordFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMousePressed
        if (String.valueOf(passwordField.getPassword()).equals("********")) {
            passwordField.setText("");
            passwordField.setForeground(Color.black);
        }
        if (usuariTextField.getText().isEmpty()){
            usuariTextField.setText("Introdueix el seu usuari");
            usuariTextField.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_passwordFieldMousePressed

    private void entrarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarLabelMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Intent d'accés amb les dades:\nUsuari: " + usuariTextField.getText() + "\nContrasenya: " + String.valueOf(passwordField.getPassword()), "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_entrarLabelMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel capçaleraPanel;
    private javax.swing.JLabel citybg;
    private javax.swing.JLabel entrarLabel;
    private javax.swing.JPanel entrarPanel;
    private javax.swing.JLabel inici_sessio;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo_nom_empresa;
    private javax.swing.JLabel logoname;
    private javax.swing.JSeparator nomSeparator;
    private javax.swing.JLabel passLabel;
    private javax.swing.JSeparator passSeparator;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel tancarLabel;
    private javax.swing.JPanel tancarPanel;
    private javax.swing.JLabel usuariLabel;
    private javax.swing.JTextField usuariTextField;
    // End of variables declaration//GEN-END:variables
}
