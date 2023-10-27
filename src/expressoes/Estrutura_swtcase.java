package expressoes;

import java.util.Scanner;

public class Estrutura_swtcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia = switch (x) {
            case 1 -> "domingo";
            case 2 -> "segunda";
            case 3 -> "terça";
            case 4 -> "quarta";
            case 5 -> "quinta";
            case 6 -> "sexta";
            case 7 -> "sábado";
            default -> "valor inválido";
        };

        System.out.println("Dia da semana é = " + dia);
        sc.close();
    }
}
