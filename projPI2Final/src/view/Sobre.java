/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Inacio
 */
public class Sobre extends javax.swing.JFrame {

    /**
     * Creates new form NewSobre
     */
    public Sobre() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnSobre = new javax.swing.JPanel();
        lblTitleSobre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblLogoGnu = new javax.swing.JLabel();
        btnSobre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre");
        setMinimumSize(new java.awt.Dimension(445, 245));
        setName("jframeSobre"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnSobre.setBackground(new java.awt.Color(0, 68, 111));
        jpnSobre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 60, 0), 5, true));
        jpnSobre.setPreferredSize(new java.awt.Dimension(482, 294));
        jpnSobre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitleSobre.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleSobre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleSobre.setText("<html><font size = 6><b><u>Sobre</b></u></font></html>");
        lblTitleSobre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpnSobre.add(lblTitleSobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 270, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema para controle de Estoque de Material de Constru��o");
        jpnSobre.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 68, 111));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Desenvolvido por: In�cio, Raissa, Davi, Luiz, Lucas, Denis, Luanderson ");
        jpnSobre.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PI - ADS - 2� Semestre de 2024");
        jpnSobre.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 180, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Prof.: Eliseu Lemes da Silva");
        jpnSobre.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sob a licen�a GPL");
        jpnSobre.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        lblLogoGnu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/gnu_106X150.png"))); // NOI18N
        jpnSobre.add(lblLogoGnu, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        btnSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sobre_close_32X32.png"))); // NOI18N
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });
        jpnSobre.add(btnSobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 10, 40, 40));

        getContentPane().add(jpnSobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 466, 303));

        setSize(new java.awt.Dimension(466, 303));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
       dispose();
    }//GEN-LAST:event_btnSobreActionPerformed

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
            java.util.logging.Logger.getLogger(Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sobre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSobre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jpnSobre;
    private javax.swing.JLabel lblLogoGnu;
    private javax.swing.JLabel lblTitleSobre;
    // End of variables declaration//GEN-END:variables
}
