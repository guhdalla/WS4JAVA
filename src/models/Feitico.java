package models;

public class Feitico extends Carta {

    private Integer valor;

    public Feitico(String nome, String descricao, Integer valor) {
        super(nome, descricao);
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Feitico{" +
                "valor=" + valor +
                '}';
    }
}
