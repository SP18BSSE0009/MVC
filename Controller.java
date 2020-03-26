package project;

import java.sql.SQLException;

public class Controller {
	private Model model;
	private View view;
	
	public Controller() {
		this.model = new Model();
		this.view = new View();
	}
	
	public void InsertData(String empId, String FirstName, String LastName, String Gender, String HiredDate, int Salary) throws SQLException {
		model.InsertData(empId, FirstName, LastName, Gender, HiredDate, Salary);
	}
	
	public void UpdateDate(String oEmpId, String nEId, String nFirstName, String nLastName, String nGender, String nHiredDate, int nSalary) throws SQLException {
		model.UpdateData(oEmpId, nEId, nFirstName, nLastName, nGender, nHiredDate, nSalary);
	}
	
	public void deleteData(String empId) throws SQLException {
		model.DeleteData(empId);
	}
	
	public void viewData(String field, String empId) throws SQLException {
		view.viewData(model.selectData(field, empId), field);
	}
	
	public void viewAllData() throws SQLException {
		view.AllData(model.selectAllData());
	}
	
	
	

}
