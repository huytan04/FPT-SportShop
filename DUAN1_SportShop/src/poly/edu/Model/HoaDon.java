/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.Model;

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
    private String tenSP;
    private int soLuong;
    private String tenNV;
    private String maNV;
    private double tienGiamGia;
    private String maSP;
    private String thuongHieu;
    private int kichCo;
    private String nguoiTao;
    private String hang;
    private int size;

    public HoaDon() {
    }

    public HoaDon(String maHoaDon, Date ngayTao, Date ngayThanhToan, Date ngayXacNhan, String tenKH, double tongTien, String trangThai, String diaChi, String sdt, double soTienGiam, String hinhThucThanhToan, Date ngayShip, Date ngayMuonNhan, double phiShip, String tenSP, int soLuong, String tenNV, String maNV, double tienGiamGia, String maSP, String thuongHieu, int kichCo, String nguoiTao, String hang, int size) {
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
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.tenNV = tenNV;
        this.maNV = maNV;
        this.tienGiamGia = tienGiamGia;
        this.maSP = maSP;
        this.thuongHieu = thuongHieu;
        this.kichCo = kichCo;
        this.nguoiTao = nguoiTao;
        this.hang = hang;
        this.size = size;
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

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public double getTienGiamGia() {
        return tienGiamGia;
    }

    public void setTienGiamGia(double tienGiamGia) {
        this.tienGiamGia = tienGiamGia;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public int getKichCo() {
        return kichCo;
    }

    public void setKichCo(int kichCo) {
        this.kichCo = kichCo;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

   
    
}
