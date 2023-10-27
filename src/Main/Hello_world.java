package Main;

import java.util.Locale;

public class Hello_world {
    public static void main(String[] args) {
        System.out.println("Olá mundo!!");
        System.out.println("Bom dia!");

        String nome = "Fabiana";
        int idade = 45;
        double altura = 1.58;
        char sexo = 'F';
        System.out.println("meu nome é " + nome + " e tenho " + idade + " anos " + "e minha altura é " + altura + " sexo " + sexo);

        double x = 10.35784;
        System.out.printf("%.2f\n" , x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);


    }
}
