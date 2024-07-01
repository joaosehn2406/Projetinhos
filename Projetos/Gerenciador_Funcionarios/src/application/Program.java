package Projeto1.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Projeto1.entities.Employee;
import Projeto1.entities.OutsourcedEmployee;

public class Program {

    public Program() {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = in.nextInt();

        List<Employee> emp = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d data: \n", i + 1);
            System.out.print("Outsourced (y/n)? ");
            String answer = in.next();
            System.out.print("Name: ");
            String name = in.next();
            System.out.print("Hours: ");
            int hours = in.nextInt();
            System.out.print("Value per Hour: ");
            double valuePerHour = in.nextDouble();

            if (answer.equals("y")) {
                System.out.print("Additional charge: ");
                double additionalCharge = in.nextDouble();
                emp.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                emp.add(new Employee(name, hours, valuePerHour));
            }
        }
        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee employee : emp) {
            System.out.println(employee.getName() + " - $ " + employee.payment(employee.getHours(), employee.getValuePerHour()));
        }
        in.close();
    }

    public static void main(String[] args) {
        new Program();
    }
}