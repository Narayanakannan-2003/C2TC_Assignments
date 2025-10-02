package com.C2C_corejava.assignment.employees;

public class Employee {
	private String name;
    private String employeeId;
    private double salary;

    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    protected void increaseSalary(double amount) {
        this.salary += amount;
    }

    public String getDetails() {
        return String.format("Name: %s, ID: %s, Salary: %.2f",
                             name, employeeId, salary);
    }

    @Override
    public String toString() {
        return getDetails();
    }

}


