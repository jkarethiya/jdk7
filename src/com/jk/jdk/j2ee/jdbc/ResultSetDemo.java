package com.jk.jdk.j2ee.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDemo {

	public static void main(String[] args) throws Exception {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = getDatabaseConnection();
			con.setAutoCommit(false);
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

			rs = stmt.executeQuery("select RIC, COMPANY, LISTED_ON_EXCHANGE from stock");

			while (rs.next()) {
				System.out.println(rs.getString(2));

				if (rs.getString(1).equals("VOD.L")) {
					//rs.updateString("COMPANY", "VF122");
					//rs.updateRow();

					rs.moveToInsertRow();
					rs.updateString(1, "ART");
					rs.updateString(2, "AIRTEL");
					rs.updateString(3, "BO");
					rs.insertRow();
					
					break;
				}
			}

			con.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			con.rollback();

			rs.close();
			stmt.close();
			con.close();
		}
	}

	private static Connection getDatabaseConnection() {
		Connection connection = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "admin", "Oracle8588");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;
	}
}
