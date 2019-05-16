package edu.dmacc.codedsm.payroll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private Map<Integer,Employee> employeeDatabase = new HashMap<>();

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> workers = new ArrayList<>();
        for (Map.Entry<Integer, Employee> entry :employeeDatabase.entrySet()) {
            workers.add(entry.getValue());
        }
        return workers;
    }

    @Override
    public Employee getEmployee(Integer id) {
        return employeeDatabase.get(id);
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeDatabase.put(employee.getId(),employee);


    }
}
