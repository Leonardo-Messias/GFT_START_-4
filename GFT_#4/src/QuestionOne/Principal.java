package QuestionOne;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade, cont = 1;
        double altura, somaAltura = 0, alturaX = 0, peso;
        int idadeX = 0, pesoX = 0;

        do{
            System.out.println("Digite uma idade");
            idade = entrada.nextInt();

            System.out.println("Digite uma altura");
            altura = entrada.nextDouble();

            System.out.println("Digite um peso");
            peso = entrada.nextDouble();

            // pessoas com idade maior que 50 anos
            if(idade > 50){
                idadeX++; // conta a qntde de pessoas
            }

            // pessoas com idade entre 10 e 20
            if( (idade >= 10) && (idade <= 20) ){
                alturaX++;   // conta a qntde de pessoas
                somaAltura = altura + somaAltura; // soma a altura atual com a enterior
            }

            // pessoas com peso menor que 40
            if(peso < 40){
                pesoX++;    // conta a qntde de pessoas
            }

            cont++;
            System.out.println("\n");
        }while(cont <= 10);

        if(idadeX > 0){
            // se existirem pessoas acima de 50 anos
            System.out.println("Qntde de pessoas com idade acima de 50 anos: " + idadeX + "\n");
        } else{
            // se não existirem pessoas acima de 50 anos
            System.out.println("Nenhuma pessoa tem acima de 50 anos \n");
        }

        if(alturaX > 0){
            // se existirem pessoas entre 10 e 20 anos
            System.out.println("A média de pessoas entre 10 e 20 anos é: " + (somaAltura / alturaX) + "\n");
        } else{
            // se não existirem pessoas entre 10 e 20 anos
            System.out.println("Nenhuma pessoa tem idade entre 10 e 20 anos \n");
        }

        if(pesoX > 0){
            // se existirem pessoas com peso inferior a 40 kilos
            System.out.println("A percentagem de pessoas com peso inferior a 40 é: " + (pesoX * 100 / (cont - 1)) + " %");
        } else{
            // se não existirem pessoas com peso inferior a 40 kilos
            System.out.println("Nenhuma pessoa tem peso inferior a 40 kilos");
        }
    }

}
