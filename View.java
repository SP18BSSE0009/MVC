package project;

import java.sql.ResultSet;

public class View {
	public void viewData(ResultSet rs, String field) {
		try {
			while(rs.next()) {
				String data = rs.getString(field);
				System.out.println(field + "=" + data);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void AllData(ResultSet rs) {
		try {
			while(rs.next()) {
				String employeeId = rs.getString("EmployeeID");
				String firstName = rs.getString("FirstName");
				String lastName = rs.getString("LastName");
				String Gender = rs.getString("Gender");
				String HiredDate = rs.getString("HiredDate");
				int Salary = rs.getInt("Salary");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());// TODO: handle exception
		}
	}

}
