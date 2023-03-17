package cacl;

public class principal extends javax.swing.JFrame {

    String operador = "";
    boolean CambioEstado = false;
    float valor1 = 0, valor2 = 0;

    public principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        BCE = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        Bigual = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Lresultado = new javax.swing.JLabel();
        Lresultado2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setLayout(new java.awt.GridLayout(4, 0));

        B1.setBackground(new java.awt.Color(255, 255, 204));
        B1.setFont(new java.awt.Font("Ravie", 0, 36)); // NOI18N
        B1.setText("1");
        B1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        jPanel2.add(B1);

        B2.setBackground(new java.awt.Color(255, 255, 204));
        B2.setFont(new java.awt.Font("Ravie", 0, 36)); // NOI18N
        B2.setText("2");
        B2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        jPanel2.add(B2);

        B3.setBackground(new java.awt.Color(255, 255, 204));
        B3.setFont(new java.awt.Font("Ravie", 0, 36)); // NOI18N
        B3.setText("3");
        B3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(B3);

        B4.setBackground(new java.awt.Color(255, 255, 204));
        B4.setFont(new java.awt.Font("Ravie", 0, 36)); // NOI18N
        B4.setText("4");
        B4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(B4);

        B5.setBackground(new java.awt.Color(255, 255, 204));
        B5.setFont(new java.awt.Font("Ravie", 0, 36)); // NOI18N
        B5.setText("5");
        B5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(B5);

        B6.setBackground(new java.awt.Color(255, 255, 204));
        B6.setFont(new java.awt.Font("Ravie", 0, 36)); // NOI18N
        B6.setText("6");
        B6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(B6);

        jButton7.setBackground(new java.awt.Color(255, 255, 204));
        jButton7.setFont(new java.awt.Font("Ravie", 0, 36)); // NOI18N
        jButton7.setText("7");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jButton7);

        jButton8.setBackground(new java.awt.Color(255, 255, 204));
        jButton8.setFont(new java.awt.Font("Ravie", 0, 36)); // NOI18N
        jButton8.setText("8");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jButton8);

        jButton9.setBackground(new java.awt.Color(255, 255, 204));
        jButton9.setFont(new java.awt.Font("Ravie", 0, 36)); // NOI18N
        jButton9.setText("9");
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jButton9);

        BCE.setFont(new java.awt.Font("Ravie", 0, 36)); // NOI18N
        BCE.setText("CE");
        BCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCEActionPerformed(evt);
            }
        });
        jPanel2.add(BCE);

        jButton11.setBackground(new java.awt.Color(255, 255, 204));
        jButton11.setFont(new java.awt.Font("Ravie", 0, 36)); // NOI18N
        jButton11.setText("0");
        jButton11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jButton11);

        Bigual.setFont(new java.awt.Font("Ravie", 0, 36)); // NOI18N
        Bigual.setText("=");
        Bigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BigualActionPerformed(evt);
            }
        });
        jPanel2.add(Bigual);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(70, 140, 400, 390);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Lresultado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        Lresultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        Lresultado2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Lresultado2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Lresultado2, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                    .addComponent(Lresultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(Lresultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(60, 20, 420, 90);

        jPanel3.setLayout(new java.awt.GridLayout(4, 1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton3.setText("*");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton4.setText("/");
        jPanel3.add(jButton4);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(480, 140, 100, 380);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\CURLING\\Pictures\\fondoNumeros.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 0, 640, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        Lresultado.setText(Lresultado.getText() + "1");
        AlmacenarValores();


    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        Lresultado.setText(Lresultado.getText() + "2");
        AlmacenarValores();
    }//GEN-LAST:event_B2ActionPerformed

    private void BCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCEActionPerformed
        Lresultado.setText("");
        valor1 = 0;
        valor2 = 0;
    }//GEN-LAST:event_BCEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CambioEstado = true;
        operador = "+";

       Lresultado.setText("");
        Lresultado2.setText(String.valueOf(valor1) + " " +operador);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CambioEstado = true;
        operador = "-";
        Lresultado2.setText(String.valueOf(valor1) + " " +operador);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BigualActionPerformed
        float total = 0;
        valor2 = Float.parseFloat(Lresultado.getText());
        switch (operador) {
            case "+":
                total = (valor1 + valor2);
                break;
            case "-":
                total = valor1 - valor2;
                break;
            case "*":
                total = valor1 * valor2;
                break;
            case "/":
                total = valor1 / valor2;
                break;
        }
        Lresultado2.setText(String.valueOf(valor1)+ " " + operador + String.valueOf(valor2) + " =");
        Lresultado.setText(String.valueOf(total));
        valor1 = total;
        valor2 = 0;
    }//GEN-LAST:event_BigualActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CambioEstado = true;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void AlmacenarValores() {
        if (CambioEstado == false) {
            valor1 = Float.parseFloat(Lresultado.getText());
        } else {
            valor2 = Float.parseFloat(Lresultado.getText());
        }
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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton BCE;
    private javax.swing.JButton Bigual;
    private javax.swing.JLabel Lresultado;
    private javax.swing.JLabel Lresultado2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
