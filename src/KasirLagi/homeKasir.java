/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package KasirLagi;

import UILogin.Koneksi;
import UILogin.UserProfile;
import UILogin.logout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author LENOVO
 */
public class homeKasir extends javax.swing.JFrame {

    UserProfile u;

    /**
     * Creates new form inputKasir
     */
    public homeKasir() {
        initComponents();

        updateTotalTransaksi1();
        updateTotalProduk1();
    }

    public homeKasir(UILogin.UserProfile up) {
        initComponents();

        if (up != null) {
            this.u = up;
            // Debugging output untuk memastikan getFullname() mengembalikan nilai yang benar
            System.out.println("Full name: " + u.getFullname());
            txtNamaProfile10000.setText(u.getFullname()); // Pastikan txtNamaProfile10000 ada
            txtLevel10000.setText(u.getLevel());
        } else {
            System.out.println("UserProfile is null");
        }

        updateTotalTransaksi1();
        updateTotalProduk1();
        getNamaProdukTerlaris();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNamaProfile10000 = new javax.swing.JLabel();
        txtLevel10000 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        btnLaporanHarian = new rojeru_san.complementos.RSButtonHover();
        btnLogout1 = new rojeru_san.complementos.RSButtonHover();
        btnHome1 = new rojeru_san.complementos.RSButtonHover();
        btnHome2 = new rojeru_san.complementos.RSButtonHover();
        jPanel2 = new javax.swing.JPanel();
        pnlTransaksi = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ttlTransaksi2 = new javax.swing.JLabel();
        pnlProduk = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ttlProduk2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabelProdukTerlaris = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(12, 139, 139));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("(Kasir)");
        jLabel2.setToolTipText("");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Point Of Sales");
        jLabel3.setToolTipText("");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        header.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtNamaProfile10000.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        txtNamaProfile10000.setForeground(new java.awt.Color(240, 240, 240));
        txtNamaProfile10000.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtNamaProfile10000.setText("Nama");
        header.add(txtNamaProfile10000, new org.netbeans.lib.awtextra.AbsoluteConstraints(1089, 25, 120, 23));

        txtLevel10000.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtLevel10000.setForeground(new java.awt.Color(240, 240, 240));
        txtLevel10000.setText("Role");
        header.add(txtLevel10000, new org.netbeans.lib.awtextra.AbsoluteConstraints(1183, 54, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PROFILE.png"))); // NOI18N
        header.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 20, -1, -1));

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1681, 90));

        sidebar.setBackground(new java.awt.Color(51, 51, 51));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLaporanHarian.setBackground(new java.awt.Color(51, 51, 51));
        btnLaporanHarian.setText("Laporan Harian");
        btnLaporanHarian.setColorHover(new java.awt.Color(102, 102, 102));
        btnLaporanHarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaporanHarianActionPerformed(evt);
            }
        });
        sidebar.add(btnLaporanHarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 220, 50));

        btnLogout1.setBackground(new java.awt.Color(255, 51, 51));
        btnLogout1.setText("LOGOUT");
        btnLogout1.setColorHover(new java.awt.Color(153, 0, 0));
        btnLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout1ActionPerformed(evt);
            }
        });
        sidebar.add(btnLogout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 220, -1));

        btnHome1.setBackground(new java.awt.Color(102, 102, 102));
        btnHome1.setText("Home");
        btnHome1.setColorHover(new java.awt.Color(102, 102, 102));
        btnHome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome1ActionPerformed(evt);
            }
        });
        sidebar.add(btnHome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 50));

        btnHome2.setBackground(new java.awt.Color(51, 51, 51));
        btnHome2.setText("Input");
        btnHome2.setColorHover(new java.awt.Color(102, 102, 102));
        btnHome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome2ActionPerformed(evt);
            }
        });
        sidebar.add(btnHome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 220, 50));

        getContentPane().add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 96, -1, 972));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        pnlTransaksi.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(0, 153, 153));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Total Transaksi");
        jLabel5.setOpaque(true);

        ttlTransaksi2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ttlTransaksi2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ttlTransaksi2.setText("--");

        javax.swing.GroupLayout pnlTransaksiLayout = new javax.swing.GroupLayout(pnlTransaksi);
        pnlTransaksi.setLayout(pnlTransaksiLayout);
        pnlTransaksiLayout.setHorizontalGroup(
            pnlTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ttlTransaksi2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTransaksiLayout.setVerticalGroup(
            pnlTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransaksiLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ttlTransaksi2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(pnlTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 260, 130));

        pnlProduk.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(0, 153, 153));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Total Produk");
        jLabel6.setOpaque(true);

        ttlProduk2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ttlProduk2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ttlProduk2.setText("--");

        javax.swing.GroupLayout pnlProdukLayout = new javax.swing.GroupLayout(pnlProduk);
        pnlProduk.setLayout(pnlProdukLayout);
        pnlProdukLayout.setHorizontalGroup(
            pnlProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProdukLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ttlProduk2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlProdukLayout.setVerticalGroup(
            pnlProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdukLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ttlProduk2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(pnlProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 260, 130));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setBackground(new java.awt.Color(0, 153, 153));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Produk Terlaris");
        jLabel8.setOpaque(true);

        jLabelProdukTerlaris.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelProdukTerlaris.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProdukTerlaris.setText("--");
        jLabelProdukTerlaris.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelProdukTerlaris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelProdukTerlaris, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 120, -1, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLaporanHarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporanHarianActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        KasirLagi.laporanKasir l = new KasirLagi.laporanKasir(u);
        l.setVisible(true);
        l.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_btnLaporanHarianActionPerformed

    private void btnLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout1ActionPerformed
        logout.Logout(this);
    }//GEN-LAST:event_btnLogout1ActionPerformed

    private void btnHome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome1ActionPerformed

    private void btnHome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        KasirLagi.inputKasir l = new KasirLagi.inputKasir(u);
        l.setVisible(true);
        l.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_btnHome2ActionPerformed

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
            java.util.logging.Logger.getLogger(homeKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeKasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btnHome1;
    private rojeru_san.complementos.RSButtonHover btnHome2;
    private rojeru_san.complementos.RSButtonHover btnLaporanHarian;
    private rojeru_san.complementos.RSButtonHover btnLogout1;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelProdukTerlaris;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel pnlProduk;
    private javax.swing.JPanel pnlTransaksi;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel ttlProduk2;
    private javax.swing.JLabel ttlTransaksi2;
    private javax.swing.JLabel txtLevel10000;
    private javax.swing.JLabel txtNamaProfile10000;
    // End of variables declaration//GEN-END:variables

    private void updateTotalTransaksi1() {
        try {
            // Koneksi ke database
            Connection conn = Koneksi.Go();

            // Query SQL untuk menghitung jumlah transaksi
            String query = "SELECT COUNT(*) AS total_transaksi FROM transaksi";
            PreparedStatement stmt = conn.prepareStatement(query);

            // Eksekusi query
            ResultSet rs = stmt.executeQuery();

            // Update JLabel dengan hasil query
            if (rs.next()) {
                int totalTransaksi = rs.getInt("total_transaksi");
                ttlTransaksi2.setText(String.valueOf(totalTransaksi));
            } else {
                ttlTransaksi2.setText("0");
            }

            // Tutup koneksi
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            ttlTransaksi2.setText("Error");
        }
    }

    private void updateTotalProduk1() {
        try {
            // Koneksi ke database
            Connection conn = Koneksi.Go();

            // Query SQL untuk menghitung jumlah transaksi
            String query = "SELECT COUNT(*) AS total_produk FROM produk";
            PreparedStatement stmt = conn.prepareStatement(query);

            // Eksekusi query
            ResultSet rs = stmt.executeQuery();

            // Update JLabel dengan hasil query
            if (rs.next()) {
                int totalTransaksi = rs.getInt("total_produk");
                ttlProduk2.setText(String.valueOf(totalTransaksi));
            } else {
                ttlProduk2.setText("0");
            }

            // Tutup koneksi
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            ttlProduk2.setText("Error");
        }
    }

    private void getNamaProdukTerlaris() {
    try {
        // Koneksi ke database
        Connection conn = Koneksi.Go();

        // Query SQL untuk mendapatkan produk terlaris
        String query = "SELECT "
                + "    p.nama_produk "
                + "FROM "
                + "    transaksi_detail td "
                + "JOIN "
                + "    produk p ON td.produk_detail_id = p.id "
                + "GROUP BY "
                + "    p.nama_produk "
                + "ORDER BY "
                + "    SUM(td.jumlah) DESC "
                + "LIMIT 1";
        PreparedStatement stmt = conn.prepareStatement(query);

        // Eksekusi query
        ResultSet rs = stmt.executeQuery();

        // Update JLabel dengan hasil query
        if (rs.next()) {
            String produkTerlaris = rs.getString("nama_produk");
            jLabelProdukTerlaris.setText(produkTerlaris);
        } else {
            jLabelProdukTerlaris.setText("Tidak ada data.");
        }

        // Tutup koneksi dan sumber daya
        rs.close();
        stmt.close();
        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
        jLabelProdukTerlaris.setText("Error");
    }
}

}
