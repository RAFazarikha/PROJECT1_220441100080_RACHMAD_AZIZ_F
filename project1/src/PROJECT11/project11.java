/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PROJECT11;

/**
 *
 * @author HP
 */
public class project11 extends javax.swing.JFrame {

    /**
     * Creates new form project11
     */
    public project11() {
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

        jk = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lnama = new javax.swing.JLabel();
        lalamat = new javax.swing.JLabel();
        lhp = new javax.swing.JLabel();
        lprodi = new javax.swing.JLabel();
        lfakultas = new javax.swing.JLabel();
        ljk = new javax.swing.JLabel();
        fprodi = new javax.swing.JTextField();
        fnama = new javax.swing.JTextField();
        falamat = new javax.swing.JTextField();
        fhp = new javax.swing.JTextField();
        ffakultas = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaalasan = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(181, 255, 217));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(23, 0, 85));
        jLabel1.setText("FORMULIR PENDAFTARAN UKM");

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(23, 0, 85));
        jLabel2.setText("UNIVERSITAS TRUNOJOYO MADURA");

        lnama.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        lnama.setForeground(new java.awt.Color(23, 0, 85));
        lnama.setLabelFor(fnama);
        lnama.setText("Nama :");

        lalamat.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        lalamat.setForeground(new java.awt.Color(23, 0, 85));
        lalamat.setLabelFor(falamat);
        lalamat.setText("Alamat :");

        lhp.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        lhp.setForeground(new java.awt.Color(23, 0, 85));
        lhp.setLabelFor(fhp);
        lhp.setText("No. HP :");

        lprodi.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        lprodi.setForeground(new java.awt.Color(23, 0, 85));
        lprodi.setLabelFor(fprodi);
        lprodi.setText("Prodi :");

        lfakultas.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        lfakultas.setForeground(new java.awt.Color(23, 0, 85));
        lfakultas.setLabelFor(ffakultas);
        lfakultas.setText("Fakultas :");

        ljk.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        ljk.setForeground(new java.awt.Color(23, 0, 85));
        ljk.setText("Jenis Kelamin :");

        fprodi.setBackground(new java.awt.Color(181, 255, 217));
        fprodi.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        fprodi.setForeground(new java.awt.Color(23, 0, 85));

        fnama.setBackground(new java.awt.Color(181, 255, 217));
        fnama.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        fnama.setForeground(new java.awt.Color(23, 0, 85));

        falamat.setBackground(new java.awt.Color(181, 255, 217));
        falamat.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        falamat.setForeground(new java.awt.Color(23, 0, 85));

        fhp.setBackground(new java.awt.Color(181, 255, 217));
        fhp.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        fhp.setForeground(new java.awt.Color(23, 0, 85));

        ffakultas.setBackground(new java.awt.Color(181, 255, 217));
        ffakultas.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        ffakultas.setForeground(new java.awt.Color(23, 0, 85));
        ffakultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- PILIH ---", "FAKULTAS TEKNIK", "FAKULTAS EKONOMI", "FAKULTAS HUKUM", "FAKULTAS PENDIDIKAN", "FAKULTAS KEISLAMAN", "FAKULTAS ILMU BUDAYA", "FAKULTAS PERTANIAN" }));

        jButton1.setBackground(new java.awt.Color(174, 0, 251));
        jButton1.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(23, 0, 85));
        jButton1.setText("SIMPAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnreset.setBackground(new java.awt.Color(174, 0, 251));
        btnreset.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btnreset.setForeground(new java.awt.Color(23, 0, 85));
        btnreset.setText("RESET");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btnkeluar.setBackground(new java.awt.Color(174, 0, 251));
        btnkeluar.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btnkeluar.setForeground(new java.awt.Color(23, 0, 85));
        btnkeluar.setText("KELUAR");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        jk.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(23, 0, 85));
        jRadioButton1.setText("LAKI-LAKI");

        jk.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(23, 0, 85));
        jRadioButton2.setText("PEREMPUAN");

        areaalasan.setBackground(new java.awt.Color(181, 255, 217));
        areaalasan.setColumns(20);
        areaalasan.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        areaalasan.setForeground(new java.awt.Color(23, 0, 85));
        areaalasan.setRows(5);
        areaalasan.setText("Tuliskan Alasanmu Ikut UKM........");
        areaalasan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                areaalasanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(areaalasan);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lnama)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fnama, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lalamat)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(falamat, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lhp)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fhp, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lprodi)
                                .addComponent(lfakultas))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fprodi)
                                .addComponent(ffakultas, 0, 199, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnreset))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(ljk)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton1)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jRadioButton2)
                                .addComponent(btnkeluar)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnama)
                    .addComponent(fnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lalamat)
                    .addComponent(falamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lhp)
                    .addComponent(fhp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lfakultas)
                    .addComponent(ffakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fprodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lprodi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ljk)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnreset)
                    .addComponent(btnkeluar))
                .addContainerGap())
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
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        fnama.setText("");
        falamat.setText("");
        fhp.setText("");
        fprodi.setText("");
        areaalasan.setText("");
        jk.clearSelection();
        ffakultas.setSelectedIndex(0);
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void areaalasanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areaalasanMouseClicked
        // TODO add your handling code here:
        if(areaalasan.getText().equals("Tuliskan Alasanmu Ikut UKM........")){
            areaalasan.setText("");
        }
    }//GEN-LAST:event_areaalasanMouseClicked

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
            java.util.logging.Logger.getLogger(project11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(project11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(project11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(project11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new project11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaalasan;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnreset;
    private javax.swing.JTextField falamat;
    private javax.swing.JComboBox<String> ffakultas;
    private javax.swing.JTextField fhp;
    private javax.swing.JTextField fnama;
    private javax.swing.JTextField fprodi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup jk;
    private javax.swing.JLabel lalamat;
    private javax.swing.JLabel lfakultas;
    private javax.swing.JLabel lhp;
    private javax.swing.JLabel ljk;
    private javax.swing.JLabel lnama;
    private javax.swing.JLabel lprodi;
    // End of variables declaration//GEN-END:variables
}
