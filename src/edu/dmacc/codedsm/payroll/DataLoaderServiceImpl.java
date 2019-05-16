package edu.dmacc.codedsm.payroll;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataLoaderServiceImpl implements DataLoaderService {

    private final ThreadLocal<EmployeeRepository> repository = new ThreadLocal<EmployeeRepository>();

    public DataLoaderServiceImpl(EmployeeRepository repository) {
        this.repository.set(repository);
    }

    @Override
    public void employeeFileReader() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "initial_load.txt"));
            String line = reader.readLine();
            while (line != null) {
                //System.out.println(line);
                // System.out.println(line.split(",")[2]);
                repository.get().saveEmployee(createEmployee(line));

                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Employee createEmployee(String employeeFile) {

        Employee employee = new Employee(Integer.parseInt(employeeFile.split(",")[0]), employeeFile.split(",")[1], Double.parseDouble( employeeFile.split(",")[2]),0.0);

        return employee;
    }
}
