/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_davidbendeck;

/**
 *
 * @author davidbendeck
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        TP_MenuPrincipal = new javax.swing.JTabbedPane();
        P_CrearCuenta = new javax.swing.JPanel();
        L_Bienvenido = new javax.swing.JLabel();
        B_CrearTutor = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        P_LogIn = new javax.swing.JPanel();
        P_CrearExamen = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        L_Bienvenido.setText("Bienvenido");

        B_CrearTutor.setText("Crear Tutor");

        jButton1.setText("Crear Estudiante");

        javax.swing.GroupLayout P_CrearCuentaLayout = new javax.swing.GroupLayout(P_CrearCuenta);
        P_CrearCuenta.setLayout(P_CrearCuentaLayout);
        P_CrearCuentaLayout.setHorizontalGroup(
            P_CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_CrearCuentaLayout.createSequentialGroup()
                .addGroup(P_CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_CrearCuentaLayout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addGroup(P_CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(B_CrearTutor)
                            .addComponent(L_Bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(P_CrearCuentaLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jButton1)))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        P_CrearCuentaLayout.setVerticalGroup(
            P_CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_CrearCuentaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(L_Bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(B_CrearTutor)
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        TP_MenuPrincipal.addTab("Crear Cuenta", P_CrearCuenta);

        javax.swing.GroupLayout P_LogInLayout = new javax.swing.GroupLayout(P_LogIn);
        P_LogIn.setLayout(P_LogInLayout);
        P_LogInLayout.setHorizontalGroup(
            P_LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );
        P_LogInLayout.setVerticalGroup(
            P_LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        TP_MenuPrincipal.addTab("Log In", P_LogIn);

        javax.swing.GroupLayout P_CrearExamenLayout = new javax.swing.GroupLayout(P_CrearExamen);
        P_CrearExamen.setLayout(P_CrearExamenLayout);
        P_CrearExamenLayout.setHorizontalGroup(
            P_CrearExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );
        P_CrearExamenLayout.setVerticalGroup(
            P_CrearExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        TP_MenuPrincipal.addTab("Crear Examen", P_CrearExamen);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TP_MenuPrincipal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TP_MenuPrincipal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_CrearTutor;
    private javax.swing.JLabel L_Bienvenido;
    private javax.swing.JPanel P_CrearCuenta;
    private javax.swing.JPanel P_CrearExamen;
    private javax.swing.JPanel P_LogIn;
    private javax.swing.JTabbedPane TP_MenuPrincipal;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
