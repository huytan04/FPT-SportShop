/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import java.util.ArrayList;
import java.util.Date;
import poly.edu.Model.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import poly.edu.uitility.DBcontext;
/**
 *
 * @author Admin
 */
public class SanPhamDao extends EduSysDAO<SanPham, String>{
    private Integer insert;
    private Integer update;
    private Integer delete;
    @Override
    public void insert(SanPham entity) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void update(SanPham entity) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public ArrayList<SanPham> selectAll() {
         ArrayList<SanPham> listSanPham = new ArrayList<>();
        String sql = "SELECT * FROM SanPham";

        try (Connection cn = DBcontext.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("ID");
                String ten = rs.getString("Ten");
                String trangThai = rs.getString("TrangThai");
                Date createAt = rs.getDate("CreateAt");
                int createBy = rs.getInt("CreateBy");
                Date updateAt = rs.getDate("UpdateAt");
                int updateBy = rs.getInt("UpdateBy");
                boolean deleted = rs.getBoolean("is_deleted");

                SanPham sanPham = new SanPham(id, ten, trangThai, createAt, createBy, updateAt, updateBy, deleted);
                listSanPham.add(sanPham);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listSanPham;
    
        
    }

    @Override
    public SanPham selectById(String key) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    protected ArrayList<SanPham> selectBySQL(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
