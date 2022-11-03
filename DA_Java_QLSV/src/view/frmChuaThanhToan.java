/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.LopHP;
import model.NhanVien;
import model.SinhVien;
import model.ThuHocPhi;

/**
 *
 * @author Dell
 */
public class frmChuaThanhToan extends javax.swing.JFrame {

    /**
     * Creates new form frmChuaThanhToan
     */
     List<NhanVien> listThuNgan = null;
    public frmChuaThanhToan() {
        initComponents();
        Run_ChuaThanhToan();
    }

    private void Run_ChuaThanhToan(){
     try {
           Label_KetQuaTimKiem.setText(null);
            Vector tieuDe = new Vector();
            tieuDe.add("Mã lớp học phần");
            tieuDe.add("Tên lớp học phần");
            tieuDe.add("Mã Sinh viên");
            tieuDe.add("Tên sinh viên");
           
            tieuDe.add("Học phí");
        //    tieuDe.add("ThanhToan");
            
            Vector duLieu = new Vector();
            List<ThuHocPhi> listThuHocPhi = controller.ThuHocPhiController.listChuaThanhToan();
            List<LopHP> listLopHP = controller.LopHPController.listLopHPID();
            List<SinhVien> listSinhVien = controller.SinhVienController.listSinhVienID();     
              
            if (listThuHocPhi != null){
             
            for (ThuHocPhi thuhocphi : listThuHocPhi) {
                
                Vector tam = new Vector();
                
                
                tam.add(thuhocphi.getID_LOPHP());
                for (LopHP lopHP : listLopHP) {
                        if (lopHP.getID_LopHP().equalsIgnoreCase(thuhocphi.getID_LOPHP())) {
                            tam.add(lopHP.getTenLopHP());
                            break;
                        }
                    }
                
                tam.add(thuhocphi.getID_SV());
                for (SinhVien sinhvien : listSinhVien){
                    if (sinhvien.getID_SV().equalsIgnoreCase(thuhocphi.getID_SV())) {
                        tam.add(sinhvien.getTenSV());
                        break;
                        
                    }
                
                }
              
              for(LopHP lophp : listLopHP){
                  if (lophp.getID_LopHP().equalsIgnoreCase(thuhocphi.getID_LOPHP())){
                     tam.add(lophp.getHocPhi());
                      break;
                     
                   }
              }
              
                
                //tam.add(thuhocphi.getThanhToan());
                
                duLieu.add(tam);
            }
            }
            DefaultTableModel model = new DefaultTableModel(duLieu, tieuDe);
            tableChuaThanhToan.setModel(model);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(frmChuaThanhToan.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dialog_ThanhToan = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_XNThanhToan = new javax.swing.JButton();
        Label_IDSV_DialogThanhToan = new javax.swing.JLabel();
        Label_TenSV_DialogThanhToan = new javax.swing.JLabel();
        Label_IDLopHP_DialogThanhToan = new javax.swing.JLabel();
        Label_TenLopHP_DialogThanhToan = new javax.swing.JLabel();
        Label_HocPhi_DialogThanhToan = new javax.swing.JLabel();
        cmb_ThuNgan_DialogThanhToan = new javax.swing.JComboBox<>();
        Dialog_SearchSV = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        txt_SearchSV = new javax.swing.JTextField();
        btn_SearchSV_Dialog = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_Thoat = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        btn_LamTuoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableChuaThanhToan = new javax.swing.JTable();
        btn_SearchSV = new javax.swing.JButton();
        Label_KetQuaTimKiem = new javax.swing.JLabel();

        Dialog_ThanhToan.setTitle("Thanh toán");

        jLabel2.setText("Mã sinh viên:");

        jLabel3.setText("Tên sinh viên:");

        jLabel4.setText("Mã lớp học phần:");

        jLabel5.setText("Tên lớp học phần");

        jLabel6.setText("Học phí:");

        jLabel7.setText("Thu ngân:");

        btn_XNThanhToan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_XNThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/XN.png"))); // NOI18N
        btn_XNThanhToan.setText("Xác nhận thanh toán");
        btn_XNThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XNThanhToanActionPerformed(evt);
            }
        });

        Label_IDSV_DialogThanhToan.setText("jLabel8");

        Label_TenSV_DialogThanhToan.setText("jLabel9");

        Label_IDLopHP_DialogThanhToan.setText("jLabel10");

        Label_TenLopHP_DialogThanhToan.setText("jLabel11");

        Label_HocPhi_DialogThanhToan.setText("jLabel12");

        cmb_ThuNgan_DialogThanhToan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout Dialog_ThanhToanLayout = new javax.swing.GroupLayout(Dialog_ThanhToan.getContentPane());
        Dialog_ThanhToan.getContentPane().setLayout(Dialog_ThanhToanLayout);
        Dialog_ThanhToanLayout.setHorizontalGroup(
            Dialog_ThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Dialog_ThanhToanLayout.createSequentialGroup()
                .addGroup(Dialog_ThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Dialog_ThanhToanLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(Dialog_ThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Dialog_ThanhToanLayout.createSequentialGroup()
                                .addGroup(Dialog_ThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(Dialog_ThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_IDLopHP_DialogThanhToan, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Label_TenLopHP_DialogThanhToan, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Label_HocPhi_DialogThanhToan, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cmb_ThuNgan_DialogThanhToan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Dialog_ThanhToanLayout.createSequentialGroup()
                                .addGroup(Dialog_ThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Dialog_ThanhToanLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(104, 104, 104)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(Dialog_ThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_IDSV_DialogThanhToan)
                                    .addComponent(Label_TenSV_DialogThanhToan, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(Dialog_ThanhToanLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_XNThanhToan)))
                .addGap(122, 122, 122))
        );
        Dialog_ThanhToanLayout.setVerticalGroup(
            Dialog_ThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dialog_ThanhToanLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Dialog_ThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Label_IDSV_DialogThanhToan))
                .addGap(18, 18, 18)
                .addGroup(Dialog_ThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Label_TenSV_DialogThanhToan))
                .addGap(18, 18, 18)
                .addGroup(Dialog_ThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Label_IDLopHP_DialogThanhToan))
                .addGap(18, 18, 18)
                .addGroup(Dialog_ThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Label_TenLopHP_DialogThanhToan))
                .addGap(18, 18, 18)
                .addGroup(Dialog_ThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Label_HocPhi_DialogThanhToan))
                .addGap(18, 18, 18)
                .addGroup(Dialog_ThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmb_ThuNgan_DialogThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btn_XNThanhToan)
                .addGap(24, 24, 24))
        );

        Dialog_SearchSV.setTitle("Tìm Kiếm");

        jLabel8.setText("ID Sinh viên");

        btn_SearchSV_Dialog.setText("Tìm sinh viên");
        btn_SearchSV_Dialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchSV_DialogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Dialog_SearchSVLayout = new javax.swing.GroupLayout(Dialog_SearchSV.getContentPane());
        Dialog_SearchSV.getContentPane().setLayout(Dialog_SearchSVLayout);
        Dialog_SearchSVLayout.setHorizontalGroup(
            Dialog_SearchSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dialog_SearchSVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Dialog_SearchSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_SearchSV_Dialog)
                    .addComponent(txt_SearchSV, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Dialog_SearchSVLayout.setVerticalGroup(
            Dialog_SearchSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dialog_SearchSVLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(Dialog_SearchSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_SearchSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_SearchSV_Dialog)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Danh sách sinh viên chưa nộp học phí");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DANH SÁCH SINH VIÊN CHƯA NỘP HỌC PHÍ");

        btn_Thoat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_Thoat.setForeground(new java.awt.Color(51, 51, 255));
        btn_Thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close.png"))); // NOI18N
        btn_Thoat.setText("Đóng");
        btn_Thoat.setFocusable(false);
        btn_Thoat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Thoat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThoatActionPerformed(evt);
            }
        });

        btnThanhToan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnThanhToan.setForeground(new java.awt.Color(51, 51, 255));
        btnThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ThanhToanicon.png"))); // NOI18N
        btnThanhToan.setText("Thanh toán");
        btnThanhToan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThanhToan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        btn_LamTuoi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_LamTuoi.setForeground(new java.awt.Color(51, 51, 255));
        btn_LamTuoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LamTuoi.png"))); // NOI18N
        btn_LamTuoi.setText("Làm tươi");
        btn_LamTuoi.setFocusable(false);
        btn_LamTuoi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_LamTuoi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_LamTuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LamTuoiActionPerformed(evt);
            }
        });

        tableChuaThanhToan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableChuaThanhToan);

        btn_SearchSV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_SearchSV.setForeground(new java.awt.Color(51, 0, 255));
        btn_SearchSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btn_SearchSV.setText("Tìm Kiếm");
        btn_SearchSV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_SearchSV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_SearchSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchSVActionPerformed(evt);
            }
        });

        Label_KetQuaTimKiem.setText("jLabel6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1388, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThanhToan)
                        .addGap(18, 18, 18)
                        .addComponent(btn_SearchSV)
                        .addGap(12, 12, 12)
                        .addComponent(btn_LamTuoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Thoat)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_KetQuaTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Thoat)
                    .addComponent(btn_LamTuoi)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_SearchSV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThanhToan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_KetQuaTimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed

        try {
        int selectedRow = tableChuaThanhToan.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "Chưa chọn sinh viên cần thanh toán", "Thong bao", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Label_IDSV_DialogThanhToan.setText(tableChuaThanhToan.getValueAt(selectedRow, 2).toString());
            Label_TenSV_DialogThanhToan.setText(tableChuaThanhToan.getValueAt(selectedRow, 3).toString());
            Label_IDLopHP_DialogThanhToan.setText(tableChuaThanhToan.getValueAt(selectedRow, 0).toString());
            Label_TenLopHP_DialogThanhToan.setText(tableChuaThanhToan.getValueAt(selectedRow, 1).toString());
            Label_HocPhi_DialogThanhToan.setText(tableChuaThanhToan.getValueAt(selectedRow, 4).toString());
            listThuNgan = controller.NhanVienController.listThuNganID();
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            for (NhanVien nhanVien : listThuNgan) {
                model.addElement(nhanVien.getTenNV());
            }
            cmb_ThuNgan_DialogThanhToan.setModel(model);     
            Dialog_ThanhToan.setSize(500,350);
            Dialog_ThanhToan.setLocationRelativeTo(null);
            Dialog_ThanhToan.setVisible(true);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmChuaThanhToan.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
            Logger.getLogger(frmChuaThanhToan.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void btn_XNThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XNThanhToanActionPerformed
        // TODO add your handling code here:
                   try {
            // TODO add your handling code here:
            
            ThuHocPhi thuhocphi = new ThuHocPhi();
            thuhocphi.setID_SV(Label_IDSV_DialogThanhToan.getText());
            thuhocphi.setID_LOPHP(Label_IDLopHP_DialogThanhToan.getText());
            
            listThuNgan = controller.NhanVienController.listThuNganID();
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            for (NhanVien nhanVien : listThuNgan) {
                model.addElement(nhanVien.getTenNV());
            }
            
           for (NhanVien nhanVien : listThuNgan) {
                if (nhanVien.getTenNV().equalsIgnoreCase(cmb_ThuNgan_DialogThanhToan.getSelectedItem().toString())) {
                    thuhocphi.setID_NV(nhanVien.getID_NV());
                }
            }
            
            
            int ketQua = controller.ThuHocPhiController.editThanhToan(thuhocphi);
            if (ketQua > 0) {
                JOptionPane.showMessageDialog(null, "Thanh toán thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                Run_ChuaThanhToan();
                Dialog_ThanhToan.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Thanh toán không thành công", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(frmChuaThanhToan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_XNThanhToanActionPerformed

    private void btn_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThoatActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_ThoatActionPerformed

    private void btn_LamTuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LamTuoiActionPerformed
        // TODO add your handling code here:
        Run_ChuaThanhToan();
    }//GEN-LAST:event_btn_LamTuoiActionPerformed

    private void btn_SearchSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchSVActionPerformed
        // TODO add your handling code here:
        txt_SearchSV.setText("");
            Dialog_SearchSV.setSize(350,125);
            Dialog_SearchSV.setLocationRelativeTo(null);
            Dialog_SearchSV.setVisible(true);
    }//GEN-LAST:event_btn_SearchSVActionPerformed

    private void btn_SearchSV_DialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchSV_DialogActionPerformed
        // TODO add your handling code here:
        try {
             Label_KetQuaTimKiem.setText(null);
            Vector tieuDe = new Vector();
            tieuDe.add("ID_LOPHP");
            tieuDe.add("TenLopHP");
            tieuDe.add("ID_SV");
            tieuDe.add("TenSV");
            tieuDe.add("HocPhi");
     

            Vector duLieu = new Vector();

            String IDSV = new String();
            IDSV= txt_SearchSV.getText();
            Label_KetQuaTimKiem.setText("Kết quả tìm kiếm tên sinh viên theo ID: "+IDSV+". Nhấn làm tươi để xem tất cả sinh viên");

            List<ThuHocPhi> listThuHocPhi = controller.ThuHocPhiController.TKChuaThanhToanSVID(IDSV);
            List<LopHP> listLopHP = controller.LopHPController.listLopHPID();
            List<SinhVien> listSinhVien = controller.SinhVienController.listSinhVienID();

            if (listThuHocPhi != null){
                for (ThuHocPhi thuhocphi : listThuHocPhi) {

                    Vector tam = new Vector();

                    tam.add(thuhocphi.getID_LOPHP());
                    for (LopHP lopHP : listLopHP) {
                        if (lopHP.getID_LopHP().equalsIgnoreCase(thuhocphi.getID_LOPHP())) {
                            tam.add(lopHP.getTenLopHP());
                            break;
                        }
                    }

                    tam.add(thuhocphi.getID_SV());
                    for (SinhVien sinhvien : listSinhVien){
                        if (sinhvien.getID_SV().equalsIgnoreCase(thuhocphi.getID_SV())) {
                            tam.add(sinhvien.getTenSV());
                            break;

                        }

                    }

                    for(LopHP lophp : listLopHP){
                        if (lophp.getID_LopHP().equalsIgnoreCase(thuhocphi.getID_LOPHP())){
                            tam.add(lophp.getHocPhi());
                            break;

                        }
                    }

                  
                    duLieu.add(tam);
                }
            }

            DefaultTableModel model = new DefaultTableModel(duLieu, tieuDe);
            tableChuaThanhToan.setModel(model);
            Dialog_SearchSV.dispose();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(frmChuaThanhToan.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_SearchSV_DialogActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmChuaThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmChuaThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmChuaThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmChuaThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmChuaThanhToan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Dialog_SearchSV;
    private javax.swing.JDialog Dialog_ThanhToan;
    private javax.swing.JLabel Label_HocPhi_DialogThanhToan;
    private javax.swing.JLabel Label_IDLopHP_DialogThanhToan;
    private javax.swing.JLabel Label_IDSV_DialogThanhToan;
    private javax.swing.JLabel Label_KetQuaTimKiem;
    private javax.swing.JLabel Label_TenLopHP_DialogThanhToan;
    private javax.swing.JLabel Label_TenSV_DialogThanhToan;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btn_LamTuoi;
    private javax.swing.JButton btn_SearchSV;
    private javax.swing.JButton btn_SearchSV_Dialog;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JButton btn_XNThanhToan;
    private javax.swing.JComboBox<String> cmb_ThuNgan_DialogThanhToan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableChuaThanhToan;
    private javax.swing.JTextField txt_SearchSV;
    // End of variables declaration//GEN-END:variables
}