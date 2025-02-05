package com.Rishikesh.EmailRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.Rishikesh.EmailEntity.*;

public class FetchCelebrant {

	public static List<Employee> getTodayCelebrantDetails() {
		List<Employee> employees = new ArrayList<>();
		String query = "SELECT * FROM employee WHERE TO_CHAR(dob, 'MM-DD') = TO_CHAR(CURRENT_DATE, 'MM-DD')";

		try (Connection conn = DriverManager.getConnection(Constants.dbURL, Constants.dbUser, Constants.dbPassword);
				PreparedStatement stmt = conn.prepareStatement(query);
				ResultSet rs = stmt.executeQuery()) {

			while (rs.next()) {
				Employee emp = new Employee(rs.getInt("Id"), rs.getString("Name"), rs.getString("EmailId"),
						rs.getString("dob"));
				employees.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}
	
}
