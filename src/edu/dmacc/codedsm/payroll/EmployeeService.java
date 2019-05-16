package edu.dmacc.codedsm.payroll;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    List<Employee> getEmployeeList();
    void updateEmployeeHours(Integer id, Double hours);
}
