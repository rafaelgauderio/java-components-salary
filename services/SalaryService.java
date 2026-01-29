package services;

import entities.Employee;

public class SalaryService {

    TaxService taxService = new TaxService();
    PensionService pensionService = new PensionService();

    public double netSalary(Employee emp) {
        double grossSalary = emp.getGrossSalary();
        double netSalary = grossSalary - taxService.incomeTax(grossSalary) - pensionService.discount(grossSalary);
        return  netSalary;
    }
}
