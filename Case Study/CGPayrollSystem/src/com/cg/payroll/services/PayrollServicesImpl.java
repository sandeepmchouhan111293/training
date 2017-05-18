package com.cg.payroll.services;

import java.util.List;

import com.cg.payroll.beans.Employee;
import com.cg.payroll.exceptions.EmployeeDetailsNotFoundException;
import com.cg.payroll.exceptions.PayrollServicesDownException;

public class PayrollServicesImpl implements PayrollServices {

	@Override
	public int acceptEmployeeDetails(Employee employee)
			throws PayrollServicesDownException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int calculateEmployeeNetSalary(int employeeId)
			throws EmployeeDetailsNotFoundException,
			PayrollServicesDownException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee getEmployeeDetails(int employeeid)
			throws EmployeeDetailsNotFoundException,
			PayrollServicesDownException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployeeDetails()
			throws PayrollServicesDownException {
		// TODO Auto-generated method stub
		return null;
	}

}
