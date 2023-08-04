/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlyquanan;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DatabaseHelper;

/**
 *
 * @author Admin
 */
public class QuanLyMonAn extends javax.swing.JFrame {

    PreparedStatement stmt = null;
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    String[] cols = {"Mã món", "Tên món", "Giá món", "Số lượng", "Đánh giá", "Mã bàn"};
    DefaultTableModel model = new DefaultTableModel(cols, 0);

    /**
     * Creates new form QuanLyMonAn
     */
    public QuanLyMonAn() {
        initComponents();
        setTitle("Quản lý món ăn");
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMamon = new javax.swing.JTextField();
        txtTenMon = new javax.swing.JTextField();
        txtSoluong = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDanhGia = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBangMon = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtMaBan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("QUẢN LÝ MÓN ĂN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 250, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã món:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 95, 75, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tên món ăn:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 87, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Số lượng:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 78, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Giá:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 37, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Đánh giá:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 78, -1));

        txtMamon.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(txtMamon, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 150, -1));
        getContentPane().add(txtTenMon, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 320, -1));
        getContentPane().add(txtSoluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 320, -1));
        getContentPane().add(txtGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 320, -1));

        txtDanhGia.setColumns(20);
        txtDanhGia.setRows(5);
        jScrollPane1.setViewportView(txtDanhGia);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 350, 121));

        tblBangMon.setModel(new javax.swing.table.DefaultTableModel(
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
        tblBangMon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBangMonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblBangMon);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 550, 160));

        btnThem.setBackground(new java.awt.Color(204, 255, 255));
        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThem.setText("Thêm ");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, 34));

        btnSua.setBackground(new java.awt.Color(204, 255, 255));
        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 100, 35));

        btnXoa.setBackground(new java.awt.Color(204, 255, 255));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 100, 34));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Mã bàn");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        txtMaBan.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(txtMaBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 100, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/backgroud.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (checkForm()) {
            ThemMonAn();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblBangMonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangMonMouseClicked
        Display();
    }//GEN-LAST:event_tblBangMonMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        SuaMonAn();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed

        XoaMonAn();
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
            java.util.logging.Logger.getLogger(QuanLyMonAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyMonAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyMonAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyMonAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyMonAn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblBangMon;
    private javax.swing.JTextArea txtDanhGia;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaBan;
    private javax.swing.JTextField txtMamon;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextField txtTenMon;
    // End of variables declaration//GEN-END:variables
    public void LoadDaTaToTabel() {
        model.setRowCount(0);
        try {

            con = DatabaseHelper.getconnecDb();
            st = con.createStatement();
            System.out.println("Kết nối thành công");
            String sql = "select * from MONAN A\n"
                    + "inner join  BAN B \n"
                    + "on A.MABAN = B.MABAN";
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Vector row = new Vector();
                row.add(rs.getString(1));
                row.add(rs.getString(2));
                row.add(Double.parseDouble(rs.getString(3)));
                row.add(Integer.parseInt(rs.getString(4)));
                row.add(rs.getString(5));
                row.add(rs.getString(6));
                model.addRow(row);
            }
            tblBangMon.setModel(model);
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void Display() {
        int row = tblBangMon.getSelectedRow();
        txtMamon.setText(tblBangMon.getValueAt(row, 0).toString());
        txtTenMon.setText(tblBangMon.getValueAt(row, 1).toString());
        txtSoluong.setText(tblBangMon.getValueAt(row, 3).toString());
        txtGia.setText(tblBangMon.getValueAt(row, 2).toString());
        txtDanhGia.setText(tblBangMon.getValueAt(row, 4).toString());
        txtMaBan.setText(tblBangMon.getValueAt(row, 5).toString());

    }

    public void ThemMonAn() {
        int rs = 0;
        try {
            con = DatabaseHelper.getconnecDb();
            String sql = "insert into MONAN values(?,?,?,?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, txtMamon.getText());
            stmt.setString(2, txtTenMon.getText());
            stmt.setDouble(3, Double.parseDouble(txtGia.getText()));
            stmt.setInt(4, Integer.parseInt(txtSoluong.getText()));
            stmt.setString(5, txtDanhGia.getText());
            stmt.setString(6, txtMaBan.getText());
            rs = stmt.executeUpdate();
            if (rs > 0) {
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                LoadDaTaToTabel();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm không thành công");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void SuaMonAn() {
        int rs = 0;
        try {
            con = DatabaseHelper.getconnecDb();
            String sql = "update MONAN set TENMON = ?, GIAMON = ?,SOLUONG = ?,DANHGIA = ?,MABAN = ? where MAMON = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(6, txtMamon.getText());
            stmt.setString(1, txtTenMon.getText());
            stmt.setDouble(2, Double.parseDouble(txtGia.getText()));
            stmt.setInt(3, Integer.parseInt(txtSoluong.getText()));
            stmt.setString(4, txtDanhGia.getText());
            stmt.setString(5, txtMaBan.getText());
            rs = stmt.executeUpdate();
            if (rs > 0) {
                JOptionPane.showMessageDialog(this, "Sửa thành công");
                LoadDaTaToTabel();
            } else {
                JOptionPane.showMessageDialog(this, "Sửa không thành công");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void XoaMonAn() {
        int rs = 0;
        try {
            con = DatabaseHelper.getconnecDb();
            String sql = "delete from MONAN where  MAMON = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, txtMamon.getText());
            rs = stmt.executeUpdate();
            if (rs > 0) {
                JOptionPane.showMessageDialog(this, "Xóa thành công");
                LoadDaTaToTabel();
            } else {
                JOptionPane.showMessageDialog(this, "Xóa không thành công");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean checkForm() {
        if (txtMamon.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã món ăn đang bỏ trống");
            return false;
        }
        if (txtMaBan.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã bàn đang bỏ trống");
            return false;
        }
        if (txtTenMon.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Tên nhân viên đang bỏ trống");
            return false;
        }
        if (txtSoluong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Số lượng đang bỏ trống");
            return false;
        }
        if (txtGia.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Địa chỉ đang bỏ trống");
            return false;
        }
        try {
            Double.parseDouble(txtGia.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Giá phải là số");
            return false;
        }
        if (txtDanhGia.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Lương đang bỏ trống");
            return false;
        }
        return true;
    }
}
