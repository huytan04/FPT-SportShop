/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import java.util.ArrayList;
import poly.edu.Model.SanPhamChiTiet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import poly.edu.uitility.DBcontext;
/**
 *
 * @author Admin
 */
public class SanPhamChiTietDao extends EduSysDAO<SanPhamChiTiet, String>{
    private Integer insert;
    private Integer update;
    private Integer delete;
    @Override
    public void insert(SanPhamChiTiet entity) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void update(SanPhamChiTiet entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public ArrayList<SanPhamChiTiet> selectAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public SanPhamChiTiet selectById(String key) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    protected ArrayList<SanPhamChiTiet> selectBySQL(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
