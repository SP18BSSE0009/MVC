package project;

import java.sql.SQLException;

public class MVCTest {

	public static void main(String[] args) throws SQLException {
		Controller cnt = new Controller();
		cnt.viewAllData();
		cnt.viewData("FirstName", "asd");
	}
}
