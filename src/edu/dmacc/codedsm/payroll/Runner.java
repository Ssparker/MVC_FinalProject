package edu.dmacc.codedsm.payroll;

import java.util.Scanner;

import static java.lang.System.out;

public class Runner {
    private static Object EmployeeViewImpl;

    public static void main(String[] args) {

        EmployeeRepository repository = new EmployeeRepositoryImpl();
        DataLoaderService service = new DataLoaderServiceImpl(repository);
        DataLoaderController controller = new DataLoaderControllerImpl(service);
        controller.initial_load();

        EmployeeService service_emp = new EmployeeServiceImpl(repository);
        EmployeeController controller_emp = new EmployeeControllerImpl(service_emp);
        AllEmployeeView view = controller_emp.getAllEmployee();

        PayrollService service_payroll = new PayrollServiceImpl(repository);
        PayrollController controller_pay = new PayrollControllerImpl(service_payroll);

        app(view, controller_emp, controller_pay);

    }

    private static void app(AllEmployeeView viewer, EmployeeController controller_empl, PayrollController controller_pay){
        while (true) {
            String list = "Type L to List all known Employees:";
            String update = "Type U to update employee's hours:";
            String process = "Type P to process payroll:";
            String exit_program = "Type E to exit the program:";
            Scanner in = new Scanner(System.in);
            out.println();
                    out.println(list + "\n" + update + "\n" + process + "\n" + exit_program);
                    String input = in.next();
                    if (input.equalsIgnoreCase("L")) {
                        viewer.render();

                    }else  if (input.equalsIgnoreCase("U")) {
                        Scanner inUpdate = new Scanner(System.in);
                        out.print("Enter the employee ID to update: ");
                        String inputId = inUpdate.next();
                        if (inputId != null) {
                            Scanner i = new Scanner(System.in);
                            out.print("update the hours employee worked: ");
                    Double hours = i.nextDouble();
                    controller_empl.updatedEmployee(inputId, hours);
                            viewer = new AllEmployeeViewImpl();
                           // out.println(EmployeeViewImpl); // need to list updated employee   getting null
                } else {
                    out.println("Invalid input");
                }

            } else if (input.equalsIgnoreCase("P")) {
                        String fullInput = in.nextLine();
                        //Scanner in = new Scanner(System.in);
                        out.println("Processing Payroll");
                        controller_pay.processPayroll();
                        viewer = new payrollServiceImpl();  //  need to process payroll

                System.exit(0);

            }else  if (input.equalsIgnoreCase("E")) {

                System.exit(0);

                out.close(); // close program
            }else {
                out.println("Not allowed character");
            }
        }

    }

    private static class payrollServiceImpl implements AllEmployeeView {
        @Override
        public void render() {

        }
    }
}
