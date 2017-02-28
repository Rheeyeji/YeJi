package com.ktds.me.yeji.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ktds.me.yeji.vo.YejiVO;

public class YejiDaoImpl implements YejiDao {

	@Override
	public YejiVO getYejiInfo() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
		//1-1
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			conn = DriverManager.getConnection(oracleUrl, "YEJI","yeji");
		//1-2	
			
			StringBuffer query = new StringBuffer();
			query.append(" SELECT    NAME");
			query.append("           , AGE");
			query.append("           , TALL");
			query.append(" FROM      YEJI");
			
			stmt = conn.prepareStatement(query.toString());

			
			return ;
			
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
		

		return null;
	}

}
