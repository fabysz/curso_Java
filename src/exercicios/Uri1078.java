package exercicios;

import java.util.Scanner;
public class Uri1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int produto = i * N;
            System.out.println(i + " X " + N + " = " + produto );
        }

        sc.close();
    }
}

// tabuada




