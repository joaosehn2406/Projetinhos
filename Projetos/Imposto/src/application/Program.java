package Projeto4.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Projeto4.entities.Company;
import Projeto4.entities.Individual;
import Projeto4.entities.TaxPayer;

public class Program {
    
    public Program(){

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();


        System.out.print("Enter the number of tax payers: ");
        int n = in.nextInt();
       
        for(int i = 0; i < n; i++) {
            System.out.printf("Tax payer #%d data: \n", i + 1);
            System.out.print("Individual or company (i/c)? ");
            char ch = in.next().charAt(0);
            System.out.print("Name: ");
            String name = in.next();
            System.out.print("Anual income: ");
            double income = in.nextDouble();
            if(ch == 'i') {
                System.out.print("Health expanditures: ");
                double health = in.nextDouble();
                list.add(new Individual(name, income, health));
            } 
            else {
                System.out.print("Number of employees: ");
                int employees = in.nextInt();
                list.add(new Company(name, income, employees));
            }
        }
        double totalTax = 0;
        System.out.println();
        System.out.println("TAXES PAID: ");
        for(TaxPayer tp : list) {
            totalTax += tp.taxes();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.taxes()));
        }
        System.out.printf("TOTAL TAXES: $ %.2f", totalTax);
        in.close();
    }

    public static void main(String[] args) {
        new Program();
    }
}
