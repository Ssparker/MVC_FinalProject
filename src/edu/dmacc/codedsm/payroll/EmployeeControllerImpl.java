package edu.dmacc.codedsm.payroll;

public class EmployeeControllerImpl implements EmployeeController {
    private EmployeeService service;

    public EmployeeControllerImpl(EmployeeService service) {
        this.service = service;
    }


    @Override
    public void updatedEmployee(String inputId, Double hours) {
        service.updateEmployeeHours(Integer.parseInt(inputId),hours);

    }

    @Override
    public AllEmployeeView getAllEmployee() {

        return new AllEmployeeViewImpl(service.getEmployeeList());
    }
}
