package QuestionOne;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade, cont = 1;
        double altura, somaAltura = 0, alturaMed = 0, peso;
        int idadeMed = 0, PesoMed = 0;

        do {
            System.out.println("Digite sua idade:");
            idade = scan.nextInt();

            System.out.println("Digite sua altura: ");
            altura = scan.nextDouble();

            System.out.println("Digite seu peso: ");
            peso = scan.nextDouble();

            if (idade > 50) {
                idadeMed++;
            }


            if ((idade >= 10) && (idade <= 20)) {
                alturaMed++;
                somaAltura = altura + somaAltura;
            }


            if (peso < 40) {
                PesoMed++;
            }

            cont++;
            System.out.println("\n");
        } while (cont <= 10);

        if (idadeMed > 0) {
            System.out.println("Quantidade de pessoas com idade acima de 50 anos: " + idadeMed + "\n");
        } else {
            System.out.println("Nenhuma pessoa está acima de 50 anos \n");
        }

        if (alturaMed > 0) {
            System.out.println("A média de pessoas entre 10 e 20 anos é: " + (somaAltura / alturaMed));
        } else {
            System.out.println("Nenhuma pessoa está entre 10 e 20 anos \n");
        }

        if (PesoMed > 0) {
            System.out.println("A percentagem de pessoas com peso inferior a 40 é: " + (PesoMed * 100 / (cont - 1)) + " %");
        } else {
            System.out.println("Nenhuma pessoa tem peso inferior a 40 kilos");
        }
    }

}
