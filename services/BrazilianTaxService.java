package services;

public class BrazilianTaxService extends TaxService {

    @Override
    public double incomeTax(double amount) {
        return amount * 0.2;
    }

}
