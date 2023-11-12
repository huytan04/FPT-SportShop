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
public class MauSac {
    int id;
    String maMau;
    String tenMau;
    String trangThai;
    Date createAt;
    int createBy;
    Date updateAt;
    int updateBy;
    boolean deleted;

    public MauSac() {
    }

    public MauSac(int id, String maMau, String tenMau, String trangThai, Date createAt, int createBy, Date updateAt, int updateBy, boolean deleted) {
        this.id = id;
        this.maMau = maMau;
        this.tenMau = tenMau;
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

    public String getMaMau() {
        return maMau;
    }

    public void setMaMau(String maMau) {
        this.maMau = maMau;
    }

    public String getTenMau() {
        return tenMau;
    }

    public void setTenMau(String tenMau) {
        this.tenMau = tenMau;
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
        return "MauSac{" + "id=" + id + ", maMau=" + maMau + ", tenMau=" + tenMau + ", trangThai=" + trangThai + ", createAt=" + createAt + ", createBy=" + createBy + ", updateAt=" + updateAt + ", updateBy=" + updateBy + ", deleted=" + deleted + '}';
    }
    
}
