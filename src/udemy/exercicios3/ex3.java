package udemy.exercicios3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int opc, alc = 0, gas = 0, dies = 0;
        opc = read.nextInt();

        while (opc != 4) {
            switch (opc) {
                case 1:
                    alc = alc + 1;
                    break;
                case 2:
                    gas = gas + 1;
                    break;
                case 3:
                    dies = dies + 1;
                    break;
            }
            opc = read.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alc);
        System.out.println("Gasolina: " + gas);
        System.out.println("Diesel: " + dies);

        read.close();
    }
}
