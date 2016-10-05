/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    int nf, nc, n;

    public Principal() {
        initComponents();
        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdLlenarManual, cmdLlenarAutomatico, cmdOperaciones};

        Helper.habilitarBotonoes(botonesH);
        Helper.deshabilitarBotonoes(botonesD);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtNumeroFilas = new javax.swing.JTextField();
        txtNumeroColumnas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenarManual = new javax.swing.JButton();
        cmdLlenarAutomatico = new javax.swing.JButton();
        cmdOperaciones = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaResultado = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();
        cmbOperaciones = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Operaciones Con Matrices");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Iniciales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 51, 51))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNumeroFilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroFilasActionPerformed(evt);
            }
        });
        txtNumeroFilas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroFilasKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumeroFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 70, -1));

        txtNumeroColumnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroColumnasKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumeroColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 70, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Numero De Filas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Numero De Columnas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 270, 110));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 51, 51))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setBackground(new java.awt.Color(51, 51, 51));
        cmdCrear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdCrear.setForeground(new java.awt.Color(255, 255, 255));
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel2.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        cmdLlenarManual.setBackground(new java.awt.Color(0, 0, 0));
        cmdLlenarManual.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdLlenarManual.setForeground(new java.awt.Color(255, 255, 255));
        cmdLlenarManual.setText("Manual");
        cmdLlenarManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarManualActionPerformed(evt);
            }
        });
        jPanel2.add(cmdLlenarManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        cmdLlenarAutomatico.setBackground(new java.awt.Color(0, 0, 0));
        cmdLlenarAutomatico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdLlenarAutomatico.setForeground(new java.awt.Color(255, 255, 255));
        cmdLlenarAutomatico.setText("Automatico");
        cmdLlenarAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarAutomaticoActionPerformed(evt);
            }
        });
        jPanel2.add(cmdLlenarAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        cmdOperaciones.setBackground(new java.awt.Color(0, 0, 0));
        cmdOperaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdOperaciones.setForeground(new java.awt.Color(255, 255, 255));
        cmdOperaciones.setText("Operaciones");
        cmdOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionesActionPerformed(evt);
            }
        });
        jPanel2.add(cmdOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        cmdLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        cmdLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 550, 80));

        tblTablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTablaResultado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 390, 280));

        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTablaInicial);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 390, 280));

        cmbOperaciones.setBackground(new java.awt.Color(0, 255, 51));
        cmbOperaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Letra B", "Letra K", "Letra M", "Letra W", "Letra Q", "Letra J", "Letra G", "Letra R", "Figura 1", "Figura 2", "Figura 3", "Figura 4", " " }));
        getContentPane().add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, -1));

        setSize(new java.awt.Dimension(1106, 535));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        int nf, nc;
        DefaultTableModel tm, tm2;
        if (txtNumeroFilas.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite número de filas", 3);
            txtNumeroFilas.requestFocusInWindow();
        } else if (txtNumeroColumnas.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite número de columnas", 3);
            txtNumeroColumnas.requestFocusInWindow();
        } else {
            nf = Integer.parseInt(txtNumeroFilas.getText());
            nc = Integer.parseInt(txtNumeroColumnas.getText());

            if (nf == 0) {
                Helper.mensaje(this, "El Numero De Filas No Puede Ser Cero", 3);
                txtNumeroFilas.setText("");
                txtNumeroColumnas.setText("");
                txtNumeroFilas.requestFocusInWindow();
            } else if (nc == 0) {
                Helper.mensaje(this, "El Numero De Columnas No Puede Ser Cero", 3);
                txtNumeroFilas.setText("");
                txtNumeroColumnas.setText("");
                txtNumeroColumnas.requestFocusInWindow();
            } else if (nf > 13 && nc > 13) {
                Helper.mensaje(this, "El Numero De filas y el numero de columnas no pueden ser mayor que 13", 2);
                txtNumeroFilas.requestFocusInWindow();
            } else if (nf <= 5 && nc <= 5) {
                Helper.mensaje(this, "El numero de filas y el numero de columnas deben ser mayor a 5", nc);
                txtNumeroFilas.requestFocusInWindow();
            } else {
                tm = (DefaultTableModel) tblTablaInicial.getModel();
                tm2 = (DefaultTableModel) tblTablaResultado.getModel();

                tm.setRowCount(nf);
                tm.setColumnCount(nc);

                tm2.setRowCount(nf);
                tm2.setColumnCount(nc);

                nf = Integer.parseInt(txtNumeroFilas.getText());
                nc = Integer.parseInt(txtNumeroColumnas.getText());
                tm = (DefaultTableModel) tblTablaInicial.getModel();
                tm2 = (DefaultTableModel) tblTablaResultado.getModel();

                tm.setRowCount(nf);
                tm.setColumnCount(nc);

                tm2.setRowCount(nf);
                tm2.setColumnCount(nc);

                JButton botonesH[] = {cmdLlenarAutomatico, cmdLlenarManual, cmdLimpiar};
                JButton botonesD[] = {cmdCrear, cmdOperaciones};
                Helper.habilitarBotonoes(botonesH);
                Helper.deshabilitarBotonoes(botonesD);
            }
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLlenarManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarManualActionPerformed
        int nf, nc, n;

        int sw, res;
        nf = tblTablaInicial.getRowCount();
        nc = tblTablaInicial.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                do {
                    sw = 1;
                    try {
                        n = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite el elemento en la posicion[" + i + "] " + " [" + j + "]").trim());
                        tblTablaInicial.setValueAt(n, i, j);
                    } catch (NumberFormatException e) {
                        Helper.mensaje(this, "Digite un numero valido", 3);
                        sw = 0;
                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "¿seguro que deseas salir?", "Salir", JOptionPane.YES_NO_OPTION);
                        if (res == 0) {
                            sw = 1;
                            i = nf;
                            j = nc;
                            Helper.limpiadoTabla(tblTablaInicial);
                            Helper.limpiadoTabla(tblTablaResultado);

                        } else {
                            sw = 0;
                        }

                    }
                } while (sw == 0);
            }
        }
        JButton botonesH[] = {cmdOperaciones, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdLlenarManual, cmdLlenarAutomatico};

        Helper.habilitarBotonoes(botonesH);
        Helper.deshabilitarBotonoes(botonesD);
    }//GEN-LAST:event_cmdLlenarManualActionPerformed

    private void cmdLlenarAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarAutomaticoActionPerformed
        int nf, nc, n;
        nc = tblTablaInicial.getColumnCount();
        nf = tblTablaResultado.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                n = (int) (Math.random() * 50 + 1);
                tblTablaInicial.setValueAt(n, i, j);
            }
        }
        JButton botonesH[] = {cmdOperaciones, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdLlenarManual, cmdLlenarAutomatico};

        Helper.habilitarBotonoes(botonesH);
        Helper.deshabilitarBotonoes(botonesD);
    }//GEN-LAST:event_cmdLlenarAutomaticoActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtNumeroFilas.setText("");
        txtNumeroColumnas.setText("");
        txtNumeroFilas.requestFocusInWindow();
        cmbOperaciones.setSelectedIndex(0);

        Helper.porDefectoTabla(tblTablaInicial);
        Helper.porDefectoTabla(tblTablaResultado);
        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdLlenarManual, cmdLlenarAutomatico, cmdOperaciones};

        Helper.habilitarBotonoes(botonesH);
        Helper.deshabilitarBotonoes(botonesD);

    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionesActionPerformed
        int op = cmbOperaciones.getSelectedIndex();
        int nf, nc;
        nf = Integer.parseInt(txtNumeroFilas.getText());
        nc = Integer.parseInt(txtNumeroColumnas.getText());
        Helper.limpiadoTabla(tblTablaResultado);
        if (nf <= 5 || nf > 13) {
            Helper.mensaje(this, "Para Que Todas las letras y figruas se vean mejor \n"
                    + "El Numero De Filas Debe Ser Mayor A 5 o Menor O Igual A 13", 2);
        } else if (nc <= 5) {
            Helper.mensaje(this, "Para Que Todas Las letras y figuras se vean mejor \n"
                    + "El Numero De Columnas Debe Ser Mayor A 5 ", 2);
        } else {
            switch (op) {
                case 0:
                    if (nf % 2 == 0) {
                        Helper.mensaje(this, "Para Ver Mejor Esta Letra El Numero De Filas Debe Ser Impar ", 1);
                    } else {
                        Helper.letraB(tblTablaInicial, tblTablaResultado);
                    }
                    break;
                case 1:
                    if (nf % 2 == 0) {
                        Helper.mensaje(this, "Para Ver Mejor Esta Letra El Numero De Filas Debe Ser Impar ", 1);
                    } else {
                        Helper.letraK(tblTablaInicial, tblTablaResultado);
                    }
                    break;
                case 2:
                    if (nf % 2 == 0) {
                        Helper.mensaje(this, "Para Ver Mejor Esta Letra El Numero de Filas y Numero de Columnas Debe Ser Impar ", 1);
                    } else if (nf != nc) {
                        Helper.mensaje(this, "Para Ver Mejor La Letra Esta Letra El Numero de Filas y Numero de Columnas Debe Ser Igual ", 1);
                    } else {
                        Helper.letraM(tblTablaInicial, tblTablaResultado);
                    }
                    break;
                case 3:
                    if (nf % 2 == 0) {
                        Helper.mensaje(this, "Para Ver Mejor Esta Letra El Numero de Filas y Numero de Columnas Debe Ser Impar ", 1);
                    } else if (nf != nc) {
                        Helper.mensaje(this, "Para Ver Mejor La Letra ''W'' El Numero de Filas y Numero de Columnas Debe Ser Igual ", 1);
                    } else {
                        Helper.letraW(tblTablaInicial, tblTablaResultado);
                    }
                    break;
                case 4:
                    if (nf != nc) {
                        Helper.mensaje(this, "Para Ver Mejor La Letra Esta Letra El Numero de Filas y Numero de Columnas Debe Ser Igual ", 1);
                    } else {
                        Helper.letraQ(tblTablaInicial, tblTablaResultado);
                    }
                    break;
                case 5:
                    Helper.letraJ(tblTablaInicial, tblTablaResultado);
                    break;
                case 6:
                    Helper.letraG(tblTablaInicial, tblTablaResultado);
                    break;
                case 7:
                    if (nf != nc) {
                        Helper.mensaje(this, "Para Ver Mejor Esta Letra El Numero de Filas y Numero de Columnas Debe Ser Igual ", 1);
                    } else {
                        Helper.letraR(tblTablaInicial, tblTablaResultado);
                    }
                    break;
                case 8:
                    if (nf % 2 == 0) {
                        Helper.mensaje(this, "Para Ver Mejor Esta Figura El Numero de Filas y Numero de Columnas Deben Ser Impar ", 1);
                    }
                    if (nf != nc) {
                        Helper.mensaje(this, "Para Ver Mejor Esta Figura El Numero de Filas y Numero de Columnas Deben Ser Igual ", 1);
                    } else {
                        Helper.figura1(tblTablaInicial, tblTablaResultado);
                    }
                    break;
                case 9:
                    if (nf % 2 == 0) {
                        Helper.mensaje(this, "Para Ver Mejor Esta Figura El Numero de Filas y Numero de Columnas Deben Ser Impar ", 1);
                    }
                    if (nf != nc) {
                        Helper.mensaje(this, "Para Ver Mejor Esta Figura El Numero de Filas y Numero de Columnas Deben Ser Igual ", 1);
                    } else {
                        Helper.figura2(tblTablaInicial, tblTablaResultado);
                    }
                    break;
                case 10:
                    if (nf % 2 != 0) {
                        Helper.mensaje(this, "Para Ver Mejor Esta Figura El Numero de Filas y Numero de Columnas Deben Ser Pares ", 1);
                    }
                    if (nf != nc) {
                        Helper.mensaje(this, "Para Ver Mejor Esta Figura El Numero de Filas y Numero de Columnas Deben Ser Igual ", 1);
                    } else {
                        Helper.figura3(tblTablaInicial, tblTablaResultado);
                    }
                    break;
                case 11:
                    if (nf % 2 == 0) {
                        Helper.mensaje(this, "Para Ver Mejor Esta Figura El Numero de Filas y Numero de Columnas Deben Ser Impares ", 1);
                    }
                    if (nf != nc) {
                        Helper.mensaje(this, "Para Ver Mejor Esta Figura El Numero de Filas y Numero de Columnas Deben Ser Igual ", 1);
                    } else {
                        Helper.figura4(tblTablaInicial, tblTablaResultado);
                    }
                    break;
            }
        }
    }//GEN-LAST:event_cmdOperacionesActionPerformed

    private void txtNumeroFilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroFilasActionPerformed

    }//GEN-LAST:event_txtNumeroFilasActionPerformed

    private void txtNumeroFilasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroFilasKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroFilasKeyTyped

    private void txtNumeroColumnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroColumnasKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroColumnasKeyTyped

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
    private javax.swing.JComboBox<String> cmbOperaciones;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdLlenarAutomatico;
    private javax.swing.JButton cmdLlenarManual;
    private javax.swing.JButton cmdOperaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTable tblTablaResultado;
    private javax.swing.JTextField txtNumeroColumnas;
    private javax.swing.JTextField txtNumeroFilas;
    // End of variables declaration//GEN-END:variables
}
