package com.cookie.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@SpringBootApplication
public class DemoApplication {
    static final String USER = "root";
    static final String PASS = "910613";
    static final String DB_URL = "jdbc:mysql://localhost:3306/blog";


    public static void main(String[] args) throws Exception {

		SpringApplication.run(DemoApplication.class, args);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn= DriverManager.getConnection(DB_URL,USER,PASS);
		Statement stmt = conn.createStatement();
		String sql;
		sql = "SELECT id, title, content FROM artical";
		ResultSet rs = stmt.executeQuery(sql);

		while(rs.next()){
			// ͨ���ֶμ���
			int id  = rs.getInt("id");
			String name = rs.getString("title");
			String url = rs.getString("content");

			// �������
			System.out.println("ID: " + id);
			System.out.println("title: " + name);
			System.out.println("content: " + url);
			System.out.print("\n");
		}
		// ��ɺ�ر�
		rs.close();
		stmt.close();
		conn.close();
    }
}
