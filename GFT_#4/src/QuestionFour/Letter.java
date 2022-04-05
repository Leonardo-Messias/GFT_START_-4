package QuestionFour;

public class Letter {
    private String letras;

    public String getLetras() {
        return letras;
    }

    public void setLetras(String letras) {
        this.letras = letras;
    }

    public Letter(String letras) {
        this.letras = letras;
    }

    public void VogalCons() {
        if (getLetras().equalsIgnoreCase("a")) {
            System.out.println("Está letra é uma: Volgal");
        } else if (getLetras().equalsIgnoreCase("e")) {
            System.out.println("Está letra é uma: Volgal");
        } else if (getLetras().equalsIgnoreCase("i")) {
            System.out.println("Está letra é uma: Volgal");
        } else if (getLetras().equalsIgnoreCase("u")) {
            System.out.println("Está letra é uma: Volgal");
        }else{
            System.out.println("Está letra é uma: Consoante");
        }


    }
}
