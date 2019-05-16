package edu.dmacc.codedsm.payroll;

public interface EmployeeController {
    void updatedEmployee(String inputId,Double hours);
    AllEmployeeView getAllEmployee();
}
