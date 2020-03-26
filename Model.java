package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Model {
	
	private String EmployeeID;
	private String FirstName;
	private String LastName;
	private String Gender;
	private String HiredDate;
	private int Salary;
	private Connection con;
	
	{
	try {
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
	String connectionUrl = "jdbc:sqlserver://INAM\\SQLEXPRESS;database=Employees;integratedSecurity=true;";
	con = DriverManager.getConnection(connectionUrl);
	System.out.println("Connection Successful!!!");
	}
	catch (Exception e){
		System.out.println("Connection Failed!!!");
	}
	}

	public void InsertData(String EmployeeID, String FirstName, String LastName, String Gender, String HiredDate, int Salary) throws SQLException {
		Statement statement = con.createStatement();
		statement.executeUpdate("INSERT INTO Employee VALUES('" + EmployeeID +"','" + FirstName + "','" + LastName + "','" + Gender + "','" + HiredDate + "','" + Salary+ "')");
		con.close();
	}

	
	public void DeleteData(String EmployeeID) throws SQLException {
		Statement statement = con.createStatement();
		statement.executeUpdate("delete from Employee where EmployeeID=" + "'EmployeeID'");
		con.close();
	}
	
	public void UpdateData(String oEmpId, String newEId, String nFirstName, String nLastName, String nGender, String nHiredDate,int nSalary) throws SQLException {
		Statement statement = con.createStatement();
		statement.executeUpdate("update Employee set EmployeeID= newEId"
																		+ "FirstName = nFirstName"
																		+ "LastName = nLastName"
																		+ "Gender = nGender"
																		+ "HiredDate = nHiredDate"
																		+ "Salary = nSalary"
																		+ "where EmployeeID = oEmpId" );
		con.close();
	}
	
	public ResultSet selectData(String field, String employeeID) throws SQLException {
		ResultSet rs = null;
		Statement st = con.createStatement();
		ResultSet rs1 = st.executeQuery("select" + "field" + "from Employee where EmployeeID= " + "employeeID");
		rs=rs1;
		return rs;
	}
	
	public ResultSet selectAllData() throws SQLException {
		ResultSet rs = null;
		Statement st = con.createStatement();
		ResultSet rs1 = st.executeQuery("select * from Employee");
		rs=rs1;
		return rs;
		
	}
	
	
	
	
	

}
