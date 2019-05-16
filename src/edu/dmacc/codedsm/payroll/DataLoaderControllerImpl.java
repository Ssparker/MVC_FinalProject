package edu.dmacc.codedsm.payroll;

public class DataLoaderControllerImpl implements DataLoaderController {
    private DataLoaderService service;

    public DataLoaderControllerImpl(DataLoaderService service) {
        this.service = service;
    }

    @Override
    public void initial_load() {

        service.employeeFileReader();

    }
}
