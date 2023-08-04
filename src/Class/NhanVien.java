/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;


public class NhanVien {
    private String manv;
    private String hoten;
    private String namsinh;
    private String diachi;
    private double luong;
    private String ca;

    public NhanVien() {
    }

    public NhanVien(String manv, String hoten, String namsinh, String diachi, double luong, String ca) {
        this.manv = manv;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.diachi = diachi;
        this.luong = luong;
        this.ca = ca;
    }
 

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    
    
    
    
}
