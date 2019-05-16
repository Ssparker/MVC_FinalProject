package edu.dmacc.codedsm.payroll;

public class EmployeeViewImpl implements EmployeeView {
    private Employee employee;

    public EmployeeViewImpl(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void render() {
        System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getHoursWorked());
    }
}
