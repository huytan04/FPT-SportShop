/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
import poly.edu.Model.DeGiay;
import poly.edu.uitility.DBcontext;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class DeGiayDao extends EduSysDAO<DeGiay, String>{
    private Integer insert;
    private Integer update;
    private Integer delete;
    @Override
    public void insert(DeGiay entity) {
        insert = 0;
        String sql = """
                    INSERT INTO DeGiay
                                          (Ten, TrangThai, create_at, create_by, update_at, update_by,deleted)
                    VALUES    (?,?,?,?,?,?)
                    """;
        try ( Connection cn = DBcontext.getConnection();  PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setObject(1, entity.getTen());
            ps.setObject(2, entity.getTrangThai());
            ps.setObject(3, entity.getCreateAt());
            ps.setObject(4, entity.getCreateBy());
            ps.setObject(5, entity.getUpdateAt());
            ps.setObject(6, entity.getUpdateBy());
            ps.setObject(7, entity.isDeleted());
            insert = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(DeGiay entity) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public ArrayList<DeGiay> selectAll() {
        ArrayList<DeGiay> listDeGiay = new ArrayList<>();
        String sql = "SELECT * FROM DeGiay";

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

                DeGiay deGiay = new DeGiay(id, ten, trangThai, createAt, createBy, updateAt, updateBy, deleted);
                listDeGiay.add(deGiay);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listDeGiay;
    }

    @Override
    public DeGiay selectById(String key) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    protected ArrayList<DeGiay> selectBySQL(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
