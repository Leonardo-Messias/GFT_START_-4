package QuestionThree;

public class Pagamento {
    private Double valorPagar, ValorRecebido;

    public Pagamento(Double valorPagar, Double valorRecebido) {
        this.valorPagar = valorPagar;
        ValorRecebido = valorRecebido;
    }

    public void pagar() {
        if (getValorPagar() > getValorRecebido()) {
            System.out.println("Ainda faltam R$" + (getValorRecebido() - getValorPagar()));
        } else if (getValorPagar().equals(getValorRecebido())) {
            System.out.println("Pagamento efetuado, nao sera necessario troco");
        } else {
            Double troco = (getValorRecebido() - getValorPagar());
            System.out.println("Troco de: R$" + troco);
        }
    }


    public Double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(Double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public Double getValorRecebido() {
        return ValorRecebido;
    }

    public void setValorRecebido(Double valorRecebido) {
        ValorRecebido = valorRecebido;
    }
}
