package edu.dmacc.codedsm.payroll;

import java.util.List;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository repository;

    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Employee> getEmployeeList() {
        return repository.getAllEmployee();
    }

    @Override
    public void updateEmployeeHours(Integer id, Double hours) {
        Employee e = repository.getEmployee(id);
        if ( e.getId() == id){
            e.setHoursWorked(hours);
            repository.saveEmployee(e);
        }

    }
}
