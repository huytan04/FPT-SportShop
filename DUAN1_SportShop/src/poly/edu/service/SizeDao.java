/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import java.util.ArrayList;
import poly.edu.Model.Size;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import poly.edu.uitility.DBcontext;
/**
 *
 * @author Admin
 */
public class SizeDao extends EduSysDAO<Size, String>{
    private Integer insert;
    private Integer update;
    private Integer delete;
    @Override
    public void insert(Size entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Size entity) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public ArrayList<Size> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Size selectById(String key) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    protected ArrayList<Size> selectBySQL(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
