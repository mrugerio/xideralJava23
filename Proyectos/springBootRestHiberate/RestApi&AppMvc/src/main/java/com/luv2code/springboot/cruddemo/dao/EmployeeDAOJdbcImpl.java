package com.luv2code.springboot.cruddemo.dao;

import java.sql.*;
import java.util.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOJdbcImpl implements EmployeeDAO {

	@Autowired
	DataSource dataSource;

	@Override
	public List<Employee> findAll() {
		System.out.println("Implementación DAO con JDBC findAll(): " + dataSource);

		List<Employee> listaEmpleados = new ArrayList<>();

		String sql = "select * from employee";

		try (Connection myConn = dataSource.getConnection();
			Statement myStmt = myConn.createStatement();
			ResultSet myRs = myStmt.executeQuery(sql);) {

			// process result set
			while (myRs.next()) {

				// retrieve data from result set row
				int id = myRs.getInt("id");
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String email = myRs.getString("email");

				// create new student object
				Employee tempEmployee = new Employee(id, firstName, lastName, email);

				// add it to the list of students
				listaEmpleados.add(tempEmployee);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listaEmpleados;
	}

	@Override
	public Employee findById(int theId) {
		
		System.out.println("Implementación DAO con JDBC findById(): ");
		Employee theEmployee = null;

		try (Connection myConn = dataSource.getConnection();
			PreparedStatement myStmt = createPreparedStatement(myConn, theId);
			ResultSet myRs = myStmt.executeQuery();) {

			// retrieve data from result set row
			if (myRs.next()) {
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String email = myRs.getString("email");

				// use the studentId during construction
				theEmployee = new Employee(theId, firstName, lastName, email);
			} else {
				throw new SQLException("Could not find employee id: " + theId);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return theEmployee;
	}

	private PreparedStatement createPreparedStatement(Connection con, int empleadoId) throws SQLException {
		String sql = "select * from employee where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, empleadoId);
		return ps;
	}

	@Override
	public void save(Employee theEmployee) {
		String sql = "";

		if (theEmployee.getId() == 0)
			sql = "insert into employee (first_name, last_name, email) values (?, ?, ?)";
		else
			sql = "update employee set first_name=?, last_name=?, email=? where id=?";

		try (Connection myConn = dataSource.getConnection();
			 PreparedStatement myStmt = myConn.prepareStatement(sql)) {

			myStmt.setString(1, theEmployee.getFirstName());
			myStmt.setString(2, theEmployee.getLastName());
			myStmt.setString(3, theEmployee.getEmail());

			if (theEmployee.getId() != 0)
				myStmt.setInt(4, theEmployee.getId());

			myStmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteById(int theId) {
		
		try (Connection myConn = dataSource.getConnection(); 
			 PreparedStatement myStmt = myConn.prepareStatement("delete from employee where id=?")) {
			
			myStmt.setInt(1, theId);
			myStmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
