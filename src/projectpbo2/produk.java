/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpbo2;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anonymous
 */
public class produk extends javax.swing.JFrame {

    //PENAMPUNG STATUS
    int item = 0;
    int maksimalstok;
    public static String paket = null;
    public static String pengguna = null;
    public static int totalbayar;

    /**
     * Creates new form produk
     */
    public produk() {
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tmbllogin = new javax.swing.JButton();
        tmbllogout = new javax.swing.JButton();
        daftar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        produk = new javax.swing.JTextField();
        promo = new javax.swing.JTextField();
        jenis = new javax.swing.JTextField();
        hargasatuan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tambah = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        harga = new javax.swing.JLabel();
        jumlah = new javax.swing.JSlider();
        bayar = new javax.swing.JButton();
        text = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jumlahitem = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        kosong = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "P001", "Washing Cream", "", "Obat",  new Integer(5), "97500"},
                {"2", "P002", "Bleaching Hydro", "Diskon 50% untuk Diamond, 20% untuk Gold", "Obat",  new Integer(10), "180000"},
                {"3", "P003", "Masker GOld Radiance", null, "Obat",  new Integer(3), "120000"},
                {"4", "P004", "Paket High Gold", "Pembelian ke-2 potongan Rp. 100.000 untuk semua", "Obat",  new Integer(15), "345000"},
                {"5", "P005", "Cooster Cream", "Diskon 10% untuk Diamond dan Gold, 5% untuk Silver", "Obat",  new Integer(20), "600000"},
                {"6", "P006", "Cream Baby Pink", null, "Obat",  new Integer(5), "75000"},
                {"7", "P007", "Serum Tea Tree", "Pembelian ke-2 diskon 30% untuk semua", "Obat",  new Integer(25), "135000"},
                {"8", "P008", "Eye Cream", null, "Obat",  new Integer(6), "82000"},
                {"9", "P009", "Sabun Madu Acne", null, "Obat",  new Integer(7), "57000"},
                {"10", "P010", "Night Cream", null, "Obat",  new Integer(4), "138000"},
                {"11", "P012", "Day Cream", "Beli 1 dapat 2 untuk semua", "Obat",  new Integer(9), "197000"},
                {"12", "P013", "Mesoterapi", "Diskon 10% untuk semua", "Tindakan",  new Integer(1), "150000"},
                {"13", "P014", "Chemical Peeling", null, "Tindakan",  new Integer(1), "218000"},
                {"14", "P015", "Facial Acne", "Diskon 15% untuk Diamond, 10% untuk Gold", "Tindakan",  new Integer(1), "135000"},
                {"15", "P016", "Platelet Rich Plasma", null, "Tindakan",  new Integer(1), "354000"},
                {"16", "P017", "Intense Pulse", null, "Tindakan",  new Integer(1), "217000"}
            },
            new String [] {
                "NO", "ID_PRODUK", "PRODUK", "PROMO", "JENIS", "STOK", "HARGA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LOGIN / LOGOUT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        jLabel4.setText("Username");

        jLabel5.setText("Password");

        tmbllogin.setText("Login");
        tmbllogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmblloginActionPerformed(evt);
            }
        });

        tmbllogout.setText("Logout");
        tmbllogout.setEnabled(false);
        tmbllogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbllogoutActionPerformed(evt);
            }
        });

        daftar.setText("Daftar Sekarang");
        daftar.setBorderPainted(false);
        daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectpbo2/LOGO (another copy).png"))); // NOI18N

        jLayeredPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(user, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(tmbllogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(tmbllogout, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(daftar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(password, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(40, 40, 40))
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tmbllogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(daftar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tmbllogin, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tmbllogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tmbllogout)
                .addGap(18, 18, 18)
                .addComponent(daftar)
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Keranjang", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        produk.setEditable(false);

        promo.setEditable(false);

        jenis.setEditable(false);

        hargasatuan.setEditable(false);

        jLabel1.setText("Produk");

        jLabel3.setText("Promo");

        jLabel6.setText("Jenis");

        jLabel7.setText("Harga");

        jLabel10.setText("Jumlah");

        tambah.setText("Tambah ke keranjang");
        tambah.setEnabled(false);
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel8.setText("Total : ");

        jLabel9.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel9.setText("Rp.");

        harga.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        harga.setText("0,-");

        jumlah.setMaximum(10);
        jumlah.setValue(0);
        jumlah.setEnabled(false);
        jumlah.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jumlahMouseDragged(evt);
            }
        });

        jLayeredPane3.setLayer(produk, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(promo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jenis, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(hargasatuan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(tambah, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(harga, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jumlah, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(promo, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                    .addComponent(jenis)
                    .addComponent(hargasatuan)
                    .addComponent(produk))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(harga))
                            .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(produk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10)))
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(promo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tambah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(harga))
                    .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hargasatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        bayar.setText("Lanjut Pembayaran");
        bayar.setEnabled(false);
        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed(evt);
            }
        });

        text.setText("*Login terlebih dahulu");

        jLabel11.setText("Keranjang Belanja: ");

        jumlahitem.setText(" 0 ");

        jLabel13.setText("Item(s)");

        kosong.setText("Kosongkan Keranjang");
        kosong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kosongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(text))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jumlahitem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel13)))
                    .addComponent(kosong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(280, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jumlahitem)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kosong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(text)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bayar))
                            .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(244, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void daftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarActionPerformed
        daftar a = new daftar();
        a.setVisible(true);
    }//GEN-LAST:event_daftarActionPerformed

    private void tmblloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmblloginActionPerformed
        boolean cek1 = false;
        boolean cek2 = false;

        for (int i = 0; i < tampungMember.baris; i++) {
            if (user.getText().equals(tampungMember.NAMA[i])) {
                System.out.println(user.getText());
                cek1 = true;
            }
        }
        for (int i = 0; i < tampungMember.baris; i++) {
            if (password.getText().equals(tampungMember.PASSWORD[i])) {
                System.out.println(password.getText());
                cek2 = true;
            }
        }

        if (cek1 == true && cek2 == true) {
            JOptionPane.showMessageDialog(rootPane, "Selamat Datang " + user.getText());
            pengguna = user.getText();

            bayar.setEnabled(true);
            tmbllogin.setEnabled(false);
            tmbllogout.setEnabled(true);
            text.setText("");

            //PENENTUAN PAKET LOGIN
            for (int i = 0; i < tampungMember.baris; i++) {
                if (tampungMember.PAKET[i].equals("Silver")) {
                    paket = "Silver";
                } else if (tampungMember.PAKET[i].equals("Gold")) {
                    paket = "Gold";
                } else if (tampungMember.PAKET[i].equals("Diamond")) {
                    paket = "Diamond";
                }

                System.out.println(paket);
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Pastikan Username dan Password Benar");
        }

        user.setText("");
        password.setText("");
    }//GEN-LAST:event_tmblloginActionPerformed

    private void tmbllogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbllogoutActionPerformed
        bayar.setEnabled(false);
        tmbllogin.setEnabled(true);
        tmbllogout.setEnabled(false);
        paket = null;
        text.setText("*Login terlebih dahulu");
    }//GEN-LAST:event_tmbllogoutActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked

        DefaultTableModel isi = (DefaultTableModel) tabel.getModel();
        int row = tabel.getSelectedRow();
        if (row >= 0) {
            int ok = JOptionPane.showConfirmDialog(this, "Pilih   " + tabel.getValueAt(row, 2) + "   ?", "Proses", JOptionPane.YES_NO_OPTION);
            if (ok == 0) {

                produk.setText((String) tabel.getValueAt(row, 2));
                promo.setText((String) tabel.getValueAt(row, 3));
                jenis.setText((String) tabel.getValueAt(row, 4));
                hargasatuan.setText((String) tabel.getValueAt(row, 6));
                maksimalstok = (int) tabel.getValueAt(row, 5);
            }

            if (produk.getText().equals(null) && jenis.getText().equals(null) && hargasatuan.getText().equals(null)) {
                jumlah.setEnabled(false);
                tambah.setEnabled(false);
            } else {
                jumlah.setEnabled(true);
                tambah.setEnabled(true);
            }

        }
    }//GEN-LAST:event_tabelMouseClicked

    private void jumlahMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jumlahMouseDragged
        if (jenis.getText().equals("Tindakan")) {
            jumlah.setMaximum(maksimalstok);
            jumlah.setValue(maksimalstok);
            harga.setText("" + (Integer.parseInt(hargasatuan.getText()) * jumlah.getValue()));
        } else if (jenis.getText().equals("Obat")) {
            jumlah.setMaximum(maksimalstok);
            harga.setText("" + (Integer.parseInt(hargasatuan.getText()) * jumlah.getValue()));
        }

    }//GEN-LAST:event_jumlahMouseDragged

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        if (jumlah.getValue() < 1) {
            JOptionPane.showMessageDialog(rootPane, "Masukkan jumlah barang");
        } else {
            //INSERT
            String PRODUK = produk.getText();
            int JUMLAH = jumlah.getValue();
            int TOTALJUMLAH = jumlah.getValue();
            String HARGA = harga.getText();
            int TOTALHARGA = Integer.parseInt(harga.getText());

            tampungBelanja.PRODUK[tampungBelanja.baris] = PRODUK;
            tampungBelanja.JUMLAH[tampungBelanja.baris] = JUMLAH;
            tampungBelanja.TOTALJUMLAH += TOTALJUMLAH;
            tampungBelanja.HARGA[tampungBelanja.baris] = HARGA;
            tampungBelanja.TOTALHARGA += TOTALHARGA;
            tampungBelanja.baris++;

            int pilih = JOptionPane.showConfirmDialog(rootPane, "Biaya produk = " + "Rp. " + harga.getText(), "Tambah ke keranjang?", JOptionPane.OK_CANCEL_OPTION);
            if (pilih == JOptionPane.OK_OPTION) {
                totalbayar += Integer.parseInt(harga.getText());
                item += jumlah.getValue();
                
                //RESET
                produk.setText("");
                promo.setText("");
                jenis.setText("");
                hargasatuan.setText("");
                harga.setText("0,-");
                jumlah.setValue(0);
                jumlah.setEnabled(false);
                tambah.setEnabled(false);

            }
        }

        jumlahitem.setText(String.valueOf(item));


    }//GEN-LAST:event_tambahActionPerformed

    private void bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarActionPerformed

        tabelbelanja a = new tabelbelanja();
        a.setVisible(true);
//        JOptionPane.showMessageDialog(rootPane, "User : " + pengguna + "\n"
//                + "Produk                                           Jumlah                            Total \n"
//                + tampungBelanja.PRODUK[0] +"                 " + tampungBelanja.JUMLAH[0] +"                                   "+ "Rp." +tampungBelanja.HARGA[0] + "\n \n"
//                + "Total Pembayaran : Rp." + tampungBelanja.HARGA[0]);
    }//GEN-LAST:event_bayarActionPerformed

    private void kosongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kosongActionPerformed
        jumlahitem.setText("0");

//        tampungBelanja.PRODUK[tampungBelanja.baris] = PRODUK;
//        tampungBelanja.JUMLAH[tampungBelanja.baris] = JUMLAH;
//        tampungBelanja.TOTALJUMLAH += TOTALJUMLAH;
//        tampungBelanja.HARGA[tampungBelanja.baris] = HARGA;
//        tampungBelanja.TOTALHARGA += TOTALHARGA;
//        tampungBelanja.baris++;
    }//GEN-LAST:event_kosongActionPerformed

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
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(produk.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(produk.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(produk.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(produk.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new produk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bayar;
    private javax.swing.JButton daftar;
    private javax.swing.JLabel harga;
    private javax.swing.JTextField hargasatuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jenis;
    private javax.swing.JSlider jumlah;
    private javax.swing.JLabel jumlahitem;
    private javax.swing.JButton kosong;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField produk;
    private javax.swing.JTextField promo;
    private javax.swing.JTable tabel;
    private javax.swing.JButton tambah;
    private javax.swing.JLabel text;
    private javax.swing.JButton tmbllogin;
    private javax.swing.JButton tmbllogout;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
