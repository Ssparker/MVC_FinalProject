package edu.dmacc.codedsm.payroll;

import java.util.List;

public class AllEmployeeViewImpl implements AllEmployeeView {
    private List<Employee> employees;

    public AllEmployeeViewImpl(List<Employee> employees) {
        this.employees = employees;
    }

    public AllEmployeeViewImpl() {

    }

    @Override
    public void render() {
        for (int i = 0 ; i < employees.size(); i++){
            System.out.println(employees.get(i));

        }

    }
}
