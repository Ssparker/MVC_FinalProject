package edu.dmacc.codedsm.payroll;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> getAllEmployee();
    Employee getEmployee(Integer id);
    void saveEmployee(Employee employee);
}
