package services;

public class BrazilianPensionService extends PensionService{


    @Override
    public double discount(double amount) {
        super.setPublicPension(0.06);
        super.setPrivatePension(0.04);
        return amount * (publicPension + privatePension);
    }
}
