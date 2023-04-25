import models.Personagem;
import models.PocaoDeDano;
import models.PocaoDeVida;

public class Main {
    public static void main(String[] args) {

        PocaoDeVida pocaoDeVida = new PocaoDeVida("Pocao de Vida", "Cura 5 de vida", 5);
        Personagem personagem1 = new Personagem("Thais Carla", "A maior barriga do mundo", 1, 2, 5);
        Personagem personagem2 = new Personagem("Sua Mae", "Gerreira com o seu chinelo guiado", 3, 1, 2);
        PocaoDeDano pocaoDeDano = new PocaoDeDano("Pocao de Dano", "Tira 5 de vida", 5);

        personagem1.defender();
        personagem2.atacar(personagem1);

        pocaoDeVida.enfeiticar(personagem1);
        pocaoDeDano.enfeiticar(personagem2);

    }
}