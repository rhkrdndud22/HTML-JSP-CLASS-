package com.mh.org3.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Component;

@Component
//@Service
//@Repository 도 가능하다 제일 많이 사용하는게 Component다.
public class DBManager {

	public void insertTest(String para1, String para2) {
		
		Connection conn = null;
		PreparedStatement pstmt= null;
		
		try {
			// 이 클래스 파일이 없으면 catch 구문으로 넘기고 아니면 진행 하는 것이 Class for name 이다.
			//port란 윈도우에 존재하는데 ip는 전화번호 port는 내선번호로 생각하면 편하다.
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wy","root","1234");
			pstmt = conn.prepareStatement("insert into test values(?,?)");
			pstmt.setString(1, para1);
			pstmt.setString(2, para2);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(conn!=null)
					conn.close();
				if(pstmt != null)
					pstmt.close();
				}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
public void deleteTest(String para1) {
		
		Connection conn = null;
		PreparedStatement pstmt= null;
		
		try {
			// 이 클래스 파일이 없으면 catch 구문으로 넘기고 아니면 진행 하는 것이 Class for name 이다.
			//port란 윈도우에 존재하는데 ip는 전화번호 port는 내선번호로 생각하면 편하다.
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wy","root","1234");
			pstmt = conn.prepareStatement("delete from test where para1=(?)");
			pstmt.setString(1, para1);
			
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(conn!=null)
					conn.close();
				if(pstmt != null)
					pstmt.close();
				}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}


public void updateTest(String para1,String para2) {
	
	Connection conn = null;
	PreparedStatement pstmt= null;
	
	try {
		// 이 클래스 파일이 없으면 catch 구문으로 넘기고 아니면 진행 하는 것이 Class for name 이다.
		//port란 윈도우에 존재하는데 ip는 전화번호 port는 내선번호로 생각하면 편하다.
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wy","root","1234");
		pstmt = conn.prepareStatement("update test set para1=(?) where para1=(?)");
		
		pstmt.setString(1, para1);
		pstmt.setString(2, para2);
		
		pstmt.executeUpdate();
	}catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			if(conn!=null)
				conn.close();
			if(pstmt != null)
				pstmt.close();
			}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
}

