package Admin;

import UILogin.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import UILogin.UserProfile;
import UILogin.login;
import UILogin.windows;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import java.sql.SQLException;
import javax.swing.JLabel;

public class DashAdm_Home extends javax.swing.JFrame {

    UserProfile u;

    /**
     * Creates new form OwnerPage
     */
    public DashAdm_Home() {
        initComponents();

        //fullscreen
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        updateTotalTransaksi();
        updateTotalProduk();
        updateTotalUser();

        windows.setCustomTitle(this, "Dashboard Admin");
    }

    public DashAdm_Home(UserProfile up) {
        initComponents();

        this.u = up;
//        txtNamaProfile.setText(u.getFullname());
//        txtLevel.setText(u.getLevel());

        if (this.u != null) {
            txtNamaProfile.setText(u.getFullname());
            txtLevel.setText(u.getLevel());
        }
        updateTotalTransaksi();
        updateTotalProduk();
        updateTotalUser();

//        txtTextNama.setText(u.getFullname());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        PanelUtama = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        txtNamaProfile = new javax.swing.JLabel();
        txtLevel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        btnProduk = new rojeru_san.complementos.RSButtonHover();
        btnHome = new rojeru_san.complementos.RSButtonHover();
        btnAkun = new rojeru_san.complementos.RSButtonHover();
        btnLogout1 = new rojeru_san.complementos.RSButtonHover();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlTransaksi = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ttlTransaksi1 = new javax.swing.JLabel();
        pnlUser = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ttlUser = new javax.swing.JLabel();
        pnlProduk = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ttlProduk = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Halaman Owner");

        PanelUtama.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(12, 139, 139));
        header.setAlignmentX(0.0F);
        header.setAlignmentY(0.0F);
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNamaProfile.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        txtNamaProfile.setForeground(new java.awt.Color(240, 240, 240));
        txtNamaProfile.setText("Nama");
        header.add(txtNamaProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(1149, 25, -1, 23));

        txtLevel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtLevel.setForeground(new java.awt.Color(240, 240, 240));
        txtLevel.setText("Role");
        header.add(txtLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1183, 54, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PROFILE.png"))); // NOI18N
        header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Point Of Sales");
        jLabel2.setToolTipText("");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 17, -1, -1));

        PanelUtama.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1380, 90));
        header.getAccessibleContext().setAccessibleName("jj");

        sidebar.setBackground(new java.awt.Color(51, 51, 51));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProduk.setBackground(new java.awt.Color(51, 51, 51));
        btnProduk.setText("Produk");
        btnProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdukActionPerformed(evt);
            }
        });
        sidebar.add(btnProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 220, 50));

        btnHome.setBackground(new java.awt.Color(102, 102, 102));
        btnHome.setText("Home");
        btnHome.setColorHover(new java.awt.Color(102, 102, 102));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        sidebar.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 50));

        btnAkun.setBackground(new java.awt.Color(51, 51, 51));
        btnAkun.setText("Akun");
        btnAkun.setColorHover(new java.awt.Color(102, 102, 102));
        btnAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAkunActionPerformed(evt);
            }
        });
        sidebar.add(btnAkun, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 220, 50));

        btnLogout1.setBackground(new java.awt.Color(255, 51, 51));
        btnLogout1.setText("LOGOUT");
        btnLogout1.setColorHover(new java.awt.Color(153, 0, 0));
        btnLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout1ActionPerformed(evt);
            }
        });
        sidebar.add(btnLogout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 220, -1));

        PanelUtama.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 83, -1, 940));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        PanelUtama.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 220, -1));
        PanelUtama.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 140, -1, 30));

        pnlTransaksi.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(0, 153, 153));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Total Transaksi");
        jLabel4.setOpaque(true);

        ttlTransaksi1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ttlTransaksi1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ttlTransaksi1.setText("--");

        javax.swing.GroupLayout pnlTransaksiLayout = new javax.swing.GroupLayout(pnlTransaksi);
        pnlTransaksi.setLayout(pnlTransaksiLayout);
        pnlTransaksiLayout.setHorizontalGroup(
            pnlTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ttlTransaksi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTransaksiLayout.setVerticalGroup(
            pnlTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransaksiLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ttlTransaksi1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        PanelUtama.add(pnlTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 260, 130));

        pnlUser.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(0, 153, 153));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Total User");
        jLabel6.setOpaque(true);

        ttlUser.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ttlUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ttlUser.setText("--");

        javax.swing.GroupLayout pnlUserLayout = new javax.swing.GroupLayout(pnlUser);
        pnlUser.setLayout(pnlUserLayout);
        pnlUserLayout.setHorizontalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ttlUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlUserLayout.setVerticalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ttlUser, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        PanelUtama.add(pnlUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 120, 260, 130));

        pnlProduk.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(0, 153, 153));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Total Produk");
        jLabel5.setOpaque(true);

        ttlProduk.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ttlProduk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ttlProduk.setText("--");

        javax.swing.GroupLayout pnlProdukLayout = new javax.swing.GroupLayout(pnlProduk);
        pnlProduk.setLayout(pnlProdukLayout);
        pnlProdukLayout.setHorizontalGroup(
            pnlProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProdukLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ttlProduk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlProdukLayout.setVerticalGroup(
            pnlProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdukLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ttlProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        PanelUtama.add(pnlProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 260, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Halaman Admin");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdukActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        DashAdm_Produk l = new DashAdm_Produk(u);
        l.setVisible(true);
        l.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_btnProdukActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAkunActionPerformed
        this.setVisible(false);
        DashAdm_Akun l = new DashAdm_Akun(u);
        l.setVisible(true);
        l.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }//GEN-LAST:event_btnAkunActionPerformed

    private void btnLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout1ActionPerformed
        this.setVisible(false);
        login l = new login();
        l.setVisible(true);
        l.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_btnLogout1ActionPerformed

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
            java.util.logging.Logger.getLogger(DashAdm_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashAdm_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashAdm_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashAdm_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashAdm_Home().setVisible(true);
//                this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelUtama;
    private rojeru_san.complementos.RSButtonHover btnAkun;
    private rojeru_san.complementos.RSButtonHover btnHome;
    private rojeru_san.complementos.RSButtonHover btnLogout1;
    private rojeru_san.complementos.RSButtonHover btnProduk;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlProduk;
    private javax.swing.JPanel pnlTransaksi;
    private javax.swing.JPanel pnlUser;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel ttlProduk;
    private javax.swing.JLabel ttlTransaksi1;
    private javax.swing.JLabel ttlUser;
    private javax.swing.JLabel txtLevel;
    private javax.swing.JLabel txtNamaProfile;
    // End of variables declaration//GEN-END:variables

    private void updateTotalTransaksi() {
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
                ttlTransaksi1.setText(String.valueOf(totalTransaksi));
            } else {
                ttlTransaksi1.setText("0");
            }

            // Tutup koneksi
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            ttlTransaksi1.setText("Error");
        }
    }

    private void updateTotalProduk() {
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
                ttlProduk.setText(String.valueOf(totalTransaksi));
            } else {
                ttlProduk.setText("0");
            }

            // Tutup koneksi
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            ttlProduk.setText("Error");
        }
    }

    private void updateTotalUser() {
        try {
            // Koneksi ke database
            Connection conn = Koneksi.Go();

            // Query SQL untuk menghitung jumlah transaksi
            String query = "SELECT COUNT(*) AS total_user FROM akun";
            PreparedStatement stmt = conn.prepareStatement(query);

            // Eksekusi query
            ResultSet rs = stmt.executeQuery();

            // Update JLabel dengan hasil query
            if (rs.next()) {
                int totalTransaksi = rs.getInt("total_user");
                ttlUser.setText(String.valueOf(totalTransaksi));
            } else {
                ttlUser.setText("0");
            }

            // Tutup koneksi
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            ttlUser.setText("Error");
        }
    }

//    private void setCustomTitle(String title) {
//        this.setTitle(title);
//    }
}
