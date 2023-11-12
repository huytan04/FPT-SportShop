/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import java.util.ArrayList;
import poly.edu.Model.MauSac;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import poly.edu.uitility.DBcontext;
/**
 *
 * @author Admin
 */
public class MauSacDao extends EduSysDAO<MauSac, String>{
    private Integer insert;
    private Integer update;
    private Integer delete;
    @Override
    public void insert(MauSac entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(MauSac entity) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public ArrayList<MauSac> selectAll() {
         ArrayList<MauSac> listMauSac = new ArrayList<>();
        String sql = "SELECT * FROM MauSac";

        try (Connection cn = DBcontext.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("ID");
                String maMau = rs.getString("MaMau");
                String tenMau = rs.getString("TenMau");
                String trangThai = rs.getString("TrangThai");
                Date createAt = rs.getDate("CreateAt");
                int createBy = rs.getInt("CreateBy");
                Date updateAt = rs.getDate("UpdateAt");
                int updateBy = rs.getInt("UpdateBy");
                boolean deleted = rs.getBoolean("is_deleted");

                MauSac mauSac = new MauSac(id, maMau, tenMau, trangThai, createAt, createBy, updateAt, updateBy, deleted);
                listMauSac.add(mauSac);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listMauSac;
    }

    @Override
    public MauSac selectById(String key) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    protected ArrayList<MauSac> selectBySQL(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
