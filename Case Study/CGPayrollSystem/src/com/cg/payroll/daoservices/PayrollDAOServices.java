package com.cg.payroll.daoservices;

import java.sql.SQLException;
import java.util.List;

import com.cg.payroll.beans.Employee;

public interface PayrollDAOServices {
	int insertEmployee(Employee employee)throws SQLException;
	boolean updateEmployee(Employee employee)throws SQLException;
	boolean deleteEmployee(int employeeId)throws SQLException;
	Employee getEmployee(int employeeId)throws SQLException;
	List<Employee>getAllEmployees()throws SQLException;
}
