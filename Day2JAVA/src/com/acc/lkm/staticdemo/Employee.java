package com.acc.lkm.staticdemo;

import java.util.Scanner;

public class Employee {
    int eid;
    static String organization = "Accenture";
    String location;
    static String project = "AvgBank";
    int salary;
    static Scanner sc = new Scanner(System.in);

    static {
        project = "Avanade";
    }

    Employee(int eid, String organization, String location, String project) {
        this.eid = eid;
        Employee.organization = organization;
        this.location = location;
        Employee.project = "AvgBank";
    }

    static String getEmployeeProject() {
        return project;
    }

    static void displayEmpSalary() {
        int[] salary = new int[3];
        System.out.println("Enter salaries for 3 employees (separated by spaces):");
        for (int i = 0; i < 3; i++) {
            salary[i] = sc.nextInt();
        }

        System.out.println("Salaries entered:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Employee " + (i+1) + " Salary: " + salary[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Updated Project Name: " + project);

        Employee emp1 = new Employee(1, "Accenture", "Kolkata", "");
        Employee emp2 = new Employee(2, "Accenture", "Delhi", "");

        System.out.println("Organization: " + organization);
        System.out.println("Current Project: " + getEmployeeProject());

        displayEmpSalary();
    }
}
