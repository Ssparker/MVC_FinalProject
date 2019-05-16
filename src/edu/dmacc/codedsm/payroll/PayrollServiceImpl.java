package edu.dmacc.codedsm.payroll;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class PayrollServiceImpl implements PayrollService {

    PrintWriter out = null;
    private EmployeeRepository repository;

    public PayrollServiceImpl(EmployeeRepository repository) {

        this.repository = repository;

    }


    @Override

    public void calculateNetPay() {

        Double netPay;

        Double grossPay;

        Double taxRate = 1.2;

        List<Employee> workers = repository.getAllEmployee();


        for ( int i = 0; i < workers.size(); i++ ) {

            Employee e = workers.get(i);
            System.out.println(e);
            grossPay = e.getHourlyRate() * e.getHoursWorked();

            netPay = grossPay / taxRate;

            payrollResult(e.getId(), e.getName(), netPay);


        }


    }


    private void payrollResult(Integer employeeId, String name, Double netPay) {

        PrintWriter out = null;


        try {

            out = new PrintWriter(

                    new BufferedWriter(

                            new FileWriter("payroll_results.txt", true)));

            out.println(employeeId + " " + name + " " + String.format("%.2f",netPay));


        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            if (out != null) {

                out.close();
            }
        }
    }
}



