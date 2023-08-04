/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlyquanan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.Bidi;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DatabaseHelper;

/**
 *
 * @author Admin
 */
public class QuanLyHoaDon extends javax.swing.JFrame {
    PreparedStatement stmt = null;
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    String[] cols = {"Mã hóa đơn","Tên món","Mã món","Số lượng","Giá","Mã bàn","Mã nhân viên"};
    DefaultTableModel model = new DefaultTableModel(cols, 0);
    /**
     * Creates new form QuanLyHoaDon
     */
    public QuanLyHoaDon() {
        initComponents();
        setLocationRelativeTo(null);
        LoadDaTaToTabel();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSoluong = new javax.swing.JTextField();
        txtMahd = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMamon = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTenmon = new javax.swing.JTextField();
        txtMaban = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        txtManv = new javax.swing.JTextField();
        txtTongtien = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBangHD = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnXemCT = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("HÓA ĐƠN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã hóa đơn:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tên món:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 81, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Giá món: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 70, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Số lượng:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 81, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Tổng thành tiền:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 130, -1));
        getContentPane().add(txtSoluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 220, 30));
        getContentPane().add(txtMahd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 220, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Mã bàn:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 61, 30));
        getContentPane().add(txtMamon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 220, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Mã nhân viên:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 97, -1));
        getContentPane().add(txtTenmon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 220, 30));

        txtMaban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMabanActionPerformed(evt);
            }
        });
        getContentPane().add(txtMaban, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 220, 30));
        getContentPane().add(txtGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 220, 30));
        getContentPane().add(txtManv, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 220, 30));
        getContentPane().add(txtTongtien, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 220, 30));

        tblBangHD.setModel(new javax.swing.table.DefaultTableModel(
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
        tblBangHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBangHDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBangHD);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 760, 180));

        btnThem.setBackground(new java.awt.Color(204, 255, 204));
        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThem.setText("Thêm ");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 88, -1));

        btnSua.setBackground(new java.awt.Color(204, 255, 204));
        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 87, -1));

        btnXoa.setBackground(new java.awt.Color(204, 255, 204));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 91, -1));

        btnXemCT.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnXemCT.setForeground(new java.awt.Color(255, 51, 51));
        btnXemCT.setText("Xem chi tiết");
        getContentPane().add(btnXemCT, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 175, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Mã món:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 58, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/NênHD.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMabanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMabanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMabanActionPerformed

    private void tblBangHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangHDMouseClicked
        int row = tblBangHD.getSelectedRow();
        txtMahd.setText(tblBangHD.getValueAt(row, 0).toString());
        txtTenmon.setText(tblBangHD.getValueAt(row, 2).toString());
        txtMamon.setText(tblBangHD.getValueAt(row, 1).toString());
        txtSoluong.setText(tblBangHD.getValueAt(row, 4).toString());
        txtGia.setText(tblBangHD.getValueAt(row, 3).toString());
        txtMaban.setText(tblBangHD.getValueAt(row, 5).toString());
        txtManv.setText(tblBangHD.getValueAt(row, 6).toString());
    }//GEN-LAST:event_tblBangHDMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        themHoadon();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
xoaHoadon();
    }//GEN-LAST:event_btnXoaActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyHoaDon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXemCT;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBangHD;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaban;
    private javax.swing.JTextField txtMahd;
    private javax.swing.JTextField txtMamon;
    private javax.swing.JTextField txtManv;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextField txtTenmon;
    private javax.swing.JTextField txtTongtien;
    // End of variables declaration//GEN-END:variables
        public void LoadDaTaToTabel(){
          model.setRowCount(0);
        try {
            
             con = DatabaseHelper.getconnecDb();
             st = con.createStatement();
             System.out.println("Kết nối thành công");
             String sql = "select * from HOADON ";
             rs = st.executeQuery(sql);
         
                 while(rs.next()){
                Vector row = new Vector();
                row.add(rs.getString(1));
                row.add(rs.getString(2));
                row.add(rs.getString(3));
                row.add(rs.getString(4));
                row.add(rs.getString(5));
                row.add(rs.getString(6));
                row.add(rs.getString(7));
                model.addRow(row);
            }
            tblBangHD.setModel(model);
            con.close();
         } catch (Exception e) {
             System.out.println(e);
        }
    }
    public void tongThanhTien() {
        int gia = Integer.parseInt(txtGia.getText());
        int soluong = Integer.parseInt(txtSoluong.getText());
        txtTongtien.setText(String.valueOf(gia * soluong));
    }
        public boolean validateFo(){
        if(txtMahd.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Chưa nhập mã hóa đơn");
            return false;
        }
        if(txtTenmon.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Chưa nhập họ tên món ăn");
            return false;
        }
        if(txtMamon.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Chưa nhập mã món ăn");
            return false;
        }
        if(txtSoluong.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Chưa nhập số lượng");
            return false;
        }
        if(txtGia.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Chưa nhập giá");
            return false;
        }
        if(txtMaban.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Chưa nhập mã bàn");
            return false;
        }
        if(txtManv.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Chưa nhập mã nhân viên");
            return false;
        }
        return true;
    }
        
    public void themHoadon(){
        int rs = 0;
        if(validateFo()){
            try {
            
             con = DatabaseHelper.getconnecDb();
             System.out.println("Kết nối thành công");
                String sql = "insert into HOADON values(?,?,?,?,?,?,?)";
                stmt = con.prepareStatement(sql);
                stmt.setString(1, txtMahd.getText());
                stmt.setString(2, txtTenmon.getText());
                stmt.setString(3, txtMamon.getText());
                stmt.setString(4, txtSoluong.getText());
                stmt.setString(5,txtGia.getText());
                stmt.setString(6, txtMaban.getText());
                stmt.setString(7, txtManv.getText());
                tongThanhTien();
                rs = stmt.executeUpdate(); 
                con.close();
            if(rs > 0){
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                LoadDaTaToTabel();
            }else{
                JOptionPane.showMessageDialog(this, "Thêm không thành công");
            }
                
            } catch (Exception e) {
             System.out.println(e);
             }
        }
    }
        public void xoaHoadon(){
            int rs = 0;
        try {
                con = DatabaseHelper.getconnecDb();
                String sql = "delete from HOADON where MAHD=?";
                stmt = con.prepareStatement(sql);
                stmt.setString(1, txtMahd.getText());
                rs = stmt.executeUpdate(); 
                con.close();
            if(rs > 0){
                JOptionPane.showMessageDialog(this, "Xóa thành công");
                LoadDaTaToTabel();
            }else{
                JOptionPane.showMessageDialog(this, "Xóa không thành công");
            }
        } catch (Exception e) {
             System.out.println(e);
             }
    }
}
