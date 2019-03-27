package com.aptechglobal.web.employee.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class BaseDAO  {
	 
    private static Connection conn       = null; 
    private CallableStatement cs         = null; 
    private PreparedStatement ps         = null;
    private Statement         st         = null; 
    private ResultSet         rs         = null; 
    private static final int  FETCH_SIZE = 50; 
    
    public static Connection getNewConnection(){
		Connection connection=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","admin");
		}catch(ClassNotFoundException e){
			
		}catch(SQLException e1){
			
		}
		return connection;
	}
     
    protected PreparedStatement prepareStatement(String inSQL)  throws SQLException{ 
    	if(conn == null) { 
            conn = getNewConnection(); 
        } 
        if(ps != null) { 
            ps.close(); 
            ps = null; 
        } 
        ps = conn.prepareStatement(inSQL); 
        
        return ps; 
    } 
    
    protected Statement createStatement()  throws SQLException{ 
    	 
        //log.info("prepareStatement --->: Trying to set the PreparedStatement"); 
        if(conn == null) { 
            conn = getNewConnection(); 
        } 
        if(st != null) { 
            //st.close(); 
            st = null; 
        } 
        st = conn.createStatement(); 
        st.setFetchSize(FETCH_SIZE); 
        return st; 
    } 
    
    protected int update() throws SQLException { 
       int i = ps.executeUpdate(); 
       return i; 
    } 
    
    protected int save() throws SQLException { 
    	int i = ps.executeUpdate(); 
        return i; 
    } 
    
    protected ResultSet query() throws SQLException { 
    	 
        if(rs != null) { 
            //rs.close(); 
            rs = null; 
        } 
        rs = ps.executeQuery(); 
        
        return rs; 
    } 
    
    protected ResultSet queryStatement(String sqlString) throws SQLException { 
    	 
        if(rs != null) { 
            rs.close(); 
            rs = null; 
        } 
        rs = st.executeQuery(sqlString); 
       
        return rs; 
    } 
    
    protected void cleanup() throws Exception{ 
    	 
       if(this.rs != null) { 
            try { 
                rs.close(); 
                rs = null; 
            } catch(Exception e) { 
               
            } 
        } 
 
        if(this.ps != null) { 
            try { 
                ps.close(); 
                ps = null; 
            } catch(Exception e) { 
               
            } 
        } 
        if(this.cs != null) { 
            try { 
                cs.close(); 
                cs = null; 
            } catch(Exception e) { 
              
            } 
        } 
 
        try { 
            if(conn != null) { 
                if( !conn.isClosed()) { 
                    conn.close(); 
                    conn = null; 
                } 
            } 
        } catch(java.sql.SQLException se) { 
   
 
        } 
    } 
}
