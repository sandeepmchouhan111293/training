package com.cg.payroll.services;
import java.util.List;
import com.cg.payroll.beans.Employee;
import com.cg.payroll.exceptions.EmployeeDetailsNotFoundException;
import com.cg.payroll.exceptions.PayrollServicesDownException;
public interface PayrollServices {
	int acceptEmployeeDetails(Employee employee)throws PayrollServicesDownException;
	int calculateEmployeeNetSalary(int employeeId) throws EmployeeDetailsNotFoundException,PayrollServicesDownException;
	Employee getEmployeeDetails(int employeeid)throws EmployeeDetailsNotFoundException,PayrollServicesDownException;
	List<Employee> getAllEmployeeDetails()throws PayrollServicesDownException;
}