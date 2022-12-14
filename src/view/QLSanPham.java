/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.math.BigDecimal;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.LoaiSanPham;
import model.MauSac;
import model.NhaCungCap;
import model.SanPham;
import model.Size;
import service.LoaiSPService;
import service.MauSacService;
import service.NhaCungCapService;
import service.SanPhamService;
import service.SizeService;

/**
 *
 * @author Dell
 */
public class QLSanPham extends javax.swing.JFrame {

    private SanPhamService phamService = new SanPhamService();
    private DefaultTableModel dtm;

    /**
     * Creates new form NewJFrame
     */
    public QLSanPham() {
        initComponents();
        txtIdSP.setEnabled(false);
        dtm = (DefaultTableModel) tblRow.getModel();
        String[] header = {"Mã SP", "Mã NCC", "Mã LSP", "Mã Mấuc", "Mã Size", "Tên SP",
            "Giá Nhập", "Giá Bán", "Chất Liệu", "SL Tồn", "Ngày Lập", "Ngày Sửa", "Trạng Thái",};
        dtm.setColumnIdentifiers(header);
        fillTable();
        showIDNCC();
        showIDLSP();
        showIDMauSac();
        showIDSize();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtIdSP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboIdNCC = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboIdLSP = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cboIdMauSac = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cboIdSize = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtGiaNhap = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtGiaBan = new javax.swing.JTextField();
        txtNgayLap = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNgaySua = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnCTNCC = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnCTLSP = new javax.swing.JButton();
        btnCTMauSac = new javax.swing.JButton();
        btnCTSize = new javax.swing.JButton();
        rdoDa = new javax.swing.JRadioButton();
        rdoChua = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRow = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtChatLieu = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtSLTon = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("IdSP");

        txtIdSP.setEditable(false);

        jLabel3.setText("IdNCC");

        jLabel4.setText("IdLSP");

        cboIdLSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("IdMauSac");

        cboIdMauSac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("IdSize");

        cboIdSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Tên SP");

        jLabel8.setText("Giá nhập");

        jLabel9.setText("Giá bán");

        jLabel10.setText("Ngày Lập");

        jLabel11.setText("Ngày Sửa");

        jLabel12.setText("Trạng Thái");

        btnCTNCC.setText("Chi Tiết");
        btnCTNCC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCTNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCTNCCActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("THÔNG TIN SẢN PHẨM");

        btnCTLSP.setText("Chi Tiết");
        btnCTLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCTLSPActionPerformed(evt);
            }
        });

        btnCTMauSac.setText("Chi Tiết");
        btnCTMauSac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCTMauSacActionPerformed(evt);
            }
        });

        btnCTSize.setText("Chi Tiết");
        btnCTSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCTSizeActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoDa);
        rdoDa.setText("Đã Thanh Toán");

        buttonGroup1.add(rdoChua);
        rdoChua.setText("Chưa Thanh Toán");

        tblRow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblRow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRowMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblRow);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThem)
                .addGap(18, 18, 18)
                .addComponent(btnSua)
                .addGap(18, 18, 18)
                .addComponent(btnXoa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setText("Chất liệu");

        jLabel14.setText("SL Tồn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(39, 39, 39))
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(35, 35, 35)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(cboIdSize, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnCTSize))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(cboIdLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cboIdMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnCTLSP)
                                                    .addComponent(btnCTMauSac)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtIdSP, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cboIdNCC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(btnCTNCC)))
                                        .addGap(57, 57, 57)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel11)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel8))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(142, 142, 142)
                                        .addComponent(jLabel12)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNgaySua, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdoDa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rdoChua))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSLTon, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cboIdNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCTNCC)
                            .addComponent(jLabel8)
                            .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cboIdLSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCTLSP)
                            .addComponent(jLabel9)
                            .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cboIdMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCTMauSac)
                            .addComponent(jLabel10)
                            .addComponent(txtNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboIdSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCTSize)
                    .addComponent(jLabel11)
                    .addComponent(txtNgaySua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(rdoDa)
                    .addComponent(rdoChua)
                    .addComponent(jLabel13)
                    .addComponent(txtChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtSLTon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCTNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCTNCCActionPerformed
        // TODO add your handling code here:
        new viewNhaCungCap().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCTNCCActionPerformed

    private void btnCTLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCTLSPActionPerformed
        // TODO add your handling code here:
        new ViewLoaiSP().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCTLSPActionPerformed

    private void btnCTMauSacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCTMauSacActionPerformed
        // TODO add your handling code here:
        new ViewMauSac().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCTMauSacActionPerformed

    private void btnCTSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCTSizeActionPerformed
        // TODO add your handling code here:
        new ViewSize().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCTSizeActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        SanPham sp = new SanPham();
        sp.setIdsp(txtIdSP.getText());
        sp.setIdncc((String) cboIdNCC.getSelectedItem());
        sp.setIdlsp((String) cboIdLSP.getSelectedItem());
        sp.setIdMauSac((String) cboIdMauSac.getSelectedItem());
        sp.setIdSize((String) cboIdSize.getSelectedItem());
        sp.setTenSP(txtTenSP.getText());
        Float giaNhap = Float.valueOf(txtGiaNhap.getText());
        BigDecimal GN = BigDecimal.valueOf(giaNhap);
        sp.setGiaNhap(GN);
        Float giaBan = Float.valueOf(txtGiaBan.getText());
        BigDecimal GB = BigDecimal.valueOf(giaBan);
        sp.setGiaNhap(GB);
        sp.setChatLieu(txtChatLieu.getText());
        sp.setSlTon(Integer.valueOf(txtSLTon.getText()));
        sp.setNgayLap(txtNgayLap.getText());
        sp.setNgaySua(txtNgaySua.getText());
        if (rdoDa.isSelected()) {
            sp.setTrangThai(1);
        }
        if (rdoChua.isSelected()) {
            sp.setTrangThai(0);
        }

        if (phamService.add(sp)) {
            JOptionPane.showMessageDialog(this, "Thêm thành công!");
            showData(phamService.getList());
        } else {
            JOptionPane.showMessageDialog(this, "Thêm thất bại!");
            return;
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblRowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRowMouseClicked
        // TODO add your handling code here:
        int index = tblRow.getSelectedRow();
        List<SanPham> phams = phamService.getList();
        SanPham sp = phams.get(index);
        txtIdSP.setText(String.valueOf(tblRow.getValueAt(index, 0).toString()));
        cboIdNCC.setSelectedItem(tblRow.getValueAt(index, 1).toString());
        cboIdLSP.setSelectedItem(tblRow.getValueAt(index, 2).toString());
        cboIdMauSac.setSelectedItem(tblRow.getValueAt(index, 3).toString());
        cboIdSize.setSelectedItem(tblRow.getValueAt(index, 4).toString());
        txtTenSP.setText(String.valueOf(tblRow.getValueAt(index, 5)).toString());
        txtGiaNhap.setText(tblRow.getValueAt(index, 6).toString());
        txtGiaBan.setText(tblRow.getValueAt(index, 7).toString());
        txtChatLieu.setText(tblRow.getValueAt(index, 8).toString());
        txtSLTon.setText(String.valueOf(tblRow.getValueAt(index, 9).toString()));
        txtNgayLap.setText(tblRow.getValueAt(index, 10).toString());
        txtNgaySua.setText(tblRow.getValueAt(index, 11).toString());
        if (sp.getTrangThai() == 1) {
            rdoDa.setSelected(true);
            rdoChua.setSelected(false);
        } else {
            rdoDa.setSelected(false);
            rdoChua.setSelected(true);
        }
    }//GEN-LAST:event_tblRowMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int index = tblRow.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Chọn để sửa");
            return;
        }
        List<SanPham> phams = phamService.getList();
        SanPham sp = phams.get(index);
       sp.setIdncc((String) cboIdNCC.getSelectedItem());
        sp.setIdlsp((String) cboIdLSP.getSelectedItem());
        sp.setIdMauSac((String) cboIdMauSac.getSelectedItem());
        sp.setIdSize((String) cboIdSize.getSelectedItem());
        sp.setTenSP(txtTenSP.getText());
        
        Float giaNhap = Float.valueOf(txtGiaNhap.getText());
        BigDecimal GN = BigDecimal.valueOf(giaNhap);
        sp.setGiaNhap(GN);
        Float giaBan = Float.valueOf(txtGiaBan.getText());
        BigDecimal GB = BigDecimal.valueOf(giaBan);
        sp.setGiaBan(GB);
        
        sp.setChatLieu(txtChatLieu.getText());
        sp.setSlTon(Integer.valueOf(txtSLTon.getText()));
        sp.setNgayLap(txtNgayLap.getText());
        sp.setNgaySua(txtNgaySua.getText());
        if (rdoDa.isSelected()) {
            sp.setTrangThai(1);
        }
        if (rdoChua.isSelected()) {
            sp.setTrangThai(0);
        }
        String id = txtIdSP.getText();
        try {
            phamService.update(sp, id);
            JOptionPane.showMessageDialog(this, "Sửa thành công");
            showData(phamService.getList());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Sửa thất bại");
            return;
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int index = tblRow.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn để xóa!");
            return;
        }
        List<SanPham> sanPhams = phamService.getList();
        SanPham sp = sanPhams.get(index);
        String idSP = txtIdSP.getText();
        int kq = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xóa?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.YES_OPTION);
        if (kq == JOptionPane.YES_OPTION) {
            try {
                phamService.delete(idSP);
                JOptionPane.showMessageDialog(this, "Xóa thành công!");
                showData(phamService.getList());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Xóa thất bại!");
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed
    public void fillTable() {
        List<SanPham> sanPhams = phamService.getList();
        if (sanPhams == null) {
            JOptionPane.showMessageDialog(this, "Lỗi");
            return;
        }
        if (sanPhams.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Rỗng");
            return;
        }
        showData(phamService.getList());
    }

    public void showData(List<SanPham> sanPhams) {
        dtm.setRowCount(0);
        for (SanPham sp : sanPhams) {
            Object[] row = new Object[]{
                sp.getIdsp(), sp.getIdncc(), sp.getIdlsp(), sp.getIdMauSac(), sp.getIdSize(), sp.getTenSP(),
                sp.getGiaNhap(), sp.getGiaBan(), sp.getChatLieu(), sp.getSlTon(),
                sp.getNgayLap(), sp.getNgaySua(), sp.getTrangThai() == 1 ? "Đã Thanh Toán" : "Chưa Thanh Toán"};
            dtm.addRow(row);
        }
    }

    public void showIDNCC() {
        cboIdNCC.removeAllItems();
        List<NhaCungCap> caps = new NhaCungCapService().getAll();
        for (NhaCungCap cap : caps) {
            cboIdNCC.addItem(cap.getIdNcc());
        }
    }

    public void showIDLSP() {
        cboIdLSP.removeAllItems();
        List<LoaiSanPham> lsps = new LoaiSPService().getLSP();
        for (LoaiSanPham lsp : lsps) {
            cboIdLSP.addItem(lsp.getIdsp());
        }
    }

    public void showIDMauSac() {
        cboIdMauSac.removeAllItems();
        List<MauSac> mss = new MauSacService().getAll();
        for (MauSac ms : mss) {
            cboIdMauSac.addItem(ms.getIdMau());
        }
    }

    public void showIDSize() {
        cboIdSize.removeAllItems();
        List<Size> ses = new SizeService().getAll();
        for (Size se : ses) {
            cboIdSize.addItem(se.getIdSize());
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
            java.util.logging.Logger.getLogger(QLSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCTLSP;
    private javax.swing.JButton btnCTMauSac;
    private javax.swing.JButton btnCTNCC;
    private javax.swing.JButton btnCTSize;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboIdLSP;
    private javax.swing.JComboBox<String> cboIdMauSac;
    private javax.swing.JComboBox<String> cboIdNCC;
    private javax.swing.JComboBox<String> cboIdSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdoChua;
    private javax.swing.JRadioButton rdoDa;
    private javax.swing.JTable tblRow;
    private javax.swing.JTextField txtChatLieu;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtGiaNhap;
    private javax.swing.JTextField txtIdSP;
    private javax.swing.JTextField txtNgayLap;
    private javax.swing.JTextField txtNgaySua;
    private javax.swing.JTextField txtSLTon;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables
}
