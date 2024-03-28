package com.edu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.edu.vo.MemberVo;

public class MemberDAO {
	
	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("orecle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","1234");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public void insertMenber(MemberVo member) {
		try {
			Connection con = this.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into member values(?,?,?,?)");
			
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPassd());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getMail());
			pstmt.executeUpdate();
			
			pstmt.close();
			con.close();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
