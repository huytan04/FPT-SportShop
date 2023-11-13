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
public class SanPhamChiTiet {
    int id;
    int idSanPham;
    int idMauSac;
    int idSize;
    int idHang;
    int idChatLieu;
    int idDeGiay;
    String moTa;
    int SoLuongTon;
    String trangThai;
    Date createAt;
    int createBy;
    Date updateAt;
    int updateBy;
    boolean deleted;

    public SanPhamChiTiet() {
    }

    public SanPhamChiTiet(int id, int idSanPham, int idMauSac, int idSize, int idHang, int idChatLieu, int idDeGiay, String moTa, int SoLuongTon, String trangThai, Date createAt, int createBy, Date updateAt, int updateBy, boolean deleted) {
        this.id = id;
        this.idSanPham = idSanPham;
        this.idMauSac = idMauSac;
        this.idSize = idSize;
        this.idHang = idHang;
        this.idChatLieu = idChatLieu;
        this.idDeGiay = idDeGiay;
        this.moTa = moTa;
        this.SoLuongTon = SoLuongTon;
        this.trangThai = trangThai;
        this.createAt = createAt;
        this.createBy = createBy;
        this.updateAt = updateAt;
        this.updateBy = updateBy;
        this.deleted = deleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }

    public int getIdMauSac() {
        return idMauSac;
    }

    public void setIdMauSac(int idMauSac) {
        this.idMauSac = idMauSac;
    }

    public int getIdSize() {
        return idSize;
    }

    public void setIdSize(int idSize) {
        this.idSize = idSize;
    }

    public int getIdHang() {
        return idHang;
    }

    public void setIdHang(int idHang) {
        this.idHang = idHang;
    }

    public int getIdChatLieu() {
        return idChatLieu;
    }

    public void setIdChatLieu(int idChatLieu) {
        this.idChatLieu = idChatLieu;
    }

    public int getIdDeGiay() {
        return idDeGiay;
    }

    public void setIdDeGiay(int idDeGiay) {
        this.idDeGiay = idDeGiay;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuongTon() {
        return SoLuongTon;
    }

    public void setSoLuongTon(int SoLuongTon) {
        this.SoLuongTon = SoLuongTon;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public int getCreateBy() {
        return createBy;
    }

    public void setCreateBy(int createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public int getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(int updateBy) {
        this.updateBy = updateBy;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "SanPhamChiTiet{" + "id=" + id + ", idSanPham=" + idSanPham + ", idMauSac=" + idMauSac + ", idSize=" + idSize + ", idHang=" + idHang + ", idChatLieu=" + idChatLieu + ", idDeGiay=" + idDeGiay + ", moTa=" + moTa + ", SoLuongTon=" + SoLuongTon + ", trangThai=" + trangThai + ", createAt=" + createAt + ", createBy=" + createBy + ", updateAt=" + updateAt + ", updateBy=" + updateBy + ", deleted=" + deleted + '}';
    }
    
}
