package Main;

import java.util.Locale;
public class Exercicio_eu {
    public static void main(String[] args) {

        String product1 = "computer";
        String product2 = "office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products: "  );
        System.out.println(product1 + ", which price is $ " + price1);
        System.out.println(product2 +  ", which price is $ " + price2);

        System.out.println("Record: " + age + "  old, code " + code  + " and gender: " + gender);

        System.out.println("Measure with eight decimal places: " + measure);
        System.out.println("Rouded (three decimal places) %.3f %n : " + measure);
        Locale.setDefault(Locale.US);
        System.out.println("US decimal point %.3f %n: " + measure);
    }
}
