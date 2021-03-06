package tampilan;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import koneksi.Koneksi;
/**
 * MUH, SYAHRUL WAJHULLAH JASMAN 123170094
 * PRUDENCA AHMAD DAFFA 123190005
 */
public class Mobil extends javax.swing.JFrame {
    
    private Connection conn = new Koneksi().connect();
    private DefaultTableModel tabmode;

    /** Creates new form Dashboard */
    public Mobil() {
        initComponents();
        String[] judul = {
            "No.","Nama", "Nomor Plat", "Jumlah Kursi", "Tahun Produksi", "Status"
        };
        tabmode = new DefaultTableModel(judul, 0);
        tableMobil.setModel(tabmode);
        tampilkan();
        int row = tableMobil.getRowCount();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupStatus = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnDaftarSopir = new javax.swing.JButton();
        btnDaftarPelanggan = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMobil = new javax.swing.JTable();
        btnHapus = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fieldNama = new javax.swing.JTextField();
        fieldPlat = new javax.swing.JTextField();
        fieldKursi = new javax.swing.JTextField();
        comboTahun = new javax.swing.JComboBox<>();
        radioTersedia = new javax.swing.JRadioButton();
        radioDisewa = new javax.swing.JRadioButton();
        btnClear = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(222, 222, 222));
        setForeground(java.awt.Color.white);
        setLocation(new java.awt.Point(0, 0));

        jPanel1.setBackground(new java.awt.Color(51, 85, 139));
        jPanel1.setForeground(new java.awt.Color(51, 85, 139));
        jPanel1.setPreferredSize(new java.awt.Dimension(189, 600));

        jPanel2.setBackground(new java.awt.Color(39, 73, 127));

        btnDaftarSopir.setBackground(new java.awt.Color(51, 85, 139));
        btnDaftarSopir.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnDaftarSopir.setForeground(new java.awt.Color(254, 254, 254));
        btnDaftarSopir.setText("Daftar Sopir");
        btnDaftarSopir.setPreferredSize(new java.awt.Dimension(128, 38));
        btnDaftarSopir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarSopirActionPerformed(evt);
            }
        });

        btnDaftarPelanggan.setBackground(new java.awt.Color(51, 85, 139));
        btnDaftarPelanggan.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnDaftarPelanggan.setForeground(new java.awt.Color(254, 254, 254));
        btnDaftarPelanggan.setText("Daftar Pelanggan");
        btnDaftarPelanggan.setPreferredSize(new java.awt.Dimension(165, 38));
        btnDaftarPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarPelangganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDaftarSopir, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(btnDaftarPelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDaftarSopir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDaftarPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnDashboard.setBackground(new java.awt.Color(51, 85, 139));
        btnDashboard.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(254, 254, 254));
        btnDashboard.setText("Dashboard");
        btnDashboard.setMaximumSize(new java.awt.Dimension(128, 38));
        btnDashboard.setPreferredSize(new java.awt.Dimension(128, 38));
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setBackground(new java.awt.Color(149, 166, 176));
        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(69, 79, 101));
        jLabel3.setText("Daftar Mobil");

        btnTambah.setBackground(new java.awt.Color(51, 85, 139));
        btnTambah.setForeground(new java.awt.Color(254, 254, 254));
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus.png"))); // NOI18N
        btnTambah.setText("Tambah Mobil");
        btnTambah.setPreferredSize(new java.awt.Dimension(98, 32));
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        tableMobil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Nama", "Nomor Plat", "Jumlah Kursi", "Tahun Produksi", "Status"
            }
        ));
        tableMobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMobilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMobil);

        btnHapus.setBackground(new java.awt.Color(51, 85, 139));
        btnHapus.setForeground(new java.awt.Color(254, 254, 254));
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cross.png"))); // NOI18N
        btnHapus.setText("Hapus Mobil");
        btnHapus.setPreferredSize(new java.awt.Dimension(98, 32));
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(51, 85, 139));
        btnEdit.setForeground(new java.awt.Color(254, 254, 254));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edit.png"))); // NOI18N
        btnEdit.setText("Edit Mobil");
        btnEdit.setPreferredSize(new java.awt.Dimension(98, 32));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel4.setText("Nama                 :");

        jLabel5.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel5.setText("No. Plat             :");

        jLabel6.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel6.setText("Jumlah Kursi      :");

        jLabel7.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel7.setText("Tahun Produksi :");

        jLabel8.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel8.setText("Status                 :");

        fieldNama.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N

        fieldPlat.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N

        fieldKursi.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N

        comboTahun.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        comboTahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2015", "2016", "2017", "2018", "2019", "2020", "2021" }));
        comboTahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTahunActionPerformed(evt);
            }
        });

        groupStatus.add(radioTersedia);
        radioTersedia.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        radioTersedia.setText("Tersedia");

        groupStatus.add(radioDisewa);
        radioDisewa.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        radioDisewa.setText("Disewa");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldNama)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(radioTersedia)
                                .addGap(18, 18, 18)
                                .addComponent(radioDisewa))
                            .addComponent(fieldKursi, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldPlat))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fieldPlat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fieldKursi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(radioTersedia)
                    .addComponent(radioDisewa))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        btnClear.setBackground(new java.awt.Color(51, 85, 139));
        btnClear.setForeground(new java.awt.Color(254, 254, 254));
        btnClear.setText("C");
        btnClear.setPreferredSize(new java.awt.Dimension(32, 32));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(253, 18, 29));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/signoutK.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLogout)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMobilMouseClicked
        // TODO add your handling code here:
        fieldPlat.setEditable(false);
        fieldPlat.requestFocus();
        int i = tableMobil.getSelectedRow();
        if (i >- 1) {
            fieldNama.setText(tabmode.getValueAt(i, 1).toString());
            fieldPlat.setText(tabmode.getValueAt(i, 2).toString());
            fieldKursi.setText(tabmode.getValueAt(i, 3).toString());
            comboTahun.setSelectedItem(tabmode.getValueAt(i, 4).toString());
            if ("Tersedia".equalsIgnoreCase(tabmode.getValueAt(i, 5).toString())) {
                radioTersedia.setSelected(true);
            } else {
                radioDisewa.setSelected(true);
            }
        }
    }//GEN-LAST:event_tableMobilMouseClicked

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        String St;
        if (radioDisewa.isSelected()) {
            St = "Disewa";
        } else {
            St = "Tersedia";
        }
        
        if ("".equals(fieldNama.getText()) || "".equals(fieldPlat.getText()) || 
                "".equals(fieldKursi.getText()) ) {
            JOptionPane.showMessageDialog(this, 
                    "Harap melengkapi data terlebih dahulu", "ERROR", 
                    JOptionPane.WARNING_MESSAGE);
        } else {
            try {
            conn.createStatement().executeUpdate("INSERT INTO mobil SET "
                    + "nama = '" + fieldNama.getText() + "',"
                    + "plat = '" + fieldPlat.getText() + "'," 
                    + "kursi = '" + fieldKursi.getText() + "',"
                    + "tahun = '" + comboTahun.getSelectedItem()+ "',"
                    + "status = '" + St 
                    + "';");
            tampilkan();
            reset();
            fieldPlat.requestFocus();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        } catch (SQLException ex) {
            Logger.getLogger(Mobil.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data gagal disimpan, " + ex);
        }
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        String St;
        if (radioDisewa.isSelected()) {
            St = "Disewa";
        } else {
            St = "Tersedia";
        }
        
        if ("".equals(fieldNama.getText()) || "".equals(fieldPlat.getText()) || 
                "".equals(fieldKursi.getText()) ) {
            JOptionPane.showMessageDialog(this, 
                    "Harap melengkapi data terlebih dahulu", "ERROR", 
                    JOptionPane.WARNING_MESSAGE);
        } else {
            try {
            conn.createStatement().executeUpdate("UPDATE mobil SET "
                    + "nama = '" + fieldNama.getText() + "',"
                    + "kursi = '" + fieldKursi.getText() + "',"
                    + "tahun = '" + comboTahun.getSelectedItem()+ "',"
                    + "status = '" + St + "'"
                    + " WHERE plat = '" + fieldPlat.getText() 
                    + "'");
            tampilkan();
            reset();
            fieldPlat.requestFocus();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah");
        } catch (SQLException ex) {
            Logger.getLogger(Mobil.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data gagal diubah, " + ex);
        }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Yakin anda ingin Menghapus?", "Konfirmasi ", 
                JOptionPane.YES_NO_OPTION);
        
        if (confirm == 0 ) {
            try {
            conn.createStatement().executeUpdate("DELETE FROM mobil WHERE plat = '" 
                    + fieldPlat.getText() + "'");
            tampilkan();
            reset();
            fieldPlat.setEditable(true);
            fieldPlat.requestFocus();
            JOptionPane.showMessageDialog(null, "Data berhasil hapus");
        } catch (SQLException ex) {
            Logger.getLogger(Mobil.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data gagal dihapus, " + ex);
        }
        }
        
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnDaftarSopirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarSopirActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Sopir sopir = new Sopir();
        sopir.setVisible(true);
    }//GEN-LAST:event_btnDaftarSopirActionPerformed

    private void btnDaftarPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarPelangganActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setVisible(true);
    }//GEN-LAST:event_btnDaftarPelangganActionPerformed

    private void comboTahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTahunActionPerformed

    private void reset() {
        fieldNama.setText("");
        fieldPlat.setText("");
        fieldKursi.setText("");
        comboTahun.setSelectedIndex(0);
        groupStatus.clearSelection();
    }
    
    private void tampilkan() {
        int i = 1;
        int row = tableMobil.getRowCount();
        for (int a = 0; a < row; a++) {
            tabmode.removeRow(0);
        }
        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM mobil");
            while (rs.next()) {
                String index = Integer.toString(i);
                String[] data = {
                    index, rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)
                };
                i++;
                tabmode.addRow(data);
            }
            fieldPlat.setEditable(true);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException ex) {
            Logger.getLogger(Mobil.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data Gagal dipanggil " + ex);
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
            java.util.logging.Logger.getLogger(Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mobil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDaftarPelanggan;
    private javax.swing.JButton btnDaftarSopir;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> comboTahun;
    private javax.swing.JTextField fieldKursi;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JTextField fieldPlat;
    private javax.swing.ButtonGroup groupStatus;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioDisewa;
    private javax.swing.JRadioButton radioTersedia;
    public javax.swing.JTable tableMobil;
    // End of variables declaration//GEN-END:variables

}
