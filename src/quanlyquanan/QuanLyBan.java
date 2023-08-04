/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlyquanan;

import Class.Clock;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DatabaseHelper;

/**
 *
 * @author Admin
 */
public class QuanLyBan extends javax.swing.JFrame {
    PreparedStatement stmt = null;
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    String[] cols = {"Mã bàn", "Số lượng", "Trạng thái bàn "};
    DefaultTableModel model = new DefaultTableModel(cols, 0);
    /**
     * Creates new form QuanLyBan
     */
    public QuanLyBan() {
        initComponents();
        setTitle("Quản lý bàn ghế");
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaBan = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        txtTrangThai = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnDatBan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBan = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lblClock = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("QUẢN LÝ BÀN & GHẾ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 264, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã bàn:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 69, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Số lượng: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Trạng thái :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 86, -1));

        txtMaBan.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(txtMaBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, 30));

        txtSoLuong.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(txtSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 120, 30));

        txtTrangThai.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(txtTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 110, 30));

        btnThem.setBackground(new java.awt.Color(255, 255, 204));
        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThem.setText("Thêm ");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 85, -1));

        btnXoa.setBackground(new java.awt.Color(255, 255, 204));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 86, -1));

        btnDatBan.setBackground(new java.awt.Color(255, 255, 204));
        btnDatBan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDatBan.setForeground(new java.awt.Color(255, 0, 0));
        btnDatBan.setText("Đặt Bàn");
        btnDatBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatBanActionPerformed(evt);
            }
        });
        getContentPane().add(btnDatBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 96, -1));

        tblBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã bàn", "Số lượng", "Trạng thái"
            }
        ));
        tblBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 300, 490));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/BG_BA.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 660, 590));
        getContentPane().add(lblClock, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
       if(checkForm()){
                   ThemBan();
       }

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed

        XoaBan();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBanMouseClicked
      Display();
    }//GEN-LAST:event_tblBanMouseClicked

    private void btnDatBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatBanActionPerformed

    }//GEN-LAST:event_btnDatBanActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Clock clockThread = new Clock(lblClock);
        Thread t1 = new Thread(clockThread);
        t1.start();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(QuanLyBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyBan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatBan;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClock;
    private javax.swing.JTable tblBan;
    private javax.swing.JTextField txtMaBan;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTrangThai;
    // End of variables declaration//GEN-END:variables
    public void LoadDaTaToTabel() {
        model.setRowCount(0);
        try {

            con = DatabaseHelper.getconnecDb();
            st = con.createStatement();
            System.out.println("Kết nối thành công");
            String sql = "select * from BAN";
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Vector row = new Vector();
                row.add(rs.getString(1));
                row.add(rs.getString(2));
                row.add(rs.getString(3));
                model.addRow(row);
            }
            tblBan.setModel(model);
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void Display() {
        int row = tblBan.getSelectedRow();
        txtMaBan.setText(tblBan.getValueAt(row, 0).toString());
        txtSoLuong.setText(tblBan.getValueAt(row, 1).toString());
        txtTrangThai.setText(tblBan.getValueAt(row, 2).toString());

    }   
    public void ThemBan() {
        int rs = 0;
        try {
            con = DatabaseHelper.getconnecDb();
            String sql = "insert into BAN values(?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, txtMaBan.getText());
            stmt.setString(2, txtSoLuong.getText());
            stmt.setString(3, txtTrangThai.getText());
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
    public void XoaBan(){
        int rs = 0;
        try {
            con = DatabaseHelper.getconnecDb();
            String sql = "delete from BAN where  MABAN = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1,txtMaBan.getText());
            rs = stmt.executeUpdate(); 
            if(rs > 0){
                JOptionPane.showMessageDialog(this, "Xóa thành công");
                LoadDaTaToTabel();
                clearForm();
            }else{
                JOptionPane.showMessageDialog(this, "Xóa không thành công");
            }
        } catch (Exception e) {
                System.out.println(e);
        }          
    }
    public void clearForm(){
        txtMaBan.setText("");
        txtSoLuong.setText("");
        txtTrangThai.setText("");
    }
    public boolean checkForm(){
        if (txtMaBan.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã không được bỏ trống", "Chu y", 1);
            txtMaBan.requestFocus();
            return false;
        } else {
            try {
                con = DatabaseHelper.getconnecDb();
                System.out.println("Kết nối thành công");
                String SQL = "select * from BAN where Maban=?";
                stmt = con.prepareStatement(SQL);
                stmt.setString(1, txtMaBan.getText());
                rs = stmt.executeQuery();
                
                if (rs.isBeforeFirst() == false) {
                    //chưa có mã
                    stmt.execute();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Mã đã tồn tại");
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }

        }
        if (txtSoLuong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Số lượng đang bỏ trống");
            return false;
        }
        try {
            Integer.parseInt(txtSoLuong.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Số lượng phải là số");
            return false;
        }
         if (txtTrangThai.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Trạng thái đang bỏ trống");
            return false;
        }       
        return true;
    }
}
