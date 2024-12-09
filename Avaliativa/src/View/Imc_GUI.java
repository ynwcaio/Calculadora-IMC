package View;


public class Imc_GUI extends javax.swing.JFrame {
    
    public Imc_GUI() {
        initComponents();
        ico_img.setVisible(false);
        ico2_img.setVisible(false);
        ico3_img.setVisible(false);
        ico4_img.setVisible(false);
        ico5_img.setVisible(false);
        ico6_img.setVisible(false);  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        altura_txt = new javax.swing.JTextField();
        Calcula_BTN = new javax.swing.JButton();
        Fechar_BTN = new javax.swing.JButton();
        Limpar_BTN = new javax.swing.JButton();
        r2_txt = new javax.swing.JLabel();
        ico_img = new javax.swing.JLabel();
        ico2_img = new javax.swing.JLabel();
        ico3_img = new javax.swing.JLabel();
        ico4_img = new javax.swing.JLabel();
        ico5_img = new javax.swing.JLabel();
        ico6_img = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        r_txt = new javax.swing.JLabel();
        peso_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CALCULADORA DE IMC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 24))); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("DIGITE O SEU PESO: ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 90, 190, 21);

        altura_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altura_txtActionPerformed(evt);
            }
        });
        jPanel1.add(altura_txt);
        altura_txt.setBounds(220, 140, 240, 22);

        Calcula_BTN.setBackground(new java.awt.Color(0, 0, 0));
        Calcula_BTN.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Calcula_BTN.setForeground(new java.awt.Color(255, 255, 255));
        Calcula_BTN.setText("CALCULAR");
        Calcula_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calcula_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(Calcula_BTN);
        Calcula_BTN.setBounds(10, 300, 150, 80);

        Fechar_BTN.setBackground(new java.awt.Color(153, 153, 153));
        Fechar_BTN.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Fechar_BTN.setText("FECHAR");
        Fechar_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fechar_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(Fechar_BTN);
        Fechar_BTN.setBounds(630, 10, 110, 29);

        Limpar_BTN.setBackground(new java.awt.Color(0, 0, 0));
        Limpar_BTN.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Limpar_BTN.setForeground(new java.awt.Color(255, 255, 255));
        Limpar_BTN.setText("LIMPAR");
        Limpar_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpar_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(Limpar_BTN);
        Limpar_BTN.setBounds(180, 300, 160, 80);

        r2_txt.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        r2_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(r2_txt);
        r2_txt.setBounds(470, 320, 230, 20);

        ico_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/abaixodopeso.PNG"))); // NOI18N
        jPanel1.add(ico_img);
        ico_img.setBounds(540, 110, 90, 170);

        ico2_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pesonormal.PNG"))); // NOI18N
        jPanel1.add(ico2_img);
        ico2_img.setBounds(550, 100, 90, 200);

        ico3_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/sobrepeso.PNG"))); // NOI18N
        jPanel1.add(ico3_img);
        ico3_img.setBounds(530, 100, 107, 200);

        ico4_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/obesidade1.PNG"))); // NOI18N
        jPanel1.add(ico4_img);
        ico4_img.setBounds(530, 110, 109, 194);

        ico5_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/obesidade2.PNG"))); // NOI18N
        jPanel1.add(ico5_img);
        ico5_img.setBounds(540, 110, 100, 180);

        ico6_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Obesidade3.PNG"))); // NOI18N
        jPanel1.add(ico6_img);
        ico6_img.setBounds(530, 110, 100, 185);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("DIGITE A SUA ALTURA: ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 140, 230, 21);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("CLASSIFICAÇÃO DO IMC");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(470, 70, 360, 21);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setText("RESULTADO DO IMC:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 190, 200, 14);

        r_txt.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jPanel1.add(r_txt);
        r_txt.setBounds(220, 190, 230, 20);

        peso_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peso_txtActionPerformed(evt);
            }
        });
        jPanel1.add(peso_txt);
        peso_txt.setBounds(210, 90, 240, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 750, 410);

        setSize(new java.awt.Dimension(748, 410));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void altura_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altura_txtActionPerformed

    }//GEN-LAST:event_altura_txtActionPerformed

    private void Calcula_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calcula_BTNActionPerformed
        Controller.CALCULA_DAO.calcula();
    }//GEN-LAST:event_Calcula_BTNActionPerformed

    private void Fechar_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fechar_BTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Fechar_BTNActionPerformed

    private void Limpar_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpar_BTNActionPerformed
        Controller.CALCULA_DAO.limpa();
    }//GEN-LAST:event_Limpar_BTNActionPerformed

    private void peso_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peso_txtActionPerformed

    }//GEN-LAST:event_peso_txtActionPerformed

    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Imc_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Imc_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Imc_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Imc_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Imc_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcula_BTN;
    private javax.swing.JButton Fechar_BTN;
    private javax.swing.JButton Limpar_BTN;
    public static javax.swing.JTextField altura_txt;
    public static javax.swing.JLabel ico2_img;
    public static javax.swing.JLabel ico3_img;
    public static javax.swing.JLabel ico4_img;
    public static javax.swing.JLabel ico5_img;
    public static javax.swing.JLabel ico6_img;
    public static javax.swing.JLabel ico_img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField peso_txt;
    public static javax.swing.JLabel r2_txt;
    public static javax.swing.JLabel r_txt;
    // End of variables declaration//GEN-END:variables
}
