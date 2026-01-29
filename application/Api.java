package application;

import java.util.Locale;
import java.util.Scanner;

public class Api {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Gross salary: ");
        double grossSalary = input.nextDouble();
        double netSalary = grossSalary * 0.8;
        System.out.printf("Net salary U$: %.2f%n", netSalary );
        input.close();
    }

}
