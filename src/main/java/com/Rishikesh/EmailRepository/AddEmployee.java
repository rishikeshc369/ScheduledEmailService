package com.Rishikesh.EmailRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.Rishikesh.EmailEntity.*;

public class AddEmployee {

    // Method to insert an employee into the database
    public void insertEmployee(Employee employee) {
        String query = "INSERT INTO employee (Id, Name, EmailId, dob) VALUES (?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(Constants.dbURL, Constants.dbUser, Constants.dbPassword);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, employee.getId());
            stmt.setString(2, employee.getName());
            stmt.setString(3, employee.getEmail());
            stmt.setString(4, employee.getDob());

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Employee added successfully!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
