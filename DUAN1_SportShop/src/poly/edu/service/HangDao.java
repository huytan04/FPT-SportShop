/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import java.util.ArrayList;
import poly.edu.Model.HangGiay;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import poly.edu.uitility.DBcontext;
/**
 *
 * @author Admin
 */
public class HangDao extends EduSysDAO<HangGiay, String>{
    private Integer insert;
    private Integer update;
    private Integer delete;
    @Override
    public void insert(HangGiay entity) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void update(HangGiay entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<HangGiay> selectAll() {
        ArrayList<HangGiay> listHangGiay = new ArrayList<>();
        String sql = "SELECT * FROM HangGiay";

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

                HangGiay hangGiay = new HangGiay(id, ten, trangThai, createAt, createBy, updateAt, updateBy, deleted);
                listHangGiay.add(hangGiay);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listHangGiay;
    }

    @Override
    public HangGiay selectById(String key) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    protected ArrayList<HangGiay> selectBySQL(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
