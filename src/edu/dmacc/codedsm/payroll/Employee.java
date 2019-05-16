package edu.dmacc.codedsm.payroll;

public class Employee {
    private  Integer id;
    private  String name;
    private  Double HourlyRate;
    private  Double HoursWorked;


    public Employee(Integer id, String name, Double hourlyRate, Double hoursWorked) {
        this.id = id;
        this.name = name;
        HourlyRate = hourlyRate;
        HoursWorked = hoursWorked;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHourlyRate() {
        return HourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        HourlyRate = hourlyRate;
    }

    public Double getHoursWorked() {
        return HoursWorked;
    }

    public void setHoursWorked(Double hoursWorked) {
        HoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", HourlyRate=" + HourlyRate +
                ", HoursWorked=" + HoursWorked +
                '}';
    }
}
