package edu.dmacc.codedsm.payroll;

public interface DataLoaderService {

    void employeeFileReader();
    Employee createEmployee(String employeFile);

}
