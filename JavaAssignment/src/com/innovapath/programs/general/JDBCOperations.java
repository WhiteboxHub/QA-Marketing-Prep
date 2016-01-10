package com.innovapath.programs.general;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCOperations {
static Connection jdbcConnection;
static Statement stmt;
static
{
try{	Class.forName("oracle.jdbc.driver.OracleDriver");  
	  
	
jdbcConnection=DriverManager.getConnection(  
	"jdbc:oracle:thin:@hr.cwjgdp1wxdy2.us-west-1.rds.amazonaws.com:1521:ORCL","whiteboxqa","Excellence");  
}catch(SQLException   e)
{
	e.printStackTrace();
}catch(ClassNotFoundException e)
{
	e.printStackTrace();
}

}
public static void selectQuery() throws SQLException
{
	 stmt=jdbcConnection.createStatement();  
	 ResultSet rs=stmt.executeQuery("select * from DEPT"); 
	 System.out.println("Data From Department Table");
	 System.out.println("DEPTNO"+"\t"+"DEPTNAME"+"\t"+"LOC");
	 while(rs.next()) {
	 System.out.println( rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));  
	 }
	 }
	public static void main(String[] args) throws SQLException  {
		try {
			JDBCOperations.selectQuery();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally
		{
			jdbcConnection.close();
			
		}
		

	}

}
