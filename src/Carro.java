public class Carro {

    private String placa;
    private String modelo;
    private String cor;
    private int ano;
    private int velocidade;

    // Construtor
    public Carro(String placa, String modelo, String cor, int ano, int velocidade) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public Carro(String placa, String modelo, String cor, int ano) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velocidade = 0;
    }

    public Carro() {
    }

    void desligar() {
        System.out.println("Desligando o carro...");
    }

    void ligar() {
        System.out.println("Ligando o carro...");
    }

    void acelerar() {
        velocidade++;
    }

    void frear() {
        velocidade--;
    }

    void imprimir() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidade);
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
