/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.Model.entity;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class HoaDon {
    
    private String maHoaDon;
    private Date ngayTao;
    private Date ngayThanhToan;
    private Date ngayXacNhan;
    private String tenKH;
    private double tongTien;
    private String trangThai;
    private String diaChi;
    private String sdt;
    private double soTienGiam;
    private String hinhThucThanhToan;
    private Date ngayShip;
    private Date ngayMuonNhan;
    private double phiShip;
    
    public HoaDon() {
    }

    public HoaDon(String maHoaDon, Date ngayTao, Date ngayThanhToan, Date ngayXacNhan, String tenKH, double tongTien, String trangThai, String diaChi, String sdt, double soTienGiam, String hinhThucThanhToan, Date ngayShip, Date ngayMuonNhan, double phiShip) {
        this.maHoaDon = maHoaDon;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.ngayXacNhan = ngayXacNhan;
        this.tenKH = tenKH;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.soTienGiam = soTienGiam;
        this.hinhThucThanhToan = hinhThucThanhToan;
        this.ngayShip = ngayShip;
        this.ngayMuonNhan = ngayMuonNhan;
        this.phiShip = phiShip;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public Date getNgayXacNhan() {
        return ngayXacNhan;
    }

    public void setNgayXacNhan(Date ngayXacNhan) {
        this.ngayXacNhan = ngayXacNhan;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public double getSoTienGiam() {
        return soTienGiam;
    }

    public void setSoTienGiam(double soTienGiam) {
        this.soTienGiam = soTienGiam;
    }

    public String getHinhThucThanhToan() {
        return hinhThucThanhToan;
    }

    public void setHinhThucThanhToan(String hinhThucThanhToan) {
        this.hinhThucThanhToan = hinhThucThanhToan;
    }

    public Date getNgayShip() {
        return ngayShip;
    }

    public void setNgayShip(Date ngayShip) {
        this.ngayShip = ngayShip;
    }

    public Date getNgayMuonNhan() {
        return ngayMuonNhan;
    }

    public void setNgayMuonNhan(Date ngayMuonNhan) {
        this.ngayMuonNhan = ngayMuonNhan;
    }

    public double getPhiShip() {
        return phiShip;
    }

    public void setPhiShip(double phiShip) {
        this.phiShip = phiShip;
    }
    
    
}
