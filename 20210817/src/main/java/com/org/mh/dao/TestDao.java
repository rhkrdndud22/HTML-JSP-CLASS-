package com.org.mh.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import com.org.mh.dto.TestDto;

@Component
public class TestDao {
	@Autowired
	DriverManagerDataSource datasource;
	
	@Autowired
	SqlSession sqlSession;
	
	public void doInsert() {
		sqlSession.insert("test.insert");
	}

	public ArrayList<TestDto> doList() {

		ArrayList<TestDto> list = new ArrayList<TestDto>();
		System.out.println("dolist");

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/mh?serverTimezone=Asia/Seoul&useSSL=false";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, "root", "1234");
			pstmt = conn.prepareStatement("select * from test");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				TestDto dto = new TestDto();
				dto.setPara1(rs.getString(1));
				dto.setPara2(rs.getString(2));
				list.add(dto);

				/*
				 * System.out.println("rs.getString(1)= " + rs.getString(1));
				 * System.out.println("rs.getString(2)= " + rs.getString(2));
				 * list.add(rs.getString(1)); list.add(rs.getString(2));
				 */
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

		return list;
	}

	public void mylist() {
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		try {
			conn = datasource.getConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
