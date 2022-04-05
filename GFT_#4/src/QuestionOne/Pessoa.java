//package QuestionOne;
//
//public class Pessoa {
//    int idade, cont = 1;
//    double altura, somaAltura = 0, alturaX = 0, peso;
//    int idadeX = 0, pesoX = 0;
//
//    public Pessoa(int idade, double altura, double peso) {
//        this.idade = idade;
//        this.altura = altura;
//        this.peso = peso;
//    }
//
//    public void pessoa(){
//        do{
//        System.out.println("Digite uma idade");
//        this.setIdade(idade);
//
//        System.out.println("Digite uma altura");
//        this.setAltura(altura);
//
//        System.out.println("Digite um peso");
//        this.setPeso(pesoX);
//
//        // pessoas com idade maior que 50 anos
//        if(idade > 50){
//            idadeX++; // conta a qntde de pessoas
//        }
//
//        // pessoas com idade entre 10 e 20
//        if( (idade >= 10) && (idade <= 20) ){
//            alturaX++;   // conta a qntde de pessoas
//            somaAltura = altura + somaAltura; // soma a altura atual com a enterior
//        }
//
//        // pessoas com peso menor que 40
//        if(peso < 40){
//            pesoX++;    // conta a qntde de pessoas
//        }
//
//        cont++;
//        System.out.println("\n");
//    }while(cont <= 4);
//
//        if(idadeX > 0){
//        // se existirem pessoas acima de 50 anos
//        System.out.println("Qntde de pessoas com idade acima de 50 anos: " + idadeX + "\n");
//    } else{
//        // se não existirem pessoas acima de 50 anos
//        System.out.println("Nenhuma pessoa tem acima de 50 anos \n");
//    }
//
//        if(alturaX > 0){
//        // se existirem pessoas entre 10 e 20 anos
//        System.out.println("A média de pessoas entre 10 e 20 anos é: " + (somaAltura / alturaX) + "\n");
//    } else{
//        // se não existirem pessoas entre 10 e 20 anos
//        System.out.println("Nenhuma pessoa tem idade entre 10 e 20 anos \n");
//    }
//
//        if(pesoX > 0){
//        // se existirem pessoas com peso inferior a 40 kilos
//        System.out.println("A percentagem de pessoas com peso inferior a 40 é: " + (pesoX * 100 / (cont - 1)) + " %");
//    } else{
//        // se não existirem pessoas com peso inferior a 40 kilos
//        System.out.println("Nenhuma pessoa tem peso inferior a 40 kilos");
//    }
//
//
//}
//
//    public int getIdade() {
//        return idade;
//    }
//
//    public void setIdade(int idade) {
//        this.idade = idade;
//    }
//
//    public int getCont() {
//        return cont;
//    }
//
//    public void setCont(int cont) {
//        this.cont = cont;
//    }
//
//    public double getAltura() {
//        return altura;
//    }
//
//    public void setAltura(double altura) {
//        this.altura = altura;
//    }
//
//    public double getSomaAltura() {
//        return somaAltura;
//    }
//
//    public void setSomaAltura(double somaAltura) {
//        this.somaAltura = somaAltura;
//    }
//
//    public double getAlturaX() {
//        return alturaX;
//    }
//
//    public void setAlturaX(double alturaX) {
//        this.alturaX = alturaX;
//    }
//
//    public double getPeso() {
//        return peso;
//    }
//
//    public void setPeso(double peso) {
//        this.peso = peso;
//    }
//
//    public int getIdadeX() {
//        return idadeX;
//    }
//
//    public void setIdadeX(int idadeX) {
//        this.idadeX = idadeX;
//    }
//
//    public int getPesoX() {
//        return pesoX;
//    }
//
//    public void setPesoX(int pesoX) {
//        this.pesoX = pesoX;
//    }
//}
