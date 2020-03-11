package com;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class A6 {

	void m1() throws SQLException{
		Connection con = DriverManager.getConnection("");
	}
	public static void main(String[] args) {
		A6 a4 = new A6();
		try {
			a4.m1();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
