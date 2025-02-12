package udemy.exercicios4;

import java.util.Locale;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        int n, tc, tr, ts, tot, qtd;
        double pc, ps, pr;

        tot = 0;
        tc = 0;
        tr = 0;
        ts = 0;
        qtd = 0;
        pc = 0;
        ps = 0;
        pr = 0;

        System.out.println("Quantos casos de teste serao digitados? ");
        n = read.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println("Quantidade de cobaias: ");
                qtd = read.nextInt();
            System.out.println("Tipo de cobaia: ");
                char tp = read.next().charAt(0);

            if (tp == 'C') {
                tc = tc + qtd;
            }
            else if (tp == 'R') {
                tr = tr + qtd;
            }
            else if (tp == 'S') {
                ts = ts + qtd;
            }
           tot = tot + qtd;
        }

        pc = (double) tc / tot * 100;
        pr = (double) tr / tot * 100;
        ps = (double) ts / tot * 100;

        System.out.println("\nRELATORIO FINAL: ");
        System.out.println("Total: " + tot);
        System.out.println("Total de coelhos: " + tc);
        System.out.println("Total de ratos: " + tr);
        System.out.println("Total de sapos: " + ts);
        System.out.printf("Percentual de coelhos: %.2f%n", pc);
        System.out.printf("Percentual de ratos: %.2f%n", pr);
        System.out.printf("Percentual de sapos: %.2f%n", ps);

    }
}
