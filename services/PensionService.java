package services;

public class PensionService {

    private double publicPension=0.06;
    private double privatePension=0.03;

    public double getPublicPension() {
        return publicPension;
    }

    public void setPublicPension(double publicPension) {
        this.publicPension = publicPension;
    }

    public double getPrivatePension() {
        return privatePension;
    }

    public void setPrivatePension(double privatePension) {
        this.privatePension = privatePension;
    }

    public double discount(double amount) {
        return amount* (publicPension + privatePension);
    }
}
