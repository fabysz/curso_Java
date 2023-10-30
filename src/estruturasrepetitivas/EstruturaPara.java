package estruturasrepetitivas;

import java.util.Scanner;
public class EstruturaPara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         int soma = 0;
        /* i=i + 1 pode ser colocado como i++
         */
         for(int i=0; i<N; i=i+1){
             int x = sc.nextInt();
             soma = soma + x ;
         }
        System.out.println(soma);
        sc.close();
    }
}

