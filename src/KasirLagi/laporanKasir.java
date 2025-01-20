/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package KasirLagi;

import UILogin.UserProfile;
import UILogin.Koneksi;
import UILogin.logout;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author LENOVO
 */
public class laporanKasir extends javax.swing.JFrame {

    UserProfile u;

    /**
     * Creates new form inputKasir
     */
    public laporanKasir() {
        initComponents();
        
        
        tblCartHarian.getColumnModel().getColumn(1).setMinWidth(0);
        tblCartHarian.getColumnModel().getColumn(1).setMaxWidth(0);
    }
    
     

    public laporanKasir(UILogin.UserProfile up) {
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
        
        tblCartHarian.getColumnModel().getColumn(1).setMinWidth(0);
        tblCartHarian.getColumnModel().getColumn(1).setMaxWidth(0);

    }

    private void loadLaporanHarian(Date tglDariSQL, Date tglSampaiSQL) {
        // Ambil tanggal dari tglDari dan tglSampai
        java.util.Date dateDari = tglDari.getDate();
        java.util.Date dateSampai = tglSampai.getDate();

        if (dateDari == null || dateSampai == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Harap pilih tanggal awal dan akhir.");
            return;
        }

        java.sql.Date sqlDateDari = new java.sql.Date(dateDari.getTime());
        java.sql.Date sqlDateSampai = new java.sql.Date(dateSampai.getTime());

        DefaultTableModel model = (DefaultTableModel) tblCartHarian.getModel();
        model.setRowCount(0); // Hapus data lama

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = Koneksi.Go(); // Pastikan koneksi ini sesuai dengan implementasi Anda
            stmt = conn.createStatement();
            String query = "SELECT td.id, td.waktu_transaksi, a.fullname AS kasir, td.total " +
               "FROM transaksi_detail td " +
               "JOIN akun a ON td.kasir_id = a.id " +
               "WHERE td.waktu_transaksi BETWEEN '" + sqlDateDari + "' AND '" + sqlDateSampai + "'";

            rs = stmt.executeQuery(query);

            int no = 1;
            double totalHarga = 0;

            while (rs.next()) {
                Object[] row = new Object[]{
                    no++,
                    rs.getString("id"),
                    rs.getDate("waktu_transaksi"),
                    rs.getString("kasir"),
                    rs.getInt("total")
                };
                model.addRow(row);
                totalHarga += rs.getDouble("total");
            }

            lblTotalHarga.setText(String.format("Rp %.2f", totalHarga));

        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat memuat data: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        
        tblCartHarian.getColumnModel().getColumn(1).setMinWidth(0);
        tblCartHarian.getColumnModel().getColumn(1).setMaxWidth(0);
    }

    private void updateLaporanHarian() {
        java.util.Date dari = tglDari.getDate();
        java.util.Date sampai = tglSampai.getDate();
        
        

        if (dari != null && sampai != null) {
            Date tglDariSQL = new Date(dari.getTime());
            Date tglSampaiSQL = new Date(sampai.getTime());
            loadLaporanHarian(tglDariSQL, tglSampaiSQL);
        } else {
            // Kosongkan tabel jika salah satu tanggal belum dipilih
            DefaultTableModel model = (DefaultTableModel) tblCartHarian.getModel();
            model.setRowCount(0);
            lblTotalHarga.setText("Rp 0");
        }
        
        tblCartHarian.getColumnModel().getColumn(1).setMinWidth(0);
        tblCartHarian.getColumnModel().getColumn(1).setMaxWidth(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNamaProfile10000 = new javax.swing.JLabel();
        txtLevel10000 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        btnHome = new rojeru_san.complementos.RSButtonHover();
        btnLogout1 = new rojeru_san.complementos.RSButtonHover();
        btnHome1 = new rojeru_san.complementos.RSButtonHover();
        btnHome2 = new rojeru_san.complementos.RSButtonHover();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCartHarian = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblTotalHarga = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tglDari = new com.toedter.calendar.JDateChooser();
        tglSampai = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNamaProfile10000.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        txtNamaProfile10000.setForeground(new java.awt.Color(240, 240, 240));
        txtNamaProfile10000.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtNamaProfile10000.setText("Nama");
        getContentPane().add(txtNamaProfile10000, new org.netbeans.lib.awtextra.AbsoluteConstraints(1089, 25, 120, 23));

        txtLevel10000.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtLevel10000.setForeground(new java.awt.Color(240, 240, 240));
        txtLevel10000.setText("Role");
        getContentPane().add(txtLevel10000, new org.netbeans.lib.awtextra.AbsoluteConstraints(1183, 54, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PROFILE.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 20, -1, -1));

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

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2602, 90));

        sidebar.setBackground(new java.awt.Color(51, 51, 51));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.setBackground(new java.awt.Color(102, 102, 102));
        btnHome.setText("Laporan Harian");
        btnHome.setColorHover(new java.awt.Color(102, 102, 102));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        sidebar.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 220, 50));

        btnLogout1.setBackground(new java.awt.Color(255, 51, 51));
        btnLogout1.setText("LOGOUT");
        btnLogout1.setColorHover(new java.awt.Color(153, 0, 0));
        btnLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout1ActionPerformed(evt);
            }
        });
        sidebar.add(btnLogout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 220, -1));

        btnHome1.setBackground(new java.awt.Color(51, 51, 51));
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

        tblCartHarian.setBackground(new java.awt.Color(204, 204, 204));
        tblCartHarian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "ID", "Tanggal", "Kasir", "Total"
            }
        ));
        jScrollPane1.setViewportView(tblCartHarian);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 1110, 280));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Total Harga");

        lblTotalHarga.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTotalHarga.setForeground(new java.awt.Color(255, 0, 0));
        lblTotalHarga.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalHarga)
                    .addComponent(jLabel4))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 670, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Laporan Keuangan");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 96, 320, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Filter Laporan Keuangan");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 21, -1, 28));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Sampai");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, 28));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Dari");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 55, -1, 28));

        jSeparator1.setForeground(new java.awt.Color(51, 102, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, 15));

        tglDari.setDateFormatString("y-MM-dd");
        tglDari.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tglDariPropertyChange(evt);
            }
        });
        jPanel2.add(tglDari, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 207, 40));

        tglSampai.setDateFormatString("y-MM-dd");
        tglSampai.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tglSampaiPropertyChange(evt);
            }
        });
        jPanel2.add(tglSampai, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 207, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 146, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField3.setText("25/11/2004");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 40, 187, 37));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Data Penjualan");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 28));

        jTextField4.setText("30/11/2004");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 83, 187, 37));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Sampai Tanggal :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 83, -1, 28));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Dari Tanggal :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 43, -1, 28));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2180, 310, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(51, 102, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1058, 146, 1470, -1));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(51, 102, 255));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 1470, 15));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout1ActionPerformed
        logout.Logout(this);
    }//GEN-LAST:event_btnLogout1ActionPerformed

    private void btnHome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        KasirLagi.homeKasir l = new KasirLagi.homeKasir(u);
        l.setVisible(true);
        l.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_btnHome1ActionPerformed

    private void btnHome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        inputKasir l = new inputKasir(u);
        l.setVisible(true);
        l.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_btnHome2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void tglDariPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tglDariPropertyChange
        if ("date".equals(evt.getPropertyName())) {
            updateLaporanHarian();
        }
    }//GEN-LAST:event_tglDariPropertyChange

    private void tglSampaiPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tglSampaiPropertyChange
        if ("date".equals(evt.getPropertyName())) { // Pastikan hanya dijalankan saat properti "date" berubah
            updateLaporanHarian();
        }
    }//GEN-LAST:event_tglSampaiPropertyChange

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeKasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btnHome;
    private rojeru_san.complementos.RSButtonHover btnHome1;
    private rojeru_san.complementos.RSButtonHover btnHome2;
    private rojeru_san.complementos.RSButtonHover btnLogout1;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblTotalHarga;
    private javax.swing.JPanel sidebar;
    private static javax.swing.JTable tblCartHarian;
    private com.toedter.calendar.JDateChooser tglDari;
    private com.toedter.calendar.JDateChooser tglSampai;
    private javax.swing.JLabel txtLevel10000;
    private javax.swing.JLabel txtNamaProfile10000;
    // End of variables declaration//GEN-END:variables

    

}
