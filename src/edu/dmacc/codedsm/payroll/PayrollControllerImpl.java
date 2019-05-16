package edu.dmacc.codedsm.payroll;

public class PayrollControllerImpl implements PayrollController {
    private PayrollService service;

    public PayrollControllerImpl(PayrollService service) {
        this.service = service;
    }

    @Override
    public void processPayroll() {
        service.calculateNetPay();

    }
}
