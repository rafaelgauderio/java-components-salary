package services;

import entities.Employee;

public class SalaryService {

    // inversão de controle
    // não devem ser instanciados aqui os objetos os quais a Salary Service depende
    // exemplo da bateria de carro. O motor depende da bateria, mas a bateria não fica dento
    // do motor. Se tiver que trocar a bateria, não preciso mexer no motor

    // injeção de dependecia
    // precisamos injetar a dependecia no salaryService
    // podemos usar o construtor, métodos set, container de injeção de dependência
    private TaxService taxService;
    private PensionService pensionService;

    public SalaryService(TaxService taxService, PensionService pensionService) {
        this.taxService = taxService;
        this.pensionService = pensionService;
    }

    public double netSalary(Employee emp) {
        double grossSalary = emp.getGrossSalary();
        double netSalary = grossSalary - taxService.incomeTax(grossSalary) - pensionService.discount(grossSalary);
        return  netSalary;
    }
}
