package QuestionTwo;

public class Letras {
    private String letra1, letra2;

    public Letras(String letra1, String letra2) {
        this.letra1 = letra1;
        this.letra2 = letra2;
    }

    public void tamanho(){
        System.out.println(getLetra1().length());
        System.out.println(getLetra2().length());
        System.out.println("--------------");
    }

    public String getLetra1() {
        return letra1;
    }

    public void setLetra1(String letra1) {
        this.letra1 = letra1;
    }

    public String getLetra2() {
        return letra2;
    }

    public void setLetra2(String letra2) {
        this.letra2 = letra2;
    }

}
