package application;

import entities.Employee;
import services.*;

import java.util.Locale;
import java.util.Scanner;

public class Api {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Age: ");
        int age = input.nextInt();
        System.out.print("Gross salary: ");
        double grossSalary = input.nextDouble();

        //double netSalary = grossSalary * 0.8;
        Employee emp = new Employee(name, age, grossSalary);
        SalaryService salaryService = new SalaryService(new TaxService(), new PensionService());

        System.out.printf("Employee name: %s, age: %d, Net salary: U$ %.2f%n",emp.getName(), emp.getAge(), salaryService.netSalary(emp));
        input.close();

        SalaryService brazilianSalaryService = new SalaryService(new BrazilianTaxService(), new BrazilianPensionService());
        Employee brazilianEmp = new Employee("Claudia", 23, 10000);
        System.out.printf("Employee name: %s, age: %d, Net salary: U$ %.2f%n",brazilianEmp.getName(), brazilianEmp.getAge(), brazilianSalaryService.netSalary(brazilianEmp));
    }

}
